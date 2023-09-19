import java.awt.*;

public class DefaultState implements State{
    private Field field;
    DefaultState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick() {
        if(field.checkIfBomb()){
            //lose game
        }else {
            field.setBackground(Color.WHITE);
            field.changeState(new OpenedState(field));
        }

    }

    @Override
    public void rightClick() {
        field.changeState(new CheckedState(field));
    }
}
