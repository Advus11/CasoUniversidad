import java.util.ArrayList;
import java.util.List;

class Universidad {
    private String nombre;
    private String direccion;
    private String tipoUniversidad;
    private List<Facultad> facultades;

    public Universidad(String nombre, String direccion, String tipoUniversidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoUniversidad = tipoUniversidad;
        this.facultades = new ArrayList<>();
    }

    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTipoUniversidad() {
        return tipoUniversidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Facultad buscarFacultadPorNombre(String nombreFacultad) {
        for (Facultad facultad : facultades) {
            if (facultad.getNombre().equalsIgnoreCase(nombreFacultad)) {
                return facultad;
            }
        }
        return null;
    }

    public Departamento buscarDepartamentoPorNombre(String nombreDepartamento) {
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                if (departamento.getNombre().equalsIgnoreCase(nombreDepartamento)) {
                    return departamento;
                }
            }
        }
        return null;
    }

    public List<Profesor> obtenerProfesores() {
        List<Profesor> profesoresUniversidad = new ArrayList<>();
        for (Facultad facultad : facultades) {
            profesoresUniversidad.addAll(facultad.obtenerProfesores());
        }
        return profesoresUniversidad;
    }

    public List<Administrativo> obtenerAdministrativos() {
        List<Administrativo> administrativosUniversidad = new ArrayList<>();
        for (Facultad facultad : facultades) {
            for (Departamento departamento : facultad.getDepartamentos()) {
                administrativosUniversidad.addAll(departamento.getAdministrativos());
            }
        }
        return administrativosUniversidad;
    }
}


