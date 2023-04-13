import java.util.ArrayList;
import java.util.Arrays;

public class Battleship extends Ship {
    private boolean[] compartments;
    private ArrayList<Ship> ships = new ArrayList<>();

    public Battleship(Point point, Point point1) {
        size = 5;
        hits = 0;
        compartments = new boolean[5];
        Arrays.fill(compartments, false);
    }

    public boolean is_sunk() {
        for (boolean compartment : compartments) {
            if (!compartment) {
                return false;
            }
        }
        return true;
    }

    public void hit(int position) {
        compartments[position] = true;
        hits++;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "compartments=" + Arrays.toString(compartments) +
                ", size=" + size +
                ", hits=" + hits +
                '}';
    }
}
