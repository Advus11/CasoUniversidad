import java.util.ArrayList;
import java.util.List;

class Facultad {
    private String nombre;
    private String latitud;
    private String longitud;
    private List<Departamento> departamentos;

    public Facultad(String nombre, String latitud, String longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.departamentos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public String getLatitud() {
        return latitud;
    }
    public String getLongitud() {
        return longitud;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }


    public List<Profesor> obtenerProfesores() {
        List<Profesor> profesoresFacultad = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            profesoresFacultad.addAll(departamento.getProfesores());
        }
        return profesoresFacultad;
    }

    public List<CarreraUniversitaria> obtenerCarrerasUniversitarias() {
        List<CarreraUniversitaria> carrerasFacultad = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            carrerasFacultad.addAll(departamento.getCarreras());
        }
        return carrerasFacultad;
    }
}
