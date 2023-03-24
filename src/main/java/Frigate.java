public class Frigate extends Ship {
    private int torpedoCount;

    public Frigate(Point point, Point point1) {
        this.torpedoCount = 5;
        size = 3;
        hits = 0;
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
