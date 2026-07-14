package data;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        cargarServicios();

    }

    private void cargarServicios() {

        servicios.add(
                new RutaGastronomica(
                        "Ruta Cervecera",
                        5,
                        6));

        servicios.add(
                new RutaGastronomica(
                        "Sabores del Sur",
                        4,
                        5));

        servicios.add(
                new PaseoLacustre(
                        "Lago Llanquihue",
                        3,
                        "Catamarán"));

        servicios.add(
                new PaseoLacustre(
                        "Todos los Santos",
                        2,
                        "Lancha"));

        servicios.add(
                new ExcursionCultural(
                        "Frutillar Colonial",
                        4,
                        "Museo Colonial Alemán"));

        servicios.add(
                new ExcursionCultural(
                        "Puerto Varas Histórico",
                        3,
                        "Iglesia del Sagrado Corazón"));

    }

    public List<ServicioTuristico> getServicios() {

        return servicios;

    }

}