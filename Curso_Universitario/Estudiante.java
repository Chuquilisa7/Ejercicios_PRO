package Curso_Universitario;

import java.util.Scanner;

public class Estudiante {
    String nombre;
    String apellidos;
    int codigo;
    int numSemestre;
    double notaFinal;

    // Constructor de Estudiante//
    public Estudiante(String nombre, String apellidos, int codigo, int numSemestre, double notaFinal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.numSemestre = numSemestre;
        this.notaFinal = notaFinal;
    }
}

class Curso {
    Estudiante[] estudiantes;
    int cantidadEstudiantes;
    int capacidad;

    // Constructor de Curso//
    public Curso(int capacidadMaxima) {
        this.capacidad = capacidadMaxima;
        estudiantes = new Estudiante[capacidadMaxima];
        cantidadEstudiantes = 0;
    }
    //Añadir o Agregar Estudiante//
    public void agregarEstudiante() {
        Scanner scanner = new Scanner(System.in);

        if (cantidadEstudiantes < capacidad) {
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese los apellidos del estudiante:");
            String apellidos = scanner.nextLine();

            System.out.println("Ingrese el código del estudiante:");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Verificar si el código ya existe//
            boolean codigoExistente = false;
            for (int i = 0; i < cantidadEstudiantes; i++) {
                if (estudiantes[i].codigo == codigo) {
                    codigoExistente = true;
                    break;
                }
            }

            if (!codigoExistente) {
                System.out.println("Ingrese el número de semestre del estudiante:");
                int numSemestre = scanner.nextInt();

                System.out.println("Ingrese la nota final del estudiante:");
                double notaFinal = scanner.nextDouble();

                // Crear el nuevo estudiante y agregarlo al array
                Estudiante nuevoEstudiante = new Estudiante(nombre, apellidos, codigo, numSemestre, notaFinal);
                estudiantes[cantidadEstudiantes] = nuevoEstudiante;
                cantidadEstudiantes++;
                System.out.println("Estudiante agregado exitosamente.");
            } else {
                System.out.println("El código ya existe. No se pudo agregar el estudiante.");
            }
        } else {
            System.out.println("El curso está lleno. No se pueden agregar más estudiantes.");
        }
    }
    //Busqueda de Estudiante//
    public void buscarEstudiante(int codigoBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].codigo == codigoBuscado) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Apellidos: " + estudiantes[i].apellidos);
                System.out.println("Código: " + estudiantes[i].codigo);
                System.out.println("Semestre: " + estudiantes[i].numSemestre);
                System.out.println("Nota Final: " + estudiantes[i].notaFinal);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
    //Eliminacion de Estudiante//
    public void eliminarEstudiante(int codigoEliminar) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].codigo == codigoEliminar) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Apellidos: " + estudiantes[i].apellidos);
                System.out.println("Código: " + estudiantes[i].codigo);
                System.out.println("Semestre: " + estudiantes[i].numSemestre);
                System.out.println("Nota Final: " + estudiantes[i].notaFinal);

                Scanner scanner = new Scanner(System.in);
                System.out.println("¿Estás seguro de eliminar este estudiante? (Sí/No)");
                String confirmacion = scanner.nextLine();
                if (confirmacion.equalsIgnoreCase("Sí")) {
                    // Eliminar al estudiante
                    for (int j = i; j < cantidadEstudiantes - 1; j++) {
                        estudiantes[j] = estudiantes[j + 1];
                    }
                    cantidadEstudiantes--;
                    System.out.println("Estudiante eliminado exitosamente.");
                } else {
                    System.out.println("Eliminación cancelada.");
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado. No se pudo eliminar.");
        }
    }

    //Calcular el Promedio//
    public double calcularPromedio() {
        if (cantidadEstudiantes == 0) {
            return 0.0;
        }

        double sumaNotas = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            sumaNotas += estudiantes[i].notaFinal;
        }
        return sumaNotas / cantidadEstudiantes;
    }
    //Numero de Aprobados//
    public void obtenerCantidadAprobados() {
        int contadorAprobados = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].notaFinal >= 3.0) {
                contadorAprobados++;
            }
        }
        //Porcentajes//
        double porcentajeAprobados = (double) contadorAprobados / cantidadEstudiantes * 100;

        System.out.println("Cantidad de estudiantes aprobados: " + contadorAprobados);
        System.out.println("Porcentaje de estudiantes aprobados: " + porcentajeAprobados + "%");
    }
}
