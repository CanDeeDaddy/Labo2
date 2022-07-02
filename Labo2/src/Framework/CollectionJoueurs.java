package Framework;

import java.util.Arrays;

public class CollectionJoueurs implements Collection {

    private int size;
    private int capacite = 0;
    static final int DEFAULT_MAX_ITEMS = 6;
    int numberOfItems = 0;
    public Joueur[] joueursList;


    public CollectionJoueurs()
    {
        joueursList = new Joueur[DEFAULT_MAX_ITEMS];
    }
    public CollectionJoueurs(int tailleMax)
    {
        this.capacite = tailleMax;
        joueursList = new Joueur[tailleMax];
    }

    public boolean ajouterJoueur(Joueur joueur)
    {

        if ( capacite == 0 &&numberOfItems >= DEFAULT_MAX_ITEMS) {
            System.out.println("Liste de joueurs est rempli");
            return false;
        }
        else
        {
            if(numberOfItems >= capacite){
                System.out.println("Liste de joueurs est rempli");

                return false;
            }
            joueursList[numberOfItems] = joueur;
            numberOfItems = numberOfItems + 1;
            return true;
        }
    }

    public boolean isEmpty(){
        return joueursList.length == 0;
    }
    public boolean contains(Joueur joueur){
        return Arrays.asList(joueursList).contains(joueur);
    }
    public boolean remove(Joueur joueur){
        if (Arrays.asList(joueursList).contains(joueur)){
            Arrays.asList(joueursList).remove(joueur);
            return true;
        }
        return false;
    }


    @Override
    public Iterator createIterator() {
        return new JoueurIterator(joueursList);
    }



}
