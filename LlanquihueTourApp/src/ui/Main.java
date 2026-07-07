package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor =
                new GestorServicios();

        System.out.println("=====================================");
        System.out.println("LLANQUIHUE TOUR APP");
        System.out.println("POLIMORFISMO");
        System.out.println("=====================================\n");

        for (ServicioTuristico servicio :
                gestor.getServicios()) {

            servicio.mostrarInformacion();

        }

    }

}