public class Canoe extends Ship {
    public Canoe(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    @Override
    public String toString() {
        return "Canoe{" +
                "size=" + size +
                ", hits=" + hits +
                '}';
    }
}