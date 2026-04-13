package tag01.aufgaben.lösung_fussballStrategieMuster;

public class Mannschaft {
    public Strategie getStrategie() {
        return strategie;
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    private Strategie strategie;

    public String getMannschaftsname() {
        return mannschaftsname;
    }

    public void setMannschaftsname(String mannschaftsname) {
        this.mannschaftsname = mannschaftsname;
    }

    private String mannschaftsname;

    public Mannschaft(Strategie strategie, String mannschaftsname) {
        this.strategie = strategie;
        this.mannschaftsname = mannschaftsname;
    }

    public void fuehreStrategieAus() {
        this.strategie.fuehreStrategieAus();
    }
}
