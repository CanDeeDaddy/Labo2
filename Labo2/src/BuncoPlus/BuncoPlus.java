package BuncoPlus;

import Framework.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuncoPlus extends Jeu {

    int nombreDeJoeur = 0;
    CollectionJoueurs colJ;
    public BuncoPlus(int nbJ) {
        super(nbJ);
        this.nombreDeJoeur = nbJ;
        colJ = new CollectionJoueurs(nbJ);

    }


    public void startGame() throws IOException {

        Context context = new Context();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        for(int i=0; i < nombreDeJoeur; i++ ){

            Joueur j = new Joueur(String.valueOf(i+1));
            j.ajouterDe();
            colJ.ajouterJoueur(j);

        }

        for(int i=0; i < 6; i++ ) {
            int tour = i+1;
            System.out.println("Tour " + tour);
            String next = reader.readLine();
            for(int k=0; k < nombreDeJoeur; k++ ) {
                System.out.println("Joueur : " + colJ.joueursList[k].getNom());
                boolean keepRolling = true;
                do {
                    int curentPoints = 0;
                    int compare =0;
                    int sameAsRound = 0;
                    for (int j = 0; j < 3; j++) {

                        colJ.joueursList[k].getCollectionDes().desList[j].value = colJ.joueursList[k].getCollectionDes().desList[j].lancerDe();
                             System.out.print(colJ.joueursList[k].getCollectionDes().desList[j].value + " ");
                    }
                    colJ.afficherScoreJoueurs();
                    colJ.joueursList[k].getCollectionDes().afficherDes();

                    compare+= colJ.joueursList[k].getCollectionDes().desList[0].compareTo(colJ.joueursList[k].getCollectionDes().desList[1]);
                    compare+= colJ.joueursList[k].getCollectionDes().desList[0].compareTo(colJ.joueursList[k].getCollectionDes().desList[2]);
                    compare+= colJ.joueursList[k].getCollectionDes().desList[1].compareTo(colJ.joueursList[k].getCollectionDes().desList[2]);

                    for (int j = 0; j < 3; j++) {
                        if(colJ.joueursList[k].getCollectionDes().desList[j].value == tour) {
                            sameAsRound++;
                        }}

                    switch (sameAsRound){
                        case 1:
                            StrategieUnDe strat1 = new StrategieUnDe();
                            context.setStrategie(strat1);
                            colJ.joueursList[k].setScore(context.execute());
                            curentPoints += context.execute();
                            if( curentPoints >= 21){
                                keepRolling = false;
                            }
                            break;
                        case 2:
                            StrategieDeuxDe strat2 = new StrategieDeuxDe();
                            context.setStrategie(strat2);
                            colJ.joueursList[k].setScore(context.execute());
                            curentPoints += context.execute();
                            if( curentPoints >= 21){
                                keepRolling = false;
                            }
                            break;
                        case 3:
                            StrategieBunco bunco = new StrategieBunco();
                            context.setStrategie(bunco);
                            colJ.joueursList[k].setScore(context.execute());
                            keepRolling = false;
                            break;
                        default:
                            if(compare == 3){
                                StrategieTroisDe strat3 = new StrategieTroisDe();
                                context.setStrategie(strat3);
                                colJ.joueursList[k].setScore(context.execute());
                                curentPoints += context.execute();
                                if( curentPoints >= 21){
                                    keepRolling = false;
                                }
                            }
                            if(compare < 3 && sameAsRound == 0){
                                keepRolling = false;
                            }
                            break;
                    }

                    System.out.println();
                    next = reader.readLine();
                }while (keepRolling);

                System.out.println("point : " + colJ.joueursList[k].getScore());
                System.out.println();
            }
        }


    }

}
