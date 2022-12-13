import java.awt.*;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle {

    int id; // ID 1 for paddle1, id 2 for paddle2
    int yVelocity;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void setYDirection(int yDirection) {

    }

    public void move() {

    }

    public void draw(Graphics g) {

    }
}
