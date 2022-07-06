package Framework;


/**
 *
 * Une classe qui sert de base pour la creation de differente variation du jeu Bunco
 *
 */
public abstract  class Jeu {
    int Tours = 1;
    int nombreDeJoeur = 0;
    CollectionJoueurs colJ;

    /**
     *
     * Methode qui cree une instance de Jeu
     *
     * @param  nbJ le nombre de joeur participant a la partie
     *
     */
    public Jeu(int nbJ){
        this.nombreDeJoeur = nbJ;
        colJ = new CollectionJoueurs(nbJ);
    }

}
