import java.util.ArrayList;
import java.util.List;

public class User {
    private boolean isAlive;
    List<Ship> ships;

    public User(boolean isAlive, List<Ship> ships) {
        this.isAlive = isAlive;
        this.ships = ships;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean attack(Point shotPoint, User opponent) throws IllegalArgumentException {
        if (opponent == null) {
            throw new IllegalArgumentException("Invalid opponent.");
        }
        for (Ship ship : opponent.ships) {
            if (!ship.is_sunk() && ship.get_shot(shotPoint)) {
                return true;
            }
        }
        return false;
    }

    public void getShot(Point shotPoint) {
        for (Ship ship : ships) {
            ship.get_shot(shotPoint);
        }
    }
}

