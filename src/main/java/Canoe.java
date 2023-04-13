public class Canoe extends Ship {
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
