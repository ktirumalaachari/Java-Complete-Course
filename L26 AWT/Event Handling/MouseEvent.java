import java.awt.*;
import java.awt.event.*;

class MouseExample extends Frame implements MouseListener {

    Label l;

    MouseExample() {

        l = new Label("Perform Mouse Action");
        add(l);

        addMouseListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseExample();
    }
}
