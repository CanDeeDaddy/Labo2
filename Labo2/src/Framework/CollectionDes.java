package Framework;

/**
 *
 * Une classe qui permet des manipulations sur une collection de De
 *
 */
public class CollectionDes implements Collection
{
    private int size;
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    public De[] desList;

    /**
     *
     * Cree une collection de six De
     *
     */
    public CollectionDes()
    {
        desList = new De[MAX_ITEMS];

    }

    /**
     *
     * Cree ajoute un De a la collection
     *
     * @param  de le joueur a ajouter
     *
     */
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

    /**
     *
     * Affiche les des
     *
     */
    public  void afficherDes(){

        /*
         * Strat?gie : On affiche une ligne ? la fois sachant que
         * les possibilit?s sur un d? NB_FACES (hard coded).
         *
         * Si la constante change, il faut venir ajouter des lignes et changer
         * le d?tails des prochaines proc?dures d'affichage.
         */
        afficherPremiereLigne();
        System.out.printf("\n");
        afficherDeuxiemeLigne();
        System.out.printf("\n");
        afficherTroisiemeLigne();
        System.out.printf("\n");
        afficherQuatriemeLigne();
        System.out.printf("\n");
    }


    /**
     *
     * Affiche la premieres lignes des des
     *
     */
    public  void afficherPremiereLigne(){

        System.out.printf(" _____  _____  _____ ");

    }


    /**
     *
     * Affiche la deuxieme lignes des des
     *
     */
    public  void afficherDeuxiemeLigne(){

        for(int i = 0; i < 3; i ++) {

            //deuxi?me ligne
            if(desList[i].value == 1){
                System.out.printf("|     |");
            }
            else if(desList[i].value == 2 || desList[i].value == 3){
                System.out.printf("|o    |");
            }
            else{
                System.out.printf("|o   o|");
            }
        }
    }

    /**
     *
     * Affiche la troisieme lignes des des
     *
     */
    public  void afficherTroisiemeLigne(){

        for(int i = 0; i < 3; i ++){

            if(desList[i].value == 2 || desList[i].value == 4){
                System.out.printf("|     |");
            }
            else if(desList[i].value == 1 || desList[i].value == 3 || desList[i].value == 5){
                System.out.printf("|  o  |");
            }
            else{
                System.out.printf("|o   o|");
            }
        }
    }

    /**
     *
     * Affiche la quatrieme lignes des des
     *
     */
    public  void afficherQuatriemeLigne(){

        for(int i = 0; i < 3; i ++){

            if(desList[i].value == 1){
                System.out.printf("|_____|");
            }
            else if(desList[i].value== 3 ||  desList[i].value == 2){
                System.out.printf("|____o|");
            }
            else {
                System.out.printf("|o___o|");
            }

        }
    }


    /**
     * cree un iterateur
     * @return un iterateur
     */
    @Override
    public Iterator createIterator() {
        return new DeIterator(desList);
    }
}
