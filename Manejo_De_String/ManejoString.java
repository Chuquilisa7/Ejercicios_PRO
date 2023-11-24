package Manejo_De_String;

public class ManejoString {
    public static void main(String[] args) {

        String texto = "Ingrese un texto que contenga letras en Mayusculas y minusculas";
        char letra = 0;

        //Mayusculas//
        Manipulacion_de_String manipulacionDeString = new Manipulacion_de_String();
        int Mayusculas = manipulacionDeString.contadorMayusculas(texto);
        System.out.println("Numero o cantidad de Mayusculas; " +Mayusculas);

        //Contador de Letras//
        int repeticion = manipulacionDeString.contadorLetras(texto, letra);
        System.out.println("La letras: " +letra+ "aparece " +repeticion+ "veces");


        //Eliminacion de Espacios//
        manipulacionDeString.eliminarEspacios(texto);

        //Alreves//
        String reverso = manipulacionDeString.Alreves(texto);
        System.out.println("El texto esta al reves" + reverso);
    }
}
