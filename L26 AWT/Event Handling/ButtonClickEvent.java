import java.awt.*;
import java.awt.event.*;

class MyButtonEvent extends Frame implements ActionListener {

    Button b;
    Label l;

    MyButtonEvent() {

        // Create components
        b = new Button("Click Me");
        l = new Label("Button not clicked");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(b);
        add(l);

        // Register listener
        b.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        l.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new MyButtonEvent();
    }
}
