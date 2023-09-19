import java.util.ArrayList;

public class BombSpotter {
    private ArrayList<Field> fields;
    private int size;
    BombSpotter(ArrayList<Field> f){
        fields = f;
        size = (int)Math.sqrt(fields.size());
    }
    public void spotBombs(){
        for(int i = 0; i<fields.size(); i++){
            if(fields.get(i).checkIfBomb()){
                //TO DO: Adding number of bombs to all neighbours
            }
        }
    }
}
