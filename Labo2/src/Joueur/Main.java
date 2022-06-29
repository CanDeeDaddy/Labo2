package Joueur;


public class Main {


    public static void main(String[] args) {
        CollectionJoueurs nc = new CollectionJoueurs();
        JoueurTest nb = new JoueurTest(nc);
        nb.printNotifications();

        System.out.println( nb.joueurs.numberOfItems);
    }


}