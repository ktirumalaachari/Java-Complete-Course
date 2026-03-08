import java.awt.*;

class MyFrame {
    public static void main(String[] args) {

        Frame f = new Frame("My First AWT");

        // Create components
        Label l = new Label("Enter Name:");
        TextField t = new TextField(20);
        Button b = new Button("Submit");

        // Set layout
        f.setLayout(new FlowLayout());

        // Add components
        f.add(l);
        f.add(t);
        f.add(b);

        // Frame settings
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
