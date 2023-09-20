import java.awt.*;
import java.util.ArrayList;

public class DefaultState implements State{
    private Field field;
    DefaultState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick(ArrayList<Field> fields) {
        if(field.checkIfBomb()){
            //lose game
            field.setBackground(Color.BLACK);
            field.setText("B");
            System.out.println("Przegrałeś");
        }else {
            field.uncoverChain(fields);
        }

    }

    @Override
    public void rightClick(ArrayList<Field> fields) {
        field.setBackground(Color.RED);
        field.changeState(new CheckedState(field));
    }
}
