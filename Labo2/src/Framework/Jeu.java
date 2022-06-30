package Framework;

public abstract  class Jeu {
    int Tours = 1;
    int nombreDeJoeur = 0;
    CollectionJoueurs colJ;

    public Jeu(int nbJ){
        this.nombreDeJoeur = nbJ;
        colJ = new CollectionJoueurs(nbJ);
    }

}
