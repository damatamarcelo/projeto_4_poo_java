package appcalculadora;

public class Calculos {
    private double x = 0.0;
    private double y = 0.0;

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

    public double divisao(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Divisão por Zero não é permitida.");
        }
        setX(x / y);

        return getX();
    }

    public double radiciacao(double x) throws ArithmeticException {
        if (x < 0) {
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        setX(Math.sqrt(x));

        return getX();
    }
}
