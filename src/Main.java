import logica.GestionDatos;
import models.Solar;

public class Main {
    public static void main(String[] args) {

        GestionDatos gestion = new GestionDatos();
        gestion.agregarEnergia(new Solar("001","colombia", 2020, 1000, 1000, 1000));
        gestion.agregarEnergia(new Solar("002","colombia", 2020, 1000, 1000, 1000));
        System.out.println(gestion.getEnergias().get(0).getPais());
        System.out.println("la produccion total es de :" + " " + gestion.calcularProduccionTotal() +"MWh");
        System.out.println("el consumo total es de :" + " " + gestion.calcularConsumoTotal()+"MWh");
        System.out.println("la produccion total del pais :" + "colombia" + gestion.calcularProduccionTotalPais("COLOMBIA") +"MWh");
    }
}