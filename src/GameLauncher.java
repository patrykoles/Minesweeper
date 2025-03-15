import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GameLauncher implements MouseListener {
    MainFrame frame;
    PanelCreator board = new PanelCreator(Color.LIGHT_GRAY, 840, 620);
    private ArrayList<Field> fields;
    private int flagsCounter;
    private int bombs;
    GameLauncher(int size){
        flagsCounter = 0;
        frame = new MainFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
        board.setLayout(new GridLayout(size,size));


        fields = new ArrayList<>();
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++) {
                fields.add(new Field());
                //setting indexes of fields
                fields.get(i*size+j).setX(i);
                fields.get(i*size+j).setY(j);
                fields.get(i*size+j).addMouseListener(this);
            }
        }

        BombSpawner spawner = new BombSpawner(fields);
        this.bombs = spawner.spawnBombs();
        //System.out.println(noBombs);
        BombSpotter spotter = new BombSpotter(fields);
        spotter.spotBombs();

        frame.add(board);
        frame.setVisible(true);
        for(int i = 0; i<size*size;i++){
            board.add(fields.get(i));
            /*if(fields.get(i).checkIfBomb()){
                fields.get(i).setText("B");
            }else if(fields.get(i).getNumOfBombs()>0){
                fields.get(i).setText(Integer.toString(fields.get(i).getNumOfBombs()));
            }*/
        }

    }

    public void increaseFlags(){
        this.flagsCounter++;
    }

    public void decreaseFlags(){
        this.flagsCounter--;
    }

    public void checkWin(){
        if(flagsCounter == bombs){
            for (Field f:fields) {
                f.changeState(new OpenedState(f));
            }
            JOptionPane.showMessageDialog(null, "Congratulations! You won!", "Victory", JOptionPane.INFORMATION_MESSAGE);

            frame.dispose();
            new MenuLauncher();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Field tempField = (Field) e.getSource();
        if(SwingUtilities.isLeftMouseButton(e)){
            tempField.leftClick(fields, this);
        }
        if(SwingUtilities.isRightMouseButton(e)){
            tempField.rightClick(fields, this);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
