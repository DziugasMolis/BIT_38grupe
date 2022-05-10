package lt.bit.Savaite5.Bendrabutis;

import java.util.List;

public class BendrabuciuElektrosMenesineImoka {
    private double kwKaina;
    private List<Double> butuKw;

    public BendrabuciuElektrosMenesineImoka(double kwKaina, List<Double> butuKw) {
        this.kwKaina = kwKaina;
        this.butuKw = butuKw;
    }

    public double getKwKaina() {
        return kwKaina;
    }

    public void setKwKaina(double kwKaina) {
        this.kwKaina = kwKaina;
    }

    public List<Double> getButuKw() {
        return butuKw;
    }

    public void setButuKw(List<Double> butuKw) {
        this.butuKw = butuKw;
    }

    @Override
    public String toString() {
        return "BendrabuciuElektrosMenesineImoka{" +
                "kwKaina=" + kwKaina +
                ", butuKw=" + butuKw +
                '}';
    }
}
