import logica.GestionDatos;
import models.EnergiaRenovable;
import models.Eolica;
import models.Hidraulica;
import models.Solar;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionDatos gestion = new GestionDatos();
        String pais = JOptionPane.showInputDialog("ingrese el pais");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año"));
        String tipo = JOptionPane.showInputDialog("ingrese el tipo de energia");
        gestion.setEnergias(crearMockEnergias());

        verDatos(gestion, pais, anio, tipo);
    }

    /**
     * Método que muestra los datos de producción y consumo de energía.
     *
     * @param gestion Objeto de la clase GestionDatos.
     * @param pais    País del que se desea ver la producción.
     * @param anio    Año del que se desea ver la producción.
     */
    private static void verDatos(GestionDatos gestion, String pais, int anio, String tipo) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("La produccion total mundial es de : " + " " + gestion.calcularProduccionTotal() + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("El consumo total mundial es de :" + " " + gestion.calcularConsumoTotal() + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("La produccion total de " + " " + pais + " " + "es : " + gestion.calcularProduccionTotalPais(pais) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("el consumo total de " + pais + "es : " + gestion.calcularConsumoTotalPais(pais) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("la producion de energia de tipo " + tipo + " del pais " + " " + pais + " en el anio " + " " + anio + " es: " + " " + gestion.calcularProduccionPaisTipo(pais, tipo) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("la producion de energia de " + pais + " " + "en el año" + " " + anio + " " + "es : " + gestion.calcularProduccionPaisAnio(pais, anio) + "MWh");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    /**
     * Método que crea una lista de energías renovables de prueba.
     *
     * @return Lista de energías renovables.
     */
    public static List<EnergiaRenovable> crearMockEnergias() {
        ArrayList<EnergiaRenovable> energias = new ArrayList<>();
        energias.add(new Solar("001", "Colombia", 2020, 365000, 2007, 1000));
        energias.add(new Eolica("002", "Colombia", 2020, 365000, 518400, 1000));
        energias.add(new Hidraulica("003", "Colombia", 2020, 1000, 1000, 1000));

        energias.add(new Solar("004", "Brasil", 2020, 1000, 1000, 1000));
        energias.add(new Eolica("005", "Brasil", 2020, 1000, 1000, 1000));
        energias.add(new Hidraulica("006", "Brasil", 2020, 1000, 1000, 1000));

        return energias;
    }
}