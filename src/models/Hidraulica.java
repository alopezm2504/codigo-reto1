package models;

public class Hidraulica extends EnergiaRenovable{
    private static double EFICIENCIA=0.7;//Porcentaje de eficiencia de la turbina (normalmente entre 0.7 y 0.9).
    private static double GRAVEDAD=9.81; //Aceleración debido a la gravedad (9.81 m/s²).
    private double flujo;
    private double altura;
    public Hidraulica(String id, String pais, int anio, double consumo, double flujo, double altura) {
        super(id,"Hidráulica", pais, anio, consumo);
        this.flujo=flujo;
        this.altura=altura;
    }

    public double getFlujo() {
        return flujo;
    }

    public void setFlujo(double flujo) {
        this.flujo = flujo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularProduccion() {
        return EFICIENCIA * flujo * altura * GRAVEDAD;
    }



}
