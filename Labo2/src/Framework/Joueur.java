package Framework;

public class Joueur implements Comparable<Joueur> {
    private int id;
    private String nom;
    private  int score;

    int curentScore = 0;
    private  CollectionDes collectionDes;



    public Joueur(String nom ){
        this.nom = nom;
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

    public void setScore(int points){
        score += points;
    }
    
    public CollectionDes getCollectionDes() {
        return collectionDes;
    }

    /** **
     *  compare les differents joueurs en ordre decroissant
     * @param o
     * @return
     */
    @Override
    public int compareTo(Joueur o) {
        if(score==o.score)
            return 0;
        else if(score>o.score)
            return -1;
        else
            return 1;
    }

    public void ajouterDe(){
        collectionDes = new CollectionDes();
        for(int i=0; i < 3; i++ ){
            De D  = new De();
            collectionDes.ajouterDe(D);
        }

    }

    @Override
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", score=" + score +
                ", curentScore=" + curentScore +
                '}';
    }
}
