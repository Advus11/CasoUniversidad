import java.util.ArrayList;
import java.util.List;

class Departamento {
    private String nombre;
    private List<CarreraUniversitaria> carreras;
    private List<Administrativo> administrativos;
    private List<Profesor> profesores;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        this.administrativos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void agregarCarrera(CarreraUniversitaria carrera) {
        carreras.add(carrera);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public List<CarreraUniversitaria> getCarreras() {
        return carreras;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Profesor> obtenerProfesoresPorTipoContrato(String tipoContrato) {
        List<Profesor> profesoresContrato = new ArrayList<>();
        for (Profesor profesor : profesores) {
            if (profesor.getTipoContrato().equalsIgnoreCase(tipoContrato)) {
                profesoresContrato.add(profesor);
            }
        }
        return profesoresContrato;
    }
}