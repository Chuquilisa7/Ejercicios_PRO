package Herencia;

public class Manipulacion_de_String {

    public int contadorMayusculas(String cadena){
        int contador = 0;
        for(int i = 0;i < cadena.length(); i++){
            if(Character.isUpperCase(cadena.charAt(i))){
                contador++;
            }
        }
        return contador;
    }


    //Contador de letras//
    public int contadorLetras(String cadena, char letra){
        int contador = 0;
        cadena = cadena.toLowerCase();
        letra = Character.toLowerCase(letra);
        for(int i=0; i < cadena.length(); i++){
            if(cadena.charAt(i) == letra){
                contador++;
            }
        }
        return contador;
    }

    //Eliminacion de Espacios//
    public void eliminarEspacios(String cadena){
        String resultado = cadena.replaceAll("\\s","");
        System.out.println(resultado);
    }

    // Revserso/Alrevez//
    public String Alreves(String cadena){
        StringBuilder reverso = new StringBuilder(cadena);
        return
                reverso.reverse().toString();
    }
}
