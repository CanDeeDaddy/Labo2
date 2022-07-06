package Framework;

/**
 *
 * classe qui implemente l'interface iterateur por les De
 *
 */
public class DeIterator implements Iterator {

    De[] desList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of DeIterator are
    // going to iterate over.

    /**
     *
     * La methode cree un instance de la classe DeIterator
     *
     */
    public DeIterator(De[] desList)
    {
        this.desList = desList;
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
        if (pos >= desList.length ||
                desList[pos] == null)
            return false;
        else
            return true;
    }

    /**
     *
     * La methode vas chercher le prochain De dans le tableau
     *
     * @retrun le De
     *
     */
    @Override
    public Object next() {
        // return next element in the array and increment pos
        De de =  desList[pos];
        pos += 1;
        return de;
    }
}
