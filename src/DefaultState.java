import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DefaultState implements State{
    private Field field;
    DefaultState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick(ArrayList<Field> fields, GameLauncher launcher) {
        if(field.checkIfBomb()){
            //lose game
            field.setBackground(Color.BLACK);
            field.setText("B");
            for (Field f:fields) {
                //f.removeMouseListener(f.getMouseListeners());
                f.changeState(new OpenedState(f));
            }
            JOptionPane.showMessageDialog(null, "You lost! Try again!", "Game over", JOptionPane.INFORMATION_MESSAGE);

            launcher.frame.dispose();
            new MenuLauncher();

        }else {
            field.uncoverChain(fields);
        }

    }

    @Override
    public void rightClick(ArrayList<Field> fields, GameLauncher launcher) {
        field.setBackground(Color.RED);
        if(field.checkIfBomb()){
            launcher.increaseFlags();
            launcher.checkWin();
        }
        field.changeState(new CheckedState(field));

    }
}
