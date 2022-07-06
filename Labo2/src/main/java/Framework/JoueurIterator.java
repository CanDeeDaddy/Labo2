package Framework;

/**
 *
 * classe qui implemente l'interface iterateur por les joueurs
 *
 */
public class JoueurIterator implements Iterator {

    Joueur[] joueursList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    /**
     *
     * La methode cree un instance de la classe JoueurIterator
     *
     */
    // Constructor takes the array of JoueurIterator are
    // going to iterate over.
    public  JoueurIterator (Joueur[] joueursList)
    {
        this.joueursList = joueursList;
    }

    /**
     *
     * La methode verifie qu'il y a un prochain dans le tableau
     *
     * @retrun true si il y a un prochain et faut si non
     *
     */
    @Override
    public boolean hasNext() {
        if (pos >= joueursList.length ||
                joueursList[pos] == null)
            return false;
        else
            return true;
    }

    /**
     *
     * La methode vas chercher le prochain joueur dans le tableau
     *
     * @retrun le joueur
     *
     */
    @Override
    public Object next() {
        // return next element in the array and increment pos
        Joueur joueur =  joueursList[pos];
        pos += 1;
        return joueur;
    }
}
