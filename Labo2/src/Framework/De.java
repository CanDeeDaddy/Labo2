package Framework;

import java.util.Random;

public class De implements Comparable <De>{
    private int id;
    private static final int MAX = 6;
    private static final int MIN = 1;

    public int value = 0;

    De(){

    }
    public static int lancerDe(){
        Random rn = new Random();
        return rn.nextInt(MAX - MIN  + 1) + MIN ;
    }

    @Override
    public int compareTo(De o) {
        //Je sais pas encore quoi je dois comparer
        if (o.value == value){
            return 1;
        }else {return 0;}

    }
}
