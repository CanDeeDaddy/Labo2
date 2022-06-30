package Framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunco extends Jeu {

    public Bunco(int nbJoueur)
    {
        super(nbJoueur);
    }

    public void startGame() throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String vesrion = reader.readLine();
    }
}
