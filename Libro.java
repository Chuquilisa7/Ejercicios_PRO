package Herencia;


public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //Imprimir Datos//
    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }

    // Métodos get y set para cada uno de los atribulos//
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

// Libro de Texto que extiende de Libro//
class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso: " + curso);
    }
}

// Libro de Texto de la Universidad Nacional de Colombia//
class LibroUNI extends LibroTexto {
    private String facultad;

    public LibroUNI(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
    }
}

// Novela que extiende de Libro//
class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Tipo: " + tipo);
    }
}

