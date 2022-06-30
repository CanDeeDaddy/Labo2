import Framework.CollectionJoueurs;
import Framework.JoueurTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        boolean continue = true;
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
                break;
            case "2":

                break;
            default:
                System.out.println("invalid input");
                break;

        }

        System.out.println(vesrion);
        }while(continue);

    }


}