package Framework;

/**
 *
 *Classe qui implemente l'interface StrategiePoints et qui ajoute un point selont le context
 *
 */
public class StrategieBunco implements StrategiePoints{

    /**
     *
     *Methode qui ajoute 21 points
     *
     */
    @Override
    public int ajouterPoint() {
        return 21;
    }
}
