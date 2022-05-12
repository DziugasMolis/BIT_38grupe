package lt.bit.Savaite5.Figuros;

public class Apskritimas extends Figura {
    private double r;

    public Apskritimas(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "r=" + r +
                '}';
    }

    @Override
    public double perimetras() {
        return 2 * Math.PI * r;
    }

    @Override
    public double plotas() {
        return r * r * Math.PI;
    }
}
