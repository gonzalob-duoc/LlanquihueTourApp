package data;

import model.*;

public class GestorServicios {

    public void crearServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta Cervecera",
                        5,
                        6);

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Sabores del Sur",
                        4,
                        5);

        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Lago Llanquihue",
                        3,
                        "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Todos los Santos",
                        2,
                        "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural(
                        "Frutillar Colonial",
                        4,
                        "Museo Colonial Alemán");

        ExcursionCultural excursion2 =
                new ExcursionCultural(
                        "Puerto Varas Histórico",
                        3,
                        "Iglesia del Sagrado Corazón");

        System.out.println(ruta1);
        System.out.println("---------------------");

        System.out.println(ruta2);
        System.out.println("---------------------");

        System.out.println(paseo1);
        System.out.println("---------------------");

        System.out.println(paseo2);
        System.out.println("---------------------");

        System.out.println(excursion1);
        System.out.println("---------------------");

        System.out.println(excursion2);
    }

}