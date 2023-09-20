import java.awt.*;
import java.util.ArrayList;

public class Chain {
    public void uncover(ArrayList<Field> fields, Field currentField){
        //check if field isn't uncovered already
        if(currentField.getState() instanceof DefaultState){
        //display number of bombs
        if (currentField.getNumOfBombs() > 0) {
            currentField.setText(Integer.toString(currentField.getNumOfBombs()));
            currentField.setBackground(Color.WHITE);
            currentField.changeState(new OpenedState(currentField));
        } else if(!(currentField.checkIfBomb())){
            currentField.setBackground(Color.WHITE);
            currentField.changeState(new OpenedState(currentField));
            //if field has no neighbouring bombs repeat the process for surrounding fields
            int size = (int)(Math.sqrt(fields.size()));
            int i = currentField.getX() * size + currentField.getY();
            //System.out.println("Index:"+currentField.getX()+" * "+size+" + "+currentField.getY()+" = "+i);
            if (i % size != 0) {
                //checks if field isn't in the first column
                fields.get(i - 1).uncoverChain(fields);
                if (i >= size) {
                    fields.get(i - size - 1).uncoverChain(fields);
                }
                if (i < size * size - size) {
                    fields.get(i + size - 1).uncoverChain(fields);
                }
            }
            if (i % size != size - 1) {
                //checks if field isn't in the last column
                fields.get(i + 1).uncoverChain(fields);
                if (i >= size) {
                    fields.get(i - size + 1).uncoverChain(fields);
                }
                if (i < size * size - size) {
                    fields.get(i + size + 1).uncoverChain(fields);
                }
            }
            if (i >= size) {
                //checks if field isn't in the first row
                fields.get(i - size).uncoverChain(fields);
            }
            if (i < size * size - size) {
                //checks if field isn't in the last row
                fields.get(i + size).uncoverChain(fields);
            }
        }}
    }
}
