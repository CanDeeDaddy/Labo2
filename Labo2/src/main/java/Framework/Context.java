package Framework;

/**
 *
 *Classe qui selon le context definit quel strategie d'ajout de point devrait etre utilisé
 *
 */
public class Context {

    private StrategiePoints strategie = new StrategieUnDe();


    /**
     *
     *Methode qui enclenche la methode d'ajout de point
     *
     */
    public int execute() {
        //délègue le comportement à un objet Strategy
        return strategie.ajouterPoint();
    }

    /**
     *
     *Methode qui definit la strategie a utiliser
     *
     *@param  strategie  strategie a employer selon le context
     *
     */
    public void setStrategie(StrategiePoints strategie) {
        this.strategie = strategie;
    }

    /**
     *
     *Methode retourne la strategie utilisé
     *
     *@return la strategie utilisé
     *
     */
    public StrategiePoints getStrategie() {
        return strategie;
    }

}
