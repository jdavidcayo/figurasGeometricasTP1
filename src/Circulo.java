public class Circulo extends FiguraGeometrica{
    private double radio;
    private final double PI = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * (this.radio * this.radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }
}
