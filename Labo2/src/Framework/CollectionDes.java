package Framework;

public class CollectionDes implements Collection
{
    private int size;
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    public De[] desList;


    public CollectionDes()
    {
        desList = new De[MAX_ITEMS];

    }

    public void ajouterDe(De de)
    {
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            desList[numberOfItems] = de;
            numberOfItems = numberOfItems + 1;
        }
    }
    @Override
    public Iterator createIterator() {
        return new DeIterator(desList);
    }
}
