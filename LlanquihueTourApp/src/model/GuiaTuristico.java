package model;

public class GuiaTuristico extends RecursoAgencia {

    private String idioma;

    public GuiaTuristico(String nombre, String idioma) {

        super(nombre);

        this.idioma = idioma;

    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("===== GUÍA TURÍSTICO =====");
        System.out.println("Nombre : " + getNombre());
        System.out.println("Idioma : " + idioma);

    }

}