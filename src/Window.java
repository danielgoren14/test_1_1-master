import ash.college.graphics.Ball;
import ash.college.graphics.BallPanel;

import javax.swing.*;

import java.awt.event.KeyListener;

import static ash.college.utils.Constants.WINDOW_HEIGHT;
import static ash.college.utils.Constants.WINDOW_WIDTH;

//public class Window extends JFrame {
//    public static void main(String[] args) {
//        new Window();
//    }
//
//    public Window() {
//        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//        this.setResizable(false);
//        NewPanel newPanel = new NewPanel();
//        this.setVisible(true);
//        this.add(newPanel);
//        newPanel.addKeyListener(new NewKeyListener(newPanel.ball));
//        newPanel.removeKeyListener(getKeyListeners()[0]);
import javax.swing.*;
import static ash.college.utils.Constants.WINDOW_HEIGHT;
import static ash.college.utils.Constants.WINDOW_WIDTH;

public class Window extends JFrame {
    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.add(new BallMovement());
    }
}
