import BuncoPlus.BuncoPlus;
import Framework.Bunco;
import Framework.CollectionJoueurs;
import Framework.Context;
import Framework.JoueurTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        boolean keepGoing = true;
        do{
        System.out.println("Welcome to Bunco");
        System.out.println("---------------------------------------");
        System.out.println("Choose your version");
        System.out.println("1-Bunco");
        System.out.println("2-Bunco+");
        System.out.println("");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String vesrion = reader.readLine();

        switch(vesrion){
            case "1":
                System.out.println("How many players? (2-12)");
                System.out.println();
                String nbJoueur = reader.readLine();
                try {
                    int value = Integer.parseInt(nbJoueur);
                    /*System.out.println(value);*/
                    if( value < 2 || value > 12){
                        throw new Exception("Exception message");
                    }

                    Bunco b = new Bunco(value);

                    b.startGame();

                } catch (NumberFormatException e) {
                    System.out.println("not a valid number.");
                } catch (Exception e) {
                    System.out.println("not a valid number.");
                }
                break;
            case "2":
                System.out.println("How many players? (2-12)");
                String nbJ = reader.readLine();
                try {
                    int value = Integer.parseInt(nbJ);
                    /*System.out.println(value);*/
                    if( value < 2 || value > 12){
                        throw new Exception("Exception message");
                    }

                    BuncoPlus b = new BuncoPlus(value);

                    b.startGame();
                } catch (NumberFormatException e) {
                    System.out.println("not a valid number.");
                } catch (Exception e) {
                    System.out.println("not a valid number.");
                }
                break;
            default:
                System.out.println("invalid input");
                break;

        }


        }while(keepGoing);

    }


}