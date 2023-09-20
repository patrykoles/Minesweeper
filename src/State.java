import java.util.ArrayList;

public interface State {
    public void leftClick(ArrayList<Field> fields, GameLauncher launcher);
    public void rightClick(ArrayList<Field> fields, GameLauncher launcher);
}
