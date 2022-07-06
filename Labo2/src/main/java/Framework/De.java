package Framework;

import java.util.Random;

/**
 *
 *  Classe qui permet des operation sur les Des ainsi que leur creation
 *  Implemente la l'interface comparable
 *
 */
public class De implements Comparable <De>{
    private int id;
    private static final int MAX = 6;
    private static final int MIN = 1;

    public int value = 0;

    /**
     *
     *  Methode qui cree une instance d'un De
     *
     */
    De(){

    }

    /**
     *
     *  Methode qui retourne un chiffre aleatoire apres avoir rouler le De
     *
     *  @return resultat du lancer de De
     *
     */
    public  int lancerDe(){
        Random rn = new Random();
        return rn.nextInt(MAX - MIN  + 1) + MIN ;
    }

    /**
     *
     *  Methode qui compare deux De
     *
     *  @return resultat de la comparaison
     *
     */
    @Override
    public int compareTo(De o) {
        //Je sais pas encore quoi je dois comparer
        if (o.value == value){
            return 1;
        }else {return 0;}

    }


}
