import lombok.Data;

import java.util.Random;

@Data
public class Die {

    private int maxValue, minValue;

    public Die (int min, int max){
        minValue = min;
        maxValue = max;
    }

    public int rollDie(){
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis() + rnd.nextInt());
        return rnd.nextInt(maxValue-minValue) + minValue;
    }


}
