package appcalculadora;

public class Calculos {   
    private double x;
    private double y;
    
    public Calculos(double x, double y) {

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
        if (y == 0) {
            System.out.println("Não é possível dividir um número por 0!");
        } else {
            setX(x / y);
        }

        return getX();
    }

    public double radiciacao(double x) {
        if (x < 0) {
            System.out.println("Não é possível obter a raiz quafrafa de um número negativo.");
        } else {
            setX(Math.sqrt(x));
        }

        return getX();
    }
}
