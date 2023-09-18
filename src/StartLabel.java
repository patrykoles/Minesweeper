import javax.swing.*;
import java.awt.*;

public class StartLabel extends JLabel {
    public void createLabel(){
        this.setText("Welcome to SuperSaper");
        this.setForeground(Color.LIGHT_GRAY);

        ImageIcon image = new ImageIcon("mina.png");
        Image helpImg = image.getImage();
        Image resizedHelpImage = helpImg.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon resizedImage = new ImageIcon(resizedHelpImage);
        this.setIcon(resizedImage);

        this.setHorizontalTextPosition(JLabel.LEFT);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.TOP);

        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
    }
}
