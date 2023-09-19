import javax.swing.*;
import java.awt.*;

public class ButtonCreator extends JButton {
    ButtonCreator(String text, int width, int height){
        this.setText(text);
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(false);
    }
}
