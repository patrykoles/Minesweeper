import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Field extends JButton {
    private State state;
    private boolean isBomb;
    private int x;
    private int y;
    private int numOfBombs;
    Field(){
        this.changeState(new DefaultState(this));
        this.setBackground(Color.GRAY);
        this.setFocusable(false);
        this.setOpaque(true);
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
    public int getNumOfBombs(){
        return numOfBombs;
    }

}
