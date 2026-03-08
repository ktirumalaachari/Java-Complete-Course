import java.awt.*;
import java.awt.event.*;

class KeyExample extends Frame implements KeyListener {

    Label l;

    KeyExample() {

        l = new Label("Press any key");
        add(l);

        addKeyListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyExample();
    }
}
