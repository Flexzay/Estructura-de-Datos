import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso(); 
        int opcion = 0;

        // Bucle del menú
        do {
            System.out.println("\n--- GESTIÓN DE CURSO ---");
            System.out.println("1. Inscribir Estudiante");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Calcular Promedio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese Nota : ");
                    double nota = scanner.nextDouble();
                    
                    Estudiante nuevo = new Estudiante(codigo, nombre, apellido, nota);
                    curso.inscribirEstudiante(nuevo);
                    break;
                case 2:
                    curso.mostrarEstudiantes();
                    break;
                case 3:
                    curso.calcularPromedio();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}