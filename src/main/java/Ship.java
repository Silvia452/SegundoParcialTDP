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

    public boolean isSunk() {
        return hits >= size;
    }

    public boolean getShot(Point shotPoint) {
        if (startPoint.getX() == endPoint.getX()) {
            int startY = startPoint.getY();
            int endY = endPoint.getY();
            if (shotPoint.getX() == startPoint.getX() && shotPoint.getY() >= startY && shotPoint.getY() <= endY) {
                hits++;
                return true;
            }
        } else if (startPoint.getY() == endPoint.getY()) {
            int startX = startPoint.getX();
            int endX = endPoint.getX();
            if (shotPoint.getY() == startPoint.getY() && shotPoint.getX() >= startX && shotPoint.getX() <= endX) {
                hits++;
                return true;
            }
        }
        return false;
    }
}

