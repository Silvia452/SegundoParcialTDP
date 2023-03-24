import java.util.ArrayList;
import java.util.List;

public class User {
    private boolean is_alive;
    List<Ship> ships = new ArrayList<>();

    public User(boolean is_alive, List<Ship> ships) {
        this.is_alive = is_alive;
        this.ships = ships;
    }

    public boolean isAlive() {
        return is_alive;
    }

    public boolean attack(Point shot_point, User user) throws IllegalArgumentException {
        if (user == null) {
            throw new IllegalArgumentException("Usuario no válido");
        }
        for (Ship ship : user.ships) {
            if (!ship.is_sunk() && ship.get_shot(shot_point)) {
                return true;
            }
        }
        return false;
    }

    public void get_shot(Point shot_point) {
        for (Ship ship : ships) {
            ship.get_shot(shot_point);
        }
    }

    public void die() {
        this.is_alive = false;
    }


}
