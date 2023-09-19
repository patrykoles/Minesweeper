import javax.swing.*;
import java.awt.*;

public class PanelCreator extends JPanel {
    PanelCreator(Color color, int width, int height){
        this.setBackground(color);
        this.setPreferredSize(new Dimension(width, height));
    }
}
