public class Ship {
    protected int size;
    protected int hits;
    private Point startPoint;
    private Point endPoint;
    private CardinalPoints direction;

    public Ship(Point startPoint, Point endPoint) {
        this.size = size;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.hits = 0;

        if (startPoint.getX() == endPoint.getX()) {
            if (startPoint.getY() < endPoint.getY()) {
                this.direction = CardinalPoints.NORTH;
            } else {
                this.direction = CardinalPoints.SOUTH;
            }
        } else if (startPoint.getY() == endPoint.getY()) {
            if (startPoint.getX() < endPoint.getX()) {
                this.direction = CardinalPoints.EAST;
            } else {
                this.direction = CardinalPoints.WEST;
            }
        } else {
            throw new IllegalArgumentException("Ship must be positioned horizontally or vertically.");
        }
    }

    public Ship() {

    }

    public int getSize() {
        return size;
    }

    public int getHits() {
        return hits;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public CardinalPoints getDirection() {
        return direction;
    }



    public boolean get_shot(Point shot_point) {
        if (startPoint != null && startPoint.getX() == endPoint.getX()) {
            int startY = startPoint.getY();
            int endY = endPoint.getY();
            if (shot_point.getX() == startPoint.getX() && shot_point.getY() >= startY && shot_point.getY() <= endY) {
                hits++;
                return true;
            }
        } else if (startPoint != null && startPoint.getY() == endPoint.getY()) {
            int startX = startPoint.getX();
            int endX = endPoint.getX();
            if (shot_point.getY() == startPoint.getY() && shot_point.getX() >= startX && shot_point.getX() <= endX) {
                hits++;
                return true;
            }
        }
        return false;
    }

    public boolean is_sunk() {
        return hits >= size;
    }
}

/*public abstract class Ship {
    protected int size;
    protected int hits;

    public boolean isSunk() {
        return hits >= size;
    }

    public void hit() {
        hits++;
    }

    public int getSize() {
        return size;
    }
}*/

