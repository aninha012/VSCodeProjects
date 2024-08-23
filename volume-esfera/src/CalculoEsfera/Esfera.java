package CalculoEsfera;

public class Esfera {
    private double raio;

    // Método para definir o raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para obter o raio
    public double getRaio() {
        return raio;
    }

    // Método para calcular o volume da esfera
    public double volumeDaEsfera() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
