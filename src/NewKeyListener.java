import ash.college.graphics.Ball;
import ash.college.graphics.BallKeyListener;
import ash.college.graphics.BallPanel;

import java.awt.event.KeyEvent;

public class NewKeyListener extends BallKeyListener {
    public NewKeyListener (Ball ball) {
        super(ball);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> {
                ball.move(-20,0);
            }
            case KeyEvent.VK_UP -> {
                ball.move(0,-20);
            }
            case KeyEvent.VK_RIGHT  -> {
                ball.move(20,0);
            }
            case KeyEvent.VK_DOWN -> {
                ball.move(0,20);
            }
        }
    }
}
