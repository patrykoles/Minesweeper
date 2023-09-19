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
                //Adding number of bombs to all neighbours
                if(i%size != 0){
                    fields.get(i-1).increaseNumOfBombs();
                    if(i>=size){fields.get(i-size-1).increaseNumOfBombs();}
                    if(i<size*size-size){fields.get(i+size-1).increaseNumOfBombs();}
                }
                if(i%size != size-1){
                    fields.get(i+1).increaseNumOfBombs();
                    if(i>=size){fields.get(i-size+1).increaseNumOfBombs();}
                    if(i<size*size-size){fields.get(i+size+1).increaseNumOfBombs();}
                }
                if(i>=size){fields.get(i-size).increaseNumOfBombs();}
                if(i<size*size-size){fields.get(i+size).increaseNumOfBombs();}
            }
        }
    }
}
