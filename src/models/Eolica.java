package models;

public class Eolica extends EnergiaRenovable {
    private static final double EFICIENCIA = 0.4; // Porcentaje de eficiencia de los aerogeneradores (normalmente entre 0.3 y 0.4).
    private static final double DENSIDAD_AIRE = 1.225; // Densidad del aire en kg/m³ al nivel del mar.
    private double velocidadViento; // en m/s
    private double areaBarrido; // en m² area barrida por las aspas del aerogenerador
    public Eolica(String id, String pais, int anio, double consumo, double velocidadViento, double areaBarrido) {
        super(id,"Eolica", pais, anio, consumo);
        this.velocidadViento = velocidadViento;
        this.areaBarrido = areaBarrido;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(double velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    public double getAreaBarrido() {
        return areaBarrido;
    }

    public void setAreaBarrido(double areaBarrido) {
        this.areaBarrido = areaBarrido;
    }

    @Override
    public double calcularProduccion() {
        return 0.5 * EFICIENCIA * DENSIDAD_AIRE * Math.pow(velocidadViento, 3) * areaBarrido;
    }
}
