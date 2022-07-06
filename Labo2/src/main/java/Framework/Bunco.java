package Framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Une classe qui permet le demarrage d'une partie de Bunco et qui extend la classe jeu
 *
 */
public class Bunco extends Jeu {

    /**
     *
     * Methode qui cree une instance de Bunco
     *
     *@param  nbJoueur le nombre de joeur participant a la partie
     *
     */
    public Bunco(int nbJoueur)
    {
        super(nbJoueur);
    }

    /**
     *
     * Demare une partie de Bunco
     *
     */
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
            int tour = i + 1;
            System.out.println("Tour " + tour);
            //colJ.afficherScoreJoueurs();
            System.out.println("Appuyer sur la touche entree pour lancer les dees");
            String next = reader.readLine();
            boolean nextRound = false;
            do{
                for (int k = 0; k < nombreDeJoeur; k++) {
                    System.out.println("Joueur : " + colJ.joueursList[k].getNom());
                    System.out.println();
                    boolean keepRolling = true;

                    do {

                        int compare = 0;
                        int sameAsRound = 0;
                        for (int j = 0; j < 3; j++) {

                            colJ.joueursList[k].getCollectionDes().desList[j].value = colJ.joueursList[k].getCollectionDes().desList[j].lancerDe();
                           // System.out.print(colJ.joueursList[k].getCollectionDes().desList[j].value + " ");

                        }

                        colJ.joueursList[k].getCollectionDes().afficherDes();

                        compare += colJ.joueursList[k].getCollectionDes().desList[0].compareTo(colJ.joueursList[k].getCollectionDes().desList[1]);
                        compare += colJ.joueursList[k].getCollectionDes().desList[0].compareTo(colJ.joueursList[k].getCollectionDes().desList[2]);
                        compare += colJ.joueursList[k].getCollectionDes().desList[1].compareTo(colJ.joueursList[k].getCollectionDes().desList[2]);

                        for (int j = 0; j < 3; j++) {
                            if (colJ.joueursList[k].getCollectionDes().desList[j].value == tour) {
                                sameAsRound++;
                            }
                        }

                        switch (sameAsRound) {
                            case 1:
                                StrategieUnDe strat1 = new StrategieUnDe();
                                context.setStrategie(strat1);
                                colJ.joueursList[k].setScore(context.execute());
                                colJ.joueursList[k].curentScore += context.execute();
                                if( colJ.joueursList[k].curentScore >= 21){

                                    keepRolling = false;
                                    nextRound = true;

                                }
                                break;
                            case 2:
                                StrategieDeuxDe strat2 = new StrategieDeuxDe();
                                context.setStrategie(strat2);
                                colJ.joueursList[k].setScore(context.execute());
                                colJ.joueursList[k].curentScore += context.execute();
                                if( colJ.joueursList[k].curentScore >= 21){

                                    keepRolling = false;
                                    nextRound = true;

                                }
                                break;
                            case 3:
                                StrategieBunco bunco = new StrategieBunco();
                                context.setStrategie(bunco);
                                colJ.joueursList[k].setScore(context.execute());
                                keepRolling = false;
                                nextRound = true;
                                break;
                            default:
                                if (compare == 3) {
                                    StrategieTroisDe strat3 = new StrategieTroisDe();
                                    context.setStrategie(strat3);
                                    colJ.joueursList[k].setScore(context.execute());
                                    colJ.joueursList[k].curentScore += context.execute();
                                    if( colJ.joueursList[k].curentScore >= 21){

                                        keepRolling = false;
                                        nextRound = true;

                                    }
                                }
                                if (compare < 3 && sameAsRound == 0) {
                                    keepRolling = false;
                                }
                                break;
                        }

                        System.out.println();
                        //System.out.println("Appuyer sur la touche entree pour lancer les dees");
                        next = reader.readLine();


                    } while (keepRolling);

                    System.out.println("point : " + colJ.joueursList[k].getScore());
                    System.out.println();
                    //colJ.afficherScoreJoueurs();


                    if(colJ.joueursList[k].curentScore>=21){
                        for (int p = 0; p< nombreDeJoeur;p++) {
                            colJ.joueursList[k].curentScore=0;
                        }
                        k = 1+ nombreDeJoeur;
                        nextRound = true;

                    }
                }



        }while (nextRound == false);

        }

        System.out.println("Final score");
        colJ.afficherScoreJoueurs();
    }
}
