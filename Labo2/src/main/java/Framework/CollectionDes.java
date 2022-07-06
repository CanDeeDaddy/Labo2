package Framework;

/**
 *
 *  Classe qui permet des operation sur les  collection de Des ainsi que leur creation
 *  Implemente la l'interface collection
 *
 */
public class CollectionDes implements Collection
{
    private int size;
    static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    public De[] desList;


    /**
     *
     * Le contructeur cree une instance de la classe CollectionDes
     *
     */
    public CollectionDes()
    {
        desList = new De[MAX_ITEMS];

    }

    /**
     *
     * La methode ajoute un De a la collection
     *
     * @param de le De a ajouter
     *
     */
    public boolean ajouterDe(De de)
    {
        boolean booAjouterDe = false;
        if(de != null){
            if (numberOfItems >= MAX_ITEMS)
                System.err.println("Rempli");
            else
            {
                desList[numberOfItems] = de;
                numberOfItems = numberOfItems + 1;
                booAjouterDe = true;
            }
        }
        return booAjouterDe;
    }

    /**
     *
     *  La methode affiche le resultat des
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
     *  La methode affiche la premiere ligne d'un De
     *
     */
    public  void afficherPremiereLigne(){

        System.out.printf(" _____  _____  _____ ");

    }


    /**
     *
     *  La methode affiche la deuxieme ligne d'un De
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
     *  La methode affiche la troisieme ligne d'un De
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
     *  La methode affiche la quatrieme ligne d'un De
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
     *
     * La methode cree un iterateur
     *
     * @return retourne un iterateur
     *
     */
    @Override
    public Iterator createIterator() {
        return new DeIterator(desList);
    }
}
