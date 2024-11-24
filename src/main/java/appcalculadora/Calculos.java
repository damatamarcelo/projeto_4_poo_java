package appcalculadora;

public class Calculos {
    private double x;

    public Calculos(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double soma(double x, double y) {
        setX(x + y);
        return getX();
    }

    public double subtracao(double x, double y) {
        setX(x - y);
        return getX();
    }

    public double multiplicacao(double x, double y) {
        setX(x * y);
        return getX();
    }

    public double divisao(double x, double y) {
        setX(x / y);
        return getX();
    }

    public double radiciacao(double x) {
        setX(Math.sqrt(x));
        return getX();
    }
}
