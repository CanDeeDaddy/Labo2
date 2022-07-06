package Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionJoueurs implements Collection {

    private int size;
    private int capacite = 0;
    static final int DEFAULT_MAX_ITEMS = 6;
    int numberOfItems = 0;
    public Joueur[] joueursList;



    public CollectionJoueurs(int tailleMax)
    {
        this.capacite = tailleMax;
        joueursList = new Joueur[tailleMax];
    }

    public boolean ajouterJoueur(Joueur joueur)
    {
        boolean booJoueurAjouter = false;
        if(joueur != null){
        if ( numberOfItems >= capacite) {
            System.out.println("Liste de joueurs est rempli");
            booJoueurAjouter = false;
        }
        else
        {
            joueursList[numberOfItems] = joueur;
            numberOfItems = numberOfItems + 1;
            booJoueurAjouter = true;
        }
        }else{
            booJoueurAjouter = false;
        }
        return booJoueurAjouter;
    }

    public boolean contains(Joueur joueur){
        return Arrays.asList(joueursList).contains(joueur);
    }


    public void afficherScoreJoueurs(){
        String leftAlignFormat = "| %-15s | %-4d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Nom des joueurs | score |%n");
        System.out.format("+-----------------+------+%n");
        for (int i = 0; i < capacite; i++) {
            System.out.format(leftAlignFormat, joueursList[i].getNom(), joueursList[i].getScore());
        }
        System.out.format("+-----------------+------+%n");
    }

    /**
     * Cette methode retourne la liste de joueur en ordre decroissant
     * @return une liste de joueur
     */
    public List<Joueur> toArray(){
         List<Joueur> list = Arrays.asList(joueursList);
         Collections.sort(list);
        return list;
    }




    @Override
    public Iterator createIterator() {
        return new JoueurIterator(joueursList);
    }



}
