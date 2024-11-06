package models;

public class Solar extends EnergiaRenovable {
    private static final double EFICIENCIA = 0.15; // Porcentaje de eficiencia de las placas solares (normalmente entre 0.15 y 0.20).
    private double radiacion; // en W/m² radiación solar
    private double area; // en m² de las placas solares

    public Solar(String id,String pais, int anio, double consumo, double radiacion, double area) {
        super(id,"Solar", pais, anio, consumo);
        this.radiacion = radiacion;
        this.area = area;

    }

    public double getRadiacion() {
        return radiacion;
    }

    public void setRadiacion(double radiacion) {
        this.radiacion = radiacion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calcularProduccion() {
        return EFICIENCIA * radiacion * area;
    }
}
