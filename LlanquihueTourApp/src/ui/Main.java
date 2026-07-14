package ui;

import javax.swing.JOptionPane;

import data.GestorEntidades;
import model.*;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor =
                new GestorEntidades();

        String nombre =
                JOptionPane.showInputDialog(
                        "Ingrese nombre del guía:");

        String idioma =
                JOptionPane.showInputDialog(
                        "Ingrese idioma:");

        gestor.agregarEntidad(

                new GuiaTuristico(
                        nombre,
                        idioma));

        String patente =
                JOptionPane.showInputDialog(
                        "Ingrese patente del vehículo:");

        int capacidad =
                Integer.parseInt(

                        JOptionPane.showInputDialog(
                                "Ingrese capacidad:"));

        gestor.agregarEntidad(

                new Vehiculo(
                        patente,
                        capacidad));

        gestor.agregarEntidad(

                new ColaboradorExterno(

                        "Turismo Patagonia",

                        "Patagonia Travel"));

        gestor.mostrarEntidades();

        JOptionPane.showMessageDialog(

                null,

                "Registro realizado correctamente.\nRevise la consola.");

    }

}