package lt.bit.Savaite5.Figuros;

public class Staciakampis extends Figura {
    private double x;
    private double y;

    public Staciakampis(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Staciakampis{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double perimetras() {
        return 2 * x + 2 * y;
    }

    @Override
    public double plotas() {
        return x * y;
    }
}
