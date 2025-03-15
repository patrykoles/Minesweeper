import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    MainFrame(){
        this.setSize(1100,750);
        this.setTitle("Minesweeper");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("boom.png");
        this.setIconImage(icon.getImage());
    }
}
