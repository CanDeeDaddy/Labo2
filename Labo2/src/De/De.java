package De;

import java.util.Random;

public class De implements Comparable <De>{
    private int id;
    private static final int MAX = 6;
    private static final int MIN = 1;

    De(){

    }
    public static int lancerDe(){
        Random rn = new Random();
        return rn.nextInt(MAX - MIN  + 1) + MIN ;
    }

    @Override
    public int compareTo(De o) {
        //Je sais pas encore quoi je dois comparer
        return 0;
    }
}
