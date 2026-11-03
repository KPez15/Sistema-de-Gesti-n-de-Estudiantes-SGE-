
package sge;

import java.util.ArrayList;
import java.util.Scanner;

public class SGE {

    // Lista donde almacenaremos los estudiantes.
    private static ArrayList<Estudiante> estudiantes =
            new ArrayList<>();

    // Variable de conteo.
    private static int conteoEstudiantes = 0;

    // Variable bandera para controlar la salida.
    private static boolean banderaSalir = false;

    // Objeto para recibir datos desde el teclado.
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Repetición condicionada al comienzo.
        while (!banderaSalir) {

            System.out.println("\n================================");
            System.out.println(" SISTEMA DE GESTION DE ESTUDIANTES");
            System.out.println("================================");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante por ID");
            System.out.println("4. Salir del sistema");
            System.out.println("================================");

            int opcion = leerEntero(
                    "Seleccione una opcion (1-4): ", 1, 4);

            // Decision multiple.
            switch (opcion) {

                case 1:
                    agregarEstudiante();
                    break;

                case 2:
                    mostrarEstudiantes();
                    break;

                case 3:
                    buscarEstudiante();
                    break;

                case 4:
                    banderaSalir = true;
                    System.out.println(
                            "Gracias por utilizar el sistema.");
                    break;
            }
        }

        teclado.close();
    }

    // Metodo para validar entradas numericas.
    public static int leerEntero(String mensaje,
                                 int minimo, int maximo) {

        int valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(teclado.nextLine());

                if (valor >= minimo && valor <= maximo) {
                    entradaValida = true;
                } else {
                    System.out.println(
                            "Error: ingrese un numero entre "
                            + minimo + " y " + maximo + ".");
                }

            } catch (NumberFormatException e) {
                System.out.println(
                        "Error: debe ingresar un numero entero.");
            }

        } while (!entradaValida);

        return valor;
    }

    // Funciones que desarrollaremos en las siguientes etapas.
    public static void agregarEstudiante() {
       
          System.out.println("\n--- REGISTRO DE ESTUDIANTE ---");

    // Solicitar el ID y comprobar que no este registrado.
    int id;

    do {
        id = leerEntero(
                "Ingrese el ID del estudiante: ",
                1, Integer.MAX_VALUE);

        if (existeId(id)) {
            System.out.println(
                    "Error: este ID ya se encuentra registrado.");
        }

    } while (existeId(id));

    // Solicitar los datos personales.
    String nombre = leerTextoNoVacio(
            "Ingrese el nombre completo: ");

    int edad = leerEntero(
            "Ingrese la edad del estudiante: ", 1, 120);

    String programa = leerTextoNoVacio(
            "Ingrese el programa academico: ");

    // Crear el objeto estudiante.
    Estudiante nuevoEstudiante = new Estudiante(
            id, nombre, edad, programa);

    // Agregar el estudiante a la lista.
    estudiantes.add(nuevoEstudiante);

    // Actualizar el contador.
    conteoEstudiantes++;

    System.out.println("\n¡Estudiante registrado exitosamente!");
    System.out.println("Total de estudiantes registrados: "
            + conteoEstudiantes);
}

// Metodo para comprobar si un ID ya existe.
public static boolean existeId(int id) {

    // Recorrer la lista de estudiantes.
    for (int i = 0; i < estudiantes.size(); i++) {

        // Comparar el ID ingresado con cada registro.
        if (estudiantes.get(i).getId() == id) {
            return true;
        }
    }

    return false;
}

// Metodo para solicitar texto y evitar campos vacios.
public static String leerTextoNoVacio(String mensaje) {

    String texto;

    do {
        System.out.print(mensaje);
        texto = teclado.nextLine().trim();

        if (texto.isEmpty()) {
            System.out.println(
                    "Error: este campo no puede estar vacio.");
        }

    } while (texto.isEmpty());

    return texto;
    }

    public static void mostrarEstudiantes() {
        
          System.out.println("\n--- LISTA DE ESTUDIANTES ---");

    // Decision simple: comprobar si existen estudiantes.
    if (estudiantes.isEmpty()) {

        System.out.println(
                "No hay estudiantes registrados en el sistema.");

    } else {

        // Mostrar la cantidad de estudiantes.
        System.out.println("Total de estudiantes: "
                + conteoEstudiantes);

        // Variable de sumatoria.
        int sumaEdades = 0;

        // Iteracion ascendente.
        System.out.println("\nESTUDIANTES EN ORDEN DE REGISTRO:");

        for (int i = 0; i < estudiantes.size(); i++) {

            Estudiante estudianteActual = estudiantes.get(i);

            // Mostrar los datos del estudiante.
            estudianteActual.mostrarDatos();

            // Acumular las edades.
            sumaEdades += estudianteActual.getEdad();
        }

        // Calcular el promedio de edad.
        double promedio = (double) sumaEdades
                / conteoEstudiantes;

        // Mostrar las estadisticas.
        System.out.println("\n--- ESTADISTICAS ---");
        System.out.println("Cantidad de estudiantes: "
                + conteoEstudiantes);
        System.out.println("Suma de las edades: "
                + sumaEdades);
        System.out.printf("Promedio de edad: %.2f%n", promedio);

        // Iteracion descendente.
        System.out.println(
                "\nESTUDIANTES EN ORDEN INVERSO:");

        for (int i = estudiantes.size() - 1; i >= 0; i--) {

            Estudiante estudianteActual = estudiantes.get(i);

            estudianteActual.mostrarDatos();
        }
    }
    }

    public static void buscarEstudiante() {
       System.out.println("\n--- BUSQUEDA DE ESTUDIANTE ---");

    // Primera decision: comprobar si existen registros.
    if (estudiantes.isEmpty()) {

        System.out.println(
                "No hay estudiantes registrados para buscar.");

    } else {
       // Solicitar el ID que se desea consultar.
        int idBuscado = leerEntero(
                "Ingrese el ID del estudiante: ",
                1, Integer.MAX_VALUE);

        // Inicializar la variable bandera.
        boolean encontrado = false;
    
     // Recorrer la lista de estudiantes.
        for (int i = 0; i < estudiantes.size(); i++) {
        
         Estudiante estudianteActual = estudiantes.get(i);
         
           // Comparar el ID buscado con el ID registrado.
            if (estudianteActual.getId() == idBuscado) {

                // Cambiar el estado de la bandera.
                encontrado = true;

                System.out.println(
                        "\n¡Estudiante encontrado!");

                // Mostrar los datos del estudiante.
                estudianteActual.mostrarDatos();

                // Detener el ciclo porque ya encontramos el registro.
                break;
            }
        }
        // Decidir el resultado de la busqueda.
        if (encontrado) {

            System.out.println(
                    "La busqueda finalizo correctamente.");

        } else {
            System.out.println(
                    "No se encontro un estudiante con el ID: "
                    + idBuscado);
        
        
        }
    }
    }
}
