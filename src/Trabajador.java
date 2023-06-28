abstract class Trabajador {
    private String tituloProfesional;
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private String rut;
    private String horario;

    public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario) {
        this.tituloProfesional = tituloProfesional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horario = horario;
    }

    public abstract String getTipo();

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public String getHorario() {
        return horario;
    }
}

