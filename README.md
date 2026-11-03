# Sistema de Gestión de Estudiantes (SGE) básico

## Descripción del proyecto

El Sistema de Gestión de Estudiantes (SGE) es una aplicación de consola desarrollada en Java mediante Apache NetBeans.

Su objetivo es permitir el registro, consulta y búsqueda de estudiantes, aplicando conceptos fundamentales de algoritmos y programación.

Este proyecto fue desarrollado como actividad académica de la Fundación Universitaria Compensar.

## Funcionalidades

- Registrar estudiantes con ID, nombre, edad y programa académico.
- Validar que no existan identificadores duplicados.
- Mostrar la lista completa de estudiantes registrados.
- Visualizar estudiantes en orden de registro y orden inverso.
- Calcular la suma y el promedio de las edades.
- Buscar estudiantes mediante su ID.
- Validar entradas numéricas y campos vacíos.
- Finalizar la ejecución mediante el menú principal.

## Tecnologías utilizadas

- Lenguaje de programación: Java.
- Entorno de desarrollo: Apache NetBeans.
- Estructura de datos: ArrayList.
- Paradigma: programación orientada a objetos.

## Estructuras de control implementadas

El sistema utiliza las siguientes estructuras:

- `if` y `if-else`: validaciones y decisiones.
- `switch`: selección de opciones del menú.
- `while`: repetición del menú principal.
- `do-while`: validación de datos ingresados.
- `for`: recorrido ascendente y descendente de la lista.

También implementa variables de conteo, sumatoria y bandera.

## Instrucciones de ejecución

1. Descargar el repositorio desde GitHub.
2. Abrir Apache NetBeans.
3. Seleccionar **File → Open Project**.
4. Buscar y seleccionar la carpeta del proyecto.
5. Abrir la clase `SGE.java`, ubicada en el paquete `sge`.
6. Seleccionar **Run File** para ejecutar el programa.

Es necesario contar con un JDK compatible con el proyecto.

## Estructura del proyecto

Los archivos principales son:

- `src/sge/Estudiante.java`: representa los datos de cada estudiante.
- `src/sge/SGE.java`: contiene el menú y las funciones del sistema.
- `nbproject/`: contiene la configuración del proyecto NetBeans.
- `build.xml`: contiene instrucciones de construcción del proyecto.

## Autor

**Kevin Santiago Páez Ayala**

**Institución:** Fundación Universitaria Compensar  
**Asignatura:** Algoritmos y Programación  
**Grupo:** 2310-1B MOM 2 VIRTUAL: 2026 2  
**Instructora:** Lina Fernanda Urrutia Lara  
**Fecha de entrega:** 2 de noviembre de 2026

## Propósito académico

Demostrar la aplicación práctica de estructuras de control, variables especiales, listas dinámicas, validaciones de entrada y conceptos básicos de eficiencia algorítmica mediante el desarrollo de un programa funcional.
