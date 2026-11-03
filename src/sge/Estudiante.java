
package sge;

// Clase que representa a un estudiante del sistema.
public class Estudiante {

    // Atributos del estudiante.
    private int id;
    private String nombre;
    private int edad;
    private String programaAcademico;

    // Constructor: permite crear un estudiante con sus datos.
    public Estudiante(int id, String nombre, int edad,
                      String programaAcademico) {

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.programaAcademico = programaAcademico;
    }

    // Métodos para consultar los atributos.
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    // Método para mostrar los datos del estudiante.
    public void mostrarDatos() {

        System.out.println("------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Programa académico: "
                           + programaAcademico);
        System.out.println("------------------------------");
    }
}
