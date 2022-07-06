package Framework;

/**
 *
 *Classe qui implemente l'interface StrategiePoints et qui ajoute un point selont le context
 *
 */
public class StrategieDeuxDe implements StrategiePoints{

    /**
     *
     *Methode qui ajoute deux points
     *
     */
    @Override
    public int ajouterPoint() {
        return 2;
    }
}
