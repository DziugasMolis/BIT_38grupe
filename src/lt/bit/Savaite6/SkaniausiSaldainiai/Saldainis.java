package lt.bit.Savaite6.SkaniausiSaldainiai;

public class Saldainis implements Comparable<Saldainis> {
    private String pavadinimas;
    private int ivertinimas;

    public Saldainis(String pavadinimas, int ivertinimas) {
        this.pavadinimas = pavadinimas;
        this.ivertinimas = ivertinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(int ivertinimas) {
        this.ivertinimas = ivertinimas;
    }

    @Override
    public String toString() {
        return "Saldainis{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", ivertinimas=" + ivertinimas +
                '}';
    }


    @Override
    public int compareTo(Saldainis o) {
        if(ivertinimas > o.getIvertinimas()) {
            return 1;
        } else if(ivertinimas < o.getIvertinimas()) {
            return -1;
        }
        return 0;
    }
}
