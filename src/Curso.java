import java.util.ArrayList; 
import java.util.List;

public class Curso {
    // Usamos una Lista 
    private List<Estudiante> listaEstudiantes;

    public Curso() {
        this.listaEstudiantes = new ArrayList<>();
    }

    // Método para Inscribir 
    public void inscribirEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
        System.out.println("-> Estudiante inscrito exitosamente.");
    }

    // Método para Mostrar 
    public void mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("-> No hay estudiantes inscritos.");
        } else {
            System.out.println("--- Lista de Estudiantes ---");
            for (Estudiante e : listaEstudiantes) {
                System.out.println(e.toString()); 
            }
        }
    }

    // Método para Calcular Promedio
    public void calcularPromedio() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("-> No hay notas para promediar.");
            return;
        }

        double suma = 0;
        for (Estudiante e : listaEstudiantes) {
            suma += e.getNota();
        }

        double promedio = suma / listaEstudiantes.size();
        System.out.printf("-> El promedio del curso es: %.2f%n", promedio);
    }
}