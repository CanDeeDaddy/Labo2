package Joueur;
import Iterator.Collection;
import Iterator.Iterator;

public class CollectionJoueurs implements Collection {

    private int size;
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Joueur[] joueursList;


    public CollectionJoueurs()
    {
        joueursList = new Joueur[MAX_ITEMS];


    }

    public void ajouterJoueur(Joueur joueur)
    {
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            joueursList[numberOfItems] = joueur;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new JoueurIterator(joueursList);
    }

}
