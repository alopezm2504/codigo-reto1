package models;

public class EnergiaRenovable {
    private String id;
    private String tipo;
    private String pais;
    private int anio;
    private double produccion; // en MWh, por ejemplo
    private double consumo;    // en MWh

    public EnergiaRenovable(String id, String tipo, String pais, int anio,double consumo) {
        this.id=id;
        this.tipo = tipo;
        this.pais = pais;
        this.anio = anio;
        this.consumo = consumo;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double calcularProduccion() {
        return 0.0;
    }
}

