import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        jugar();
    }

    public static void jugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de batalla naval");

        User player1 = new User(true, createShipsPlayer1());
        User player2 = new User(true, createShipsPlayer2());

        //AÑADIR PUERTOS
        //Para agregar una arista con distancia entre dos puertos, podemos crear los puertos y la arista de la siguiente manera:
        Puerto puerto1 = new Puerto("Puerto Madero");
        Puerto puerto2 = new Puerto("Puerto de Rodas");
        Conexion conexion = new Conexion(puerto1, puerto2, 10);
        Grafo.agregarPuerto(puerto1);
        Grafo.agregarPuerto(puerto2);
        Grafo.agregarConexion(conexion);

        // Crear el scanner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Loop del juego
        while (player1.isAlive() && player2.isAlive()) {
            // Turno de player 1
            System.out.println("Es el turno de Player 1.");
            Point shotPoint = getShotPoint(scanner);
            boolean hit = player2.attack(shotPoint, player1);
            if (hit) {
                System.out.println("¡Le diste a un barco enemigo!");
            } else {
                System.out.println("Fallaste.");
            }

            // Verificar si player 1 ganó
            if (player2.ships.stream().allMatch(Ship::is_sunk)) {
                System.out.println("¡Player 1 ha ganado!");
                break;
            }

            // Turno de player 2
            System.out.println("Es el turno de Player 2.");
            shotPoint = getShotPoint(scanner);
            hit = player1.attack(shotPoint, player2);
            if (hit) {
                System.out.println("¡Le diste a un barco enemigo!");
            } else {
                System.out.println("Fallaste.");
            }

            // Verificar si player 2 ganó
            if (player1.ships.stream().allMatch(Ship::is_sunk)) {
                System.out.println("¡Player 2 ha ganado!");
                break;
            }
        }

        // Cerrar el scanner
        scanner.close();
    }

    private static List<Ship> createShipsPlayer1() {
        List<Ship> ships = new ArrayList<>();
        ships.add(new Battleship(new Point(0, 0), new Point(0, 3)));
        ships.add(new Frigate(new Point(2, 0), new Point(2, 2)));
        ships.add(new Canoe(new Point(4, 0), new Point(4, 0)));
        return ships;
    }

    private static List<Ship> createShipsPlayer2() {
        List<Ship> ships = new ArrayList<>();
        ships.add(new Battleship(new Point(2, 0), new Point(2, 3)));
        ships.add(new Frigate(new Point(3, 0), new Point(2, 1)));
        ships.add(new Canoe(new Point(4, 2), new Point(4, 2)));
        return ships;
    }

    private static Point getShotPoint(Scanner scanner) {
        System.out.print("Ingresa la coordenada X para disparar: ");
        int x = scanner.nextInt();
        System.out.print("Ingresa la coordenada Y para disparar: ");
        int y = scanner.nextInt();
        return new Point(x, y);
    }


}
