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

    // Metodo para sacar mayor nota

    public void mayorNota(){
        if (listaEstudiantes.isEmpty()){
             System.out.println("-> No hay notas.");
            return;
        }
        
        Estudiante mejorEstudiante = listaEstudiantes.get(0);

        for(Estudiante e: listaEstudiantes){
            if(e.getNota() > mejorEstudiante.getNota()){
                mejorEstudiante = e;
            }
        }
        System.out.println("-> Estudiante con mejor nota es: " + mejorEstudiante.toString());
    }

    //Metodo para calcular la menor nota
    public void menorNota(){
        if (listaEstudiantes.isEmpty()){
             System.out.println("-> No hay notas.");
            return;
        }
        
        Estudiante peorEstudiante = listaEstudiantes.get(0);

        for(Estudiante e: listaEstudiantes){
            if(e.getNota() < peorEstudiante.getNota()){
                peorEstudiante = e;
            }
        }
        System.out.println("-> Estudiante con menor nota es: " + peorEstudiante.toString());
    }

    public void reprobados (){
         if (listaEstudiantes.isEmpty()){
             System.out.println("-> No hay notas.");
            return;
        }
        

        for(Estudiante e: listaEstudiantes){
            if ( e.getNota() < 3.0){
                System.out.println(e + "-> Perdio la materia");
            }
        }

        
    }

    // metodo para ayudar si la nota es de 0 a 2.5 sumar +1   de 2.6  y 4.0 suma 0.8  y si s de 4.1 sumar 0.5 
    // pero si su nota es 5.0  dejar en 5 
}