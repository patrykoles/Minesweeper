import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLauncher implements ActionListener {
    MainFrame frame;
    ButtonCreator button1 = new ButtonCreator("10x10",100,100);
    ButtonCreator button2 = new ButtonCreator("15x15",100,100);
    ButtonCreator button3 = new ButtonCreator("20x20",100,100);

    MenuLauncher(){
        frame = new MainFrame();
        StartLabel startLabel = new StartLabel();
        frame.setLayout(new BorderLayout());

        PanelCreator topPanel = new PanelCreator(Color.DARK_GRAY,800, 225);
        topPanel.setLayout(new BorderLayout());
        topPanel.add(startLabel, BorderLayout.CENTER);
        //topPanel.setBorder(new LineBorder(Color.YELLOW, 10));
        frame.add(topPanel, BorderLayout.NORTH);
        startLabel.createLabel();

        PanelCreator bottomPanel = new PanelCreator(Color.GRAY, 800, 500);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 200));
        //bottomPanel.setBorder(new LineBorder(Color.BLACK, 10));


        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        bottomPanel.add(button1);
        bottomPanel.add(button2);
        bottomPanel.add(button3);
        frame.add(bottomPanel, BorderLayout.SOUTH);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            frame.dispose();
            GameLauncher launcher1 = new GameLauncher(10);
        } else if (e.getSource() == button2) {
            frame.dispose();
            GameLauncher launcher2 = new GameLauncher(15);
        } else if (e.getSource() == button3) {
            frame.dispose();
            GameLauncher launcher3 = new GameLauncher(20);
        }
    }
}
