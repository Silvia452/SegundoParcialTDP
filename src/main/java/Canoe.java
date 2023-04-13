import java.util.ArrayList;

public class Canoe extends Ship {
    private ArrayList<Ship> ships = new ArrayList<>();
    public Canoe(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
        size = 1;
        hits = 0;
    }

    @Override
    public String toString() {
        return "Canoe{" +
                "size=" + size +
                ", hits=" + hits +
                '}';
    }
}
