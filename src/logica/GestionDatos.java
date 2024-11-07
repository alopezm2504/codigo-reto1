package logica;

import models.EnergiaRenovable;

import java.util.ArrayList;
import java.util.List;

public class GestionDatos {
    private List<EnergiaRenovable> energias;

    public GestionDatos() {
        this.energias = new ArrayList<>();
    }

    public List<EnergiaRenovable> getEnergias() {
        return energias;
    }

    public void setEnergias(List<EnergiaRenovable> energias) {
        this.energias = energias;
    }

    public void agregarEnergia(EnergiaRenovable energia) {
        energias.add(energia);
    }

    public double calcularProduccionTotal() {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : energias) {//sirve para recorrer la lista de energias
            energiaTotal += energia.calcularProduccion();
        }
        return energiaTotal;
    }

    public double calcularConsumoTotal() {
        double consumoTotal = 0.0;
        for (EnergiaRenovable energia : energias) {
            consumoTotal += energia.getConsumo();
        }
        return consumoTotal;

    }

    public double calcularProduccionTotalPais(String pais) {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : energias) {
            if (energia.getPais().equalsIgnoreCase(pais)) {
                energiaTotal += energia.calcularProduccion();
            }
        }
        return energiaTotal;
    }

    public double calcularConsumoTotalPais(String pais) {
        double consumoTotal = 0.0;
        for (EnergiaRenovable energia : energias) {
            if (energia.getPais().equalsIgnoreCase(pais)) {
                consumoTotal += energia.getConsumo();
            }
        }
        return consumoTotal;
    }
    public double calcularProduccionPaisTipo(String pais, String tipo) {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : energias) {
            if (energia.getPais().equalsIgnoreCase(pais) && energia.getTipo().equalsIgnoreCase(tipo)) {
                energiaTotal += energia.calcularProduccion();
            }
        }
        return energiaTotal;
    }
    public double calcularConsumoPaisTipo(String pais, String tipo) {
        double consumoTotal = 0.0;
        for (EnergiaRenovable energia : energias) {
            if (energia.getPais().equalsIgnoreCase(pais) && energia.getTipo().equalsIgnoreCase(tipo)) {
                consumoTotal += energia.getConsumo();
            }
        }
        return consumoTotal;
    }

    public double calcularProduccionPaisAnio(String pais, int anio) {
        double energiaTotal = 0.0;
        for (EnergiaRenovable energia : energias) {
            if (energia.getPais().equalsIgnoreCase(pais) && energia.getAnio() == anio) {
                energiaTotal += energia.calcularProduccion();
            }
        }
        return energiaTotal;
    }
}