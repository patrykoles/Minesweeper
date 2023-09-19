import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameLauncher {
    MainFrame frame;
    PanelCreator board = new PanelCreator(Color.LIGHT_GRAY, 400, 400);
    private ArrayList<Field> fields;
    GameLauncher(int size){
        frame = new MainFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,100));
        board.setLayout(new GridLayout(size,size));


        fields = new ArrayList<>();
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++) {
                fields.add(new Field());
                //setting indexes of fields
                fields.get(i*size+j).setX(i);
                fields.get(i*size+j).setY(j);
            }
        }

        frame.add(board);
        frame.setVisible(true);
        for(int i = 0; i<size*size;i++){
            board.add(fields.get(i));
        }
    }
}
