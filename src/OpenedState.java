import java.util.ArrayList;

public class OpenedState implements State{
    private Field field;
    OpenedState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick(ArrayList<Field> fields, GameLauncher launcher) {

    }

    @Override
    public void rightClick(ArrayList<Field> fields, GameLauncher launcher) {

    }
}
