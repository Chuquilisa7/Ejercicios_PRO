package Vector_de_Objetos;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear la tienda
        TiendadeComputadoras tienda = new TiendadeComputadoras("Mi Tienda", "Propietario", "123456", 10);

        // Crear computadoras//
        Computador comp1 = new Computador("Hp", 128, "Procesador1", "Windows", 689.99);
        Computador comp2 = new Computador("Apple", 256, "Procesador2", "MacOS", 1499.99);

        // Agregar computadoras a la tienda//
        tienda.agregarComputadoras(comp1);
        tienda.agregarComputadoras(comp2);

        // Listar computadoras//
        tienda.listarComputadores();

        // Buscar un computadoras por marca//
        tienda.buscarComputadorPorMarca("Marca1");

        // Eliminar un computadoras por marca//
        tienda.eliminarComputadorPorMarca("Marca2");

        // Listar computadores después de eliminar uno//
        tienda.listarComputadores();
    }
}

