package model;

public class ColaboradorExterno extends RecursoAgencia {

    private String empresa;

    public ColaboradorExterno(String nombre,
                              String empresa) {

        super(nombre);

        this.empresa = empresa;

    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("===== COLABORADOR =====");
        System.out.println("Nombre : " + getNombre());
        System.out.println("Empresa : " + empresa);

    }

}