class Administrativo extends Trabajador {

    public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horario);
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }

}

