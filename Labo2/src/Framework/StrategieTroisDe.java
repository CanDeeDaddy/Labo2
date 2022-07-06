package Framework;

/**
 *
 *Classe qui implemente l'interface StrategiePoints et qui ajoute un point selont le context
 *
 */
public class StrategieTroisDe implements StrategiePoints{

    /**
     *
     *Methode qui ajoute cinq points
     *
     */
    @Override
    public int ajouterPoint() {
        return 5;
    }
}
