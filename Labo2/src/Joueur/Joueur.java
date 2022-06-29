package Joueur;

public class Joueur implements Comparable<Joueur> {
    private int id;
    private String nom;
    private  int score;

    Joueur(String nom){
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
