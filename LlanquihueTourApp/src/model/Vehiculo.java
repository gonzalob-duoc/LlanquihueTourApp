package model;

public class Vehiculo extends RecursoAgencia {

    private String patente;
    private int capacidad;

    public Vehiculo(String patente,
                    int capacidad) {

        super("Vehículo");

        this.patente = patente;
        this.capacidad = capacidad;

    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("===== VEHÍCULO =====");
        System.out.println("Patente : " + patente);
        System.out.println("Capacidad : " + capacidad + " pasajeros");

    }

}