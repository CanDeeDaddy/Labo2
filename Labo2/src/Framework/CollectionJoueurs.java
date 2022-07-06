package Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * Une classe qui permet des manipulations sur une collection de joueur
 *
 */
public class CollectionJoueurs implements Collection {

    private int size;
    private int capacite = 0;
    static final int DEFAULT_MAX_ITEMS = 6;
    int numberOfItems = 0;
    public Joueur[] joueursList;

    /**
     *
     * Cree une collection de six joueurs
     *
     */
    public CollectionJoueurs()
    {
        joueursList = new Joueur[DEFAULT_MAX_ITEMS];
    }

    /**
     *
     * cree une collection de joueur selon le nombre indiqué
     *
     * @param  tailleMax le nombre de joeur participant a la partie
     *
     */
    public CollectionJoueurs(int tailleMax)
    {
        this.capacite = tailleMax;
        joueursList = new Joueur[tailleMax];
    }

    /**
     *
     * Cree ajoute un joueur a la collection
     *
     * @param  joueur le joueur a ajouter
     *
     */
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

    /**
     *
     * verifie si la collection est vide
     *
     * @return vrai si elle est vide ou faux si elle est pas vide
     *
     */
    public boolean isEmpty(){
        return joueursList.length == 0;
    }

    /**
     *
     * verifie si la collection contien un joueur
     *
     * @param joueur le joueur a verifier
     *
     * @return vrai si il est present ou faux si il est pas present
     *
     */
    public boolean contains(Joueur joueur){
        return Arrays.asList(joueursList).contains(joueur);
    }

    /**
     *
     * verifie si la collection contien un joueur et le retire
     *
     * @param joueur le joueur a verifier
     *
     * @return vrai si il est retiré ou faux si il est pas retiré
     *
     */
    public boolean remove(Joueur joueur){
        if (Arrays.asList(joueursList).contains(joueur)){
            Arrays.asList(joueursList).remove(joueur);
            return true;
        }
        return false;
    }

    /**
     *
     * Retourne un tableau avec les scores des joueurs
     *
     */
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



    /**
     * cree un iterateur
     * @return un itterateur
     */
    @Override
    public Iterator createIterator() {
        return new JoueurIterator(joueursList);
    }



}
