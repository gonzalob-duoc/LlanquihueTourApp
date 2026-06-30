package ui;

import data.GestorServicios;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("LLANQUIHUE TOUR APP");
        System.out.println("Servicios Turísticos");
        System.out.println("================================\n");

        GestorServicios gestor =
                new GestorServicios();

        gestor.crearServicios();

    }

}