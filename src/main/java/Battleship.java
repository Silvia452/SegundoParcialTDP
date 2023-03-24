import java.util.Arrays;

public class Battleship extends Ship {
    private boolean[] compartments;

    public Battleship() {
        size = 5;
        hits = 0;
        compartments = new boolean[5];
        Arrays.fill(compartments, false);
    }

    public boolean isSunk() {
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
}
