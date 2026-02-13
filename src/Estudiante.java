public class Estudiante {
    // Atributos privados
    private String codigo;
    private String nombre;
    private String apellido;
    private double nota;

    // Constructor
    public Estudiante(String codigo, String nombre, String apellido, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    // leer los valores
    public String getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }

    // imprimir el estudiante
    @Override
    public String toString() {
        return "ID: " + codigo + " | Nombre: " + nombre + " " + apellido + " | Nota: " + nota;
    }
}