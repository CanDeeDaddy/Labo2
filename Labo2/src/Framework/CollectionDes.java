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



    public  void afficherPremiereLigne(){

        System.out.printf(" _____  _____  _____ ");

    }



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

    @Override
    public Iterator createIterator() {
        return new DeIterator(desList);
    }
}
