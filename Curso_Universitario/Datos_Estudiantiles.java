package Curso_Universitario;

import java.util.Scanner;

public class Datos_Estudiantiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso(60);

        int opcion;
        do {
            System.out.println("\n*** Menú ***");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Calcular promedio del curso");
            System.out.println("5. Obtener cantidad de estudiantes aprobados");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    curso.agregarEstudiante();
                    break;
                case 2:
                    System.out.println("Favor de ingresar el código del estudiante a buscar:");
                    int codigoBuscar = scanner.nextInt();
                    curso.buscarEstudiante(codigoBuscar);
                    break;
                case 3:
                    System.out.println("Favor de ingresar el código del estudiante a eliminar:");
                    int codigoEliminar = scanner.nextInt();
                    curso.eliminarEstudiante(codigoEliminar);
                    break;
                case 4:
                    double promedio = curso.calcularPromedio();
                    System.out.println("El promedio del curso es: " + promedio);
                    break;
                case 5:
                    curso.obtenerCantidadAprobados();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. !Vuelva Pronto!");
                    break;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}
