package L10.Q1.model;

public class Circulo extends Figura {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {

        double area = Math.PI * Math.pow(raio, raio);

        return area;
    }
}
