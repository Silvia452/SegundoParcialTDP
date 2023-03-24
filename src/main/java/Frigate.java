public class Frigate extends Ship {
    private int torpedoCount;

    public Frigate(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
        this.torpedoCount = 5;
    }

    public int getTorpedoCount() {
        return torpedoCount;
    }

    public void setTorpedoCount(int torpedoCount) {
        this.torpedoCount = torpedoCount;
    }

    public boolean launchTorpedo(Point targetPoint) {
        if (torpedoCount > 0) {
            torpedoCount--;
            return get_shot(targetPoint);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Frigate{" +
                "torpedoCount=" + torpedoCount +
                ", size=" + size +
                ", hits=" + hits +
                '}';
    }
}
