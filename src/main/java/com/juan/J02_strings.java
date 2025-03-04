package com.juan;

import java.util.Locale;
import java.util.Scanner;

public class J02_strings {

    String apellido = "Rico";

    String apellido2 = new String("Hola Juan");

    // METODOS DE LOS STRINGS
    // length
    public static String materia = "Matematicas";
    public static int longitud = materia.length();

    // charAt(int index):
    public static char letra = materia.charAt(4);

    // substring(int inicial, int final *no la contiene)
    public static String subCadena = materia.substring(2, 4);

    // toLowerCase y to UpperCase
    public static String mayusculas = materia.toUpperCase();

    // trim
    static String palabra = "    Java     ";
    public static String sinEspacios = palabra.trim();

    // replace(char oldChar, char newChar)
    public static String nuevaPalabra = palabra.replace('a', 'i');

    // split(String delimitador)
    public static String deporte = "Tennis";
    public static String[] arreglo = deporte.split("");

    // caso para tener en cuenta mas adelante
    //    public static void prueba(){
    //        String prueba1 = "Hola";
    //        String prueba2 = "Que mas";
    //    }

    // Impresion de STRINGS
    // Concatenacion
    static String name = "Juan";
    static String apellido1 = "Rico";
    static String nombreCompleto = name + " " + apellido1;

    // String.format()
    static String lenguaje = "Java";
    static String version = "Git";
    static String messageF = String.format("Estamos aprendiendo %s y para control de versiones %s", lenguaje, version);

    // Especificadores
    // %s : Strings
    // %d : enteros
    // %f (%.2f) : numero de punto flotante (decimales)
    // %b : booleanos

    // Text Blocks
    static String framework = "Spring";
    static float versionF = 3.4f;

    static String messageBlock = """
            El framework %s
            tiene su ultima version
            V. %.1f
            """.formatted(framework, versionF);

    // SCANNER entrada de datos desde consola
    // ya hicimos un commit
    static void testScanner(){
        // Estamos probando git clone

    }
}


