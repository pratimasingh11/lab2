package lab2;

import java.awt.*;
import java.awt.event.*;

public class AWTMouseEventExample extends Frame implements MouseListener {

    private Label label;

    public AWTMouseEventExample() {
        setLayout(new FlowLayout());

        label = new Label("Mouse Event Demo");
        add(label);

        addMouseListener(this);

        setTitle("AWT Mouse Event Example");
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new AWTMouseEventExample();
    }
}

