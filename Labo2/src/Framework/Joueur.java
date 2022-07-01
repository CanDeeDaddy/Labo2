package Framework;

public class Joueur implements Comparable<Joueur> {
    private int id;
    private String nom;
    private  int score;
    private  CollectionDes collectionDes;



    Joueur(String nom , CollectionDes collectionDes){
        this.nom = nom;
        this.collectionDes = collectionDes;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }
    
    public CollectionDes getCollectionDes() {
        return collectionDes;
    }

    @Override
    public int compareTo(Joueur o) {
        if(score==o.score)
            return 0;
        else if(score>o.score)
            return 1;
        else
            return -1;
    }


}
