package Framework;

public class Context {

    private StrategiePoints strategie = new StrategieUnDe();

    public int execute() {
        //délègue le comportement à un objet Strategy
        return strategie.ajouterPoint();
    }

    public void setStrategie(StrategiePoints strategie) {
        this.strategie = strategie;
    }

    public StrategiePoints getStrategie() {
        return strategie;
    }

}
