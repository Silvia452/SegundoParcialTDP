public class Battleship extends Ship {
    private int missileCount;
    public Battleship(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
        this.missileCount = 10;
    }

    public int getMissileCount() {
        return missileCount;
    }

    public void setMissileCount(int missileCount) {
        this.missileCount = missileCount;
    }

    public boolean fireMissile(Point targetPoint) {
        if (missileCount > 0) {
            missileCount--;
            return get_shot(targetPoint);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "missileCount=" + missileCount +
                ", size=" + size +
                ", hits=" + hits +
                '}';
    }
}
