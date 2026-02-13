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
            System.out.println("4. Calcular Mayor Nota");
            System.out.println("5. Calcular Menor Nota");
            System.out.println("6. Mostrar reprobados");
            System.out.println("7. Salir");
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
                    curso.mayorNota();
                    break;
                case 5:
                    curso.menorNota();
                    break;
                case 6:
                    curso.reprobados();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}