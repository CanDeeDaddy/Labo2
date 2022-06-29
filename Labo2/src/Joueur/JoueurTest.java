package Joueur;

import Iterator.Iterator;

public class JoueurTest {
    CollectionJoueurs joueurs;

    public JoueurTest(CollectionJoueurs joueurs)
    {
        this.joueurs = joueurs;
    }

    public void printNotifications()
    {
        Iterator iterator = joueurs.createIterator();
        System.out.println("-------Joueur test------------");
        while (iterator.hasNext())
        {
            Joueur n = (Joueur)iterator.next();
            System.out.println(n.getNom());
        }
    }
}
