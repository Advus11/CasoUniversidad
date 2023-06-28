class Profesor extends Trabajador {
    private String tipoContrato;

    public Profesor(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario, String tipoContrato) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horario);
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String getTipo() {
        return "Profesor";
    }

    public String getTipoContrato() {
        return tipoContrato;
    }
}