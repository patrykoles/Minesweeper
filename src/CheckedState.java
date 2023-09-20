import java.awt.*;
import java.util.ArrayList;

public class CheckedState implements State{
    private Field field;
    CheckedState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick(ArrayList<Field> fields) {

    }

    @Override
    public void rightClick(ArrayList<Field> fields) {
        field.setBackground(Color.GRAY);
        field.changeState(new DefaultState(field));
    }
}
