package Framework;

public class JoueurIterator implements Iterator {

    Joueur[] joueursList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of JoueurIterator are
    // going to iterate over.
    public  JoueurIterator (Joueur[] joueursList)
    {
        this.joueursList = joueursList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= joueursList.length ||
                joueursList[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        Joueur joueur =  joueursList[pos];
        pos += 1;
        return joueur;
    }
}
