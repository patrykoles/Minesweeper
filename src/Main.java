import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        StartLabel startLabel = new StartLabel();
        frame.setLayout(null);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(0,120,800,480);
        bottomPanel.setBackground(Color.LIGHT_GRAY);
        frame.add(bottomPanel);

        JPanel topPanel = new JPanel();
        topPanel.setBounds(0,0, 800, 120);
        topPanel.setBackground(Color.DARK_GRAY);
        topPanel.setLayout(new BorderLayout());
        topPanel.add(startLabel);
        frame.add(topPanel);
        startLabel.createLabel();







    }
}