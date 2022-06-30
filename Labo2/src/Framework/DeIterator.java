package Framework;

public class DeIterator implements Iterator {

    De[] desList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of DeIterator are
    // going to iterate over.
    public DeIterator(De[] desList)
    {
        this.desList = desList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= desList.length ||
                desList[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        De de =  desList[pos];
        pos += 1;
        return de;
    }
}
