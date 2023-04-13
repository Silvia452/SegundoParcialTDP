import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private static List<Puerto> vertices = new ArrayList<>();
    private static List<Conexion> aristas = new ArrayList<>();

    public Grafo() {
        vertices = new ArrayList<>();
        aristas = new ArrayList<>();
    }

    public static void agregarPuerto(Puerto puerto) {
        vertices.add(puerto);
    }

    public static void agregarConexion(Conexion conexion) {
        aristas.add(conexion);
    }

    public List<Puerto> obtenerVertices() {
        return vertices;
    }

    public List<Conexion> obtenerAristas() {
        return aristas;
    }

    public static void imprimirGrafo() {
        System.out.println("Vertices: " + vertices);
        System.out.println("Aristas: " + aristas);
    }
}
