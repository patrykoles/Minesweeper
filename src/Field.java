import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class Field extends JButton {
    private State state;
    private boolean isBomb;
    private int x;
    private int y;
    private int numOfBombs;
    Field(){
        this.setFont(new Font(null,Font.PLAIN,10));
        this.changeState(new DefaultState(this));
        this.setBackground(Color.GRAY);
        this.setFocusable(false);
        this.setOpaque(true);
        numOfBombs = 0;
    }

    public void changeState(State newState){
        this.state = newState;
    }
    public boolean checkIfBomb(){
        return isBomb;
    }
    public int getX(){
        return  x;
    }
    public int getY(){
        return y;
    }
    public void setBomb(){
        this.isBomb = true;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public void setNumOfBombs(int n){
        this.numOfBombs = n;
    }

    public void increaseNumOfBombs(){this.numOfBombs++;}
    public int getNumOfBombs(){
        return numOfBombs;
    }

    public void leftClick(ArrayList<Field> fields, GameLauncher launcher){
        state.leftClick(fields, launcher);
    }
    public void rightClick(ArrayList<Field> fields, GameLauncher launcher){
        state.rightClick(fields, launcher);
    }

    public State getState(){
        return state;
    }

    public void uncoverChain(ArrayList<Field> fields) {
        new Chain().uncover(fields,this);
    }

}
