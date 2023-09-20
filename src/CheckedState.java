import java.awt.*;
import java.util.ArrayList;

public class CheckedState implements State{
    private Field field;
    CheckedState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick(ArrayList<Field> fields, GameLauncher launcher) {

    }

    @Override
    public void rightClick(ArrayList<Field> fields, GameLauncher launcher) {
        field.setBackground(Color.GRAY);
        if(field.checkIfBomb()){
            launcher.decreaseFlags();
        }
        field.changeState(new DefaultState(field));

    }
}
