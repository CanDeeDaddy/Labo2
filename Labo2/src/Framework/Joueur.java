package Framework;

/** **
 *
 *  Classe qui permet de cree un joueur
 *  Implemente la l'interface comparable
 *
 */
public class Joueur implements Comparable<Joueur> {
    private int id;
    private String nom;
    private  int score;

    int curentScore = 0;
    private  CollectionDes collectionDes;


    /** **
     *
     *  Methode qui cree une instence d'un joueur
     *
     *  @param nom le nom qui sera attribué au joueur
     */
    public Joueur(String nom ){
        this.nom = nom;
    }

    /** **
     *
     *  Methode retourne l'ID du joueur
     *
     *  @return le id
     */
    public int getId() {
        return id;
    }

    /** **
     *
     *  Methode retourne le nom du joueur
     *
     *  @return le nom
     */
    public String getNom() {
        return nom;
    }

    /** **
     *
     *  Methode retourne le score du joueur
     *
     *  @return le score
     */
    public int getScore() {
        return score;
    }

    /** **
     *
     *  Methode definit le score du joueur
     *
     *  @param points le nom qui sera attribué au joueur
     */
    public void setScore(int points){
        score += points;
    }

    /**
     *
     *  Methode retourne la collection de De du joueur
     *
     *  @return la collection de De
     */
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

    /**
     *
     *  Methode qui permet l'ajout De a la collection de de du joueur
     *
     */
    public void ajouterDe(){
        collectionDes = new CollectionDes();
        for(int i=0; i < 3; i++ ){
            De D  = new De();
            collectionDes.ajouterDe(D);
        }

    }

    /** **
     *
     *  Methode retourne un joueur sous forme string
     *
     *  @return le info du joueur sous forme string
     */
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
