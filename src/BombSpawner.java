import java.util.ArrayList;
import java.util.Random;

public class BombSpawner {
    private ArrayList<Field> fields;
    BombSpawner(ArrayList<Field> f){
        fields = f;
    }
    public int spawnBombs(){
        int noBombs = (int)(0.1*fields.size());
        int currentBombs = 0;
        Random random = new Random();
        for (int i = 0; i < noBombs; i++){
            int p = random.nextInt(fields.size());
            while (fields.get(p).checkIfBomb()){
                p = random.nextInt(fields.size());
            }
            //System.out.println(p);
            fields.get(p).setBomb();
        }

        return noBombs;
    }
}
