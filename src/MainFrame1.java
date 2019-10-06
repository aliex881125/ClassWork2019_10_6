import javax.swing.*;
import java.awt.*;

public class MainFrame1 extends JFrame {
    private Container cp;

    public MainFrame1() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        this.setLayout(null);
        this.setBounds(1200, 200, 600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}