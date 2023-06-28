import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la universidad
        Universidad universidad = new Universidad("Universidad de la Frontera", "123 Calle Principal", "Estatal");

        // Crear facultades
        Facultad facultad1 = new Facultad("Facultad de Ingenieria", "Latitud 1", "Longitud 1");
        Facultad facultad2 = new Facultad("Facultad de Ciencias", "Latitud 2", "Longitud 2");

        // Crear departamentos
        Departamento departamento1 = new Departamento("Departamento de Sistemas");
        Departamento departamento2 = new Departamento("Departamento de Matematicas");

        // Crear carreras universitarias
        CarreraUniversitaria carrera1 = new CarreraUniversitaria("Ingenieria de Software");
        CarreraUniversitaria carrera2 = new CarreraUniversitaria("Matematicas");

        // Asociar carreras universitarias a departamentos
        departamento1.agregarCarrera(carrera1);
        departamento2.agregarCarrera(carrera2);

        // Crear profesores
        Profesor profesor1 = new Profesor("Licenciado en Ingenieria de Software", "John Doe", "123 Calle Principal",
                "Soltero", "123456789-0", "Jornada Completa", "Jornada Parcial");
        Profesor profesor2 = new Profesor("Licenciado en Matematicas", "Jane Smith", "456 Calle Secundaria", "Casado",
                "987654321-0", "Jornada Parcial", "Jornada Parcial");

        // Asociar profesores a departamentos
        departamento1.agregarProfesor(profesor1);
        departamento2.agregarProfesor(profesor2);

        // Crear administrativos
        Administrativo administrativo1 = new Administrativo("Técnico en Administración", "Mark Johnson",
                "789 Calle Terciaria", "Casado", "654321987-0", "Lunes a Viernes de 9:00 a 17:00");

        // Asociar administrativos a departamentos
        departamento1.agregarAdministrativo(administrativo1);

        // Asociar departamentos a facultades
        facultad1.agregarDepartamento(departamento1);
        facultad2.agregarDepartamento(departamento2);

        // Asociar facultades a la universidad
        universidad.agregarFacultad(facultad1);
        universidad.agregarFacultad(facultad2);

        // Pruebas de los métodos creados
        System.out.println("Profesores del Departamento de Sistemas:");
        Departamento departamentoSistemas = universidad.buscarDepartamentoPorNombre("Departamento de Sistemas");
        List<Profesor> profesoresSistemas = departamentoSistemas.getProfesores();
        for (Profesor profesor : profesoresSistemas) {
            System.out.println(profesor.getNombre());
        }
        System.out.println();

        System.out.println("Carreras universitarias de la Facultad de Ciencias:");
        Facultad facultadCiencias = universidad.buscarFacultadPorNombre("Facultad de Ciencias");
        List<CarreraUniversitaria> carrerasCiencias = facultadCiencias.obtenerCarrerasUniversitarias();
        for (CarreraUniversitaria carrera : carrerasCiencias) {
            System.out.println(carrera.getNombre());
        }
        System.out.println();

        System.out.println("Profesores contratados a jornada parcial del Departamento de Matematicas:");
        Departamento departamentoMatematicas = universidad.buscarDepartamentoPorNombre("Departamento de Matematicas");
        List<Profesor> profesoresJornadaParcial = departamentoMatematicas.obtenerProfesoresPorTipoContrato("Jornada Parcial");
        for (Profesor profesor : profesoresJornadaParcial) {
            System.out.println(profesor.getNombre());
        }
        System.out.println();

        System.out.println("Todos los profesores de la Universidad:");
        List<Profesor> todosProfesores = universidad.obtenerProfesores();
        for (Profesor profesor : todosProfesores) {
            System.out.println(profesor.getNombre());
        }
        System.out.println();

        System.out.println("Todos los administrativos de la Universidad:");
        List<Administrativo> todosAdministrativos = universidad.obtenerAdministrativos();
        for (Administrativo administrativo : todosAdministrativos) {
            System.out.println(administrativo.getNombre());
        }
        System.out.println();
    }
}