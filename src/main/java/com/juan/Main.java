package com.juan;

import java.util.Scanner;

public class Main {

    // psvm
    public static void main(String[] args) {
        //System.out.println(J02_strings.messageF);
        //String lenguaje = "Java";
        //String version = "Git";
        //System.out.printf("Estamos aprendiendo %s y para control de versiones %s", lenguaje, version);

        //System.out.println(J02_strings.messageBlock);

        Scanner sc = new Scanner(System.in);
//        System.out.print("Dame tu nombre");
//        String nombre = sc.nextLine();
//        System.out.println("despues");
//
//        System.out.println("*************");
//        System.out.println(nombre);

        System.out.println("Dame tu edad");
        int edad = sc.nextInt();
        System.out.println("*************");
        System.out.println(edad);
        sc.close();

        System.out.println(J02_strings.messageBlock);
    }
}
























