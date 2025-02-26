package com.juan;

public class J01_tipos {

    static int numero = 10;

    public static void tipos(){
        // Tipos de datos primitivos
        numero = 30;
        int numero = 15; // -2,147,483,648 hasta 2,147,483,647
        byte numByte = 120; // -128 a 127
        short numShort = 20000; // -32768 a 32767
        long numeroLargo = 995646456946464L; //-9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
        double peso = 67.2; // Aprox 15 - 16 decimales
        float distancia = 12.6f; // Precision simple 7 decimales
        boolean estado = false;
        char letra = 'S';

        // constantes
        final int edad = 30;
        // edad = 40;
    }
}
