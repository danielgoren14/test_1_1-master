import ash.college.graphics.BallPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;

public class BallMovement extends BallPanel{
    public BallMovement() {
        super();
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case VK_UP -> {ball.move(0, -20);}
                    case VK_DOWN -> {ball.move(0, 20);}
                    case VK_RIGHT -> {ball.move(20, 0);}
                    case VK_LEFT -> {ball.move(-20, 0);}
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        this.addKeyListener(keyListener);
    }
}