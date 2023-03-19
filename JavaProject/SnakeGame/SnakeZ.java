import javax.swing.JFrame;

public class SnakeZ extends JFrame {

    public SnakeZ() {

        add(new BoardZ());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrame ex = new SnakeZ();
        ex.setVisible(true);
    }
}
