package Vector_de_Objetos;

public class TiendadeComputadoras {
    public TiendadeComputadoras(String miTienda, String propietario, String number, int i) {
    }

    public void agregarComputadoras(Computador comp2) {
    }

    public void listarComputadores() {
    }

    public void buscarComputadorPorMarca(String marca1) {
    }

    public void eliminarComputadorPorMarca(String marca2) {
    }

    public class TiendaComputadoras {
        private String nombreTienda;
        private String propietario;
        private String identificadorTributario;
        private Computador[] inventario;
        private int cantidadComputadores;

        // Constructor
        public TiendaComputadoras(String nombreTienda, String propietario, String identificadorTributario, int capacidadMaxima) {
            this.nombreTienda = nombreTienda;
            this.propietario = propietario;
            this.identificadorTributario = identificadorTributario;
            this.inventario = new Computador[capacidadMaxima];
            this.cantidadComputadores = 0;
        }

        // Agregar un computador al inventario//
        public void agregarComputadoras(Computador computador) {
            if (cantidadComputadores < inventario.length) {
                inventario[cantidadComputadores] = computador;
                cantidadComputadores++;
                System.out.println("Computador agregado correctamente.");
            } else {
                System.out.println("No hay espacio en el inventario para agregar más computadores.");
            }
        }

        // Eliminar un computador por su marca//
        public void eliminarComputadorPorMarca(String marca) {
            for (int i = 0; i < cantidadComputadores; i++) {
                if (inventario[i].getMarca().equalsIgnoreCase(marca)) {
                    inventario[i] = inventario[cantidadComputadores - 1];
                    inventario[cantidadComputadores - 1] = null;
                    cantidadComputadores--;
                    System.out.println("Computador eliminado correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún computador de esa marca.");
        }

        // Buscar un computador por su marca//
        public void buscarComputadorPorMarca(String marca) {
            for (int i = 0; i < cantidadComputadores; i++) {
                if (inventario[i].getMarca().equalsIgnoreCase(marca)) {
                    System.out.println("Computador encontrado:\n" + inventario[i]);
                    return;
                }
            }
            System.out.println("No se encontró ningún computador de esa marca.");
        }

        // Listar la información de todos los computadores en la tienda//
        public void listarComputadores() {
            if (cantidadComputadores == 0) {
                System.out.println("La tienda no tiene computadores en inventario.");
            } else {
                System.out.println("Inventario de la tienda:");
                for (int i = 0; i < cantidadComputadores; i++) {
                    System.out.println("Computador " + (i + 1) + ":\n" + inventario[i]);
                }
            }
        }
    }
}
