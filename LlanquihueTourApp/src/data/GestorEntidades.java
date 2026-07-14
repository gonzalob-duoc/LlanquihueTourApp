package data;

import java.util.ArrayList;

import model.*;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {

        entidades = new ArrayList<>();

    }

    public void agregarEntidad(Registrable entidad) {

        entidades.add(entidad);

    }

    public void mostrarEntidades() {

        System.out.println();

        for (Registrable entidad : entidades) {

            entidad.mostrarResumen();

            if (entidad instanceof GuiaTuristico) {

                System.out.println("Tipo detectado: Guía turístico");

            }

            else if (entidad instanceof Vehiculo) {

                System.out.println("Tipo detectado: Vehículo");

            }

            else if (entidad instanceof ColaboradorExterno) {

                System.out.println("Tipo detectado: Colaborador externo");

            }

            System.out.println("---------------------------");

        }

    }

}