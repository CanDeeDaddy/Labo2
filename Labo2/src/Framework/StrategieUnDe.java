package Framework;

/**
 *
 *Classe qui implemente l'interface StrategiePoints et qui ajoute un point selont le context
 *
 */
public class StrategieUnDe implements StrategiePoints{

    /**
     *
     *Methode qui ajoute un point
     *
     */
    @Override
    public int ajouterPoint() {
        return 1;
    }
}
