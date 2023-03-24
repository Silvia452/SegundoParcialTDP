public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            return x == p.x && y == p.y;
        }
        return false;
    }
    public int hashCode() {
        return x * 31 + y;
    }

}
