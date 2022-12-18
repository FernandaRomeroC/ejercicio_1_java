package com.company;

public class TipoDatosMain {
    public static void main(String[] args) {

        /**
         * Tipo datos primitivos = no pueden tener valor nulo y comienzan con minúsculas
         *
         *      Enteros -> byte (1 byte), short (2 byte), int (4 byte), long (8 byte)
         *
         *      Decimales -> float (mas pequeño), double (mas grande)
         *
         *      Caracter -> char (1 caracte entre comillas simples ' ' )
         *
         *      Booleanos -> boolean (valores posibles son true o false);
         *
         *
         * Tipo de datos envoltorios = son clases que envuelven a los primitivos para que puedan ser nulos y comienzan con mayúsculas
         *
         *      Cadenas -> String (el valor debe ir entre comillas dobles " ")
         *
         */

        //Enteros
        byte byteNumber = 1;
        short shortNumber = 33;
        int intNumber = 312;
        long longNumber = 34889;
        Integer integerNumber = null;
        Long longNumberNoNull = 2323232L;

        //Decimales
        float floatNumber = 4.91f;
        double doubleNumber = 44.9342d;

        //Caracter
        char charA = 'a';

        //Booleanos
        boolean booleanTrue = true;
        boolean booleanFalse = false;

        //Cadenas
        String stringName = "Fernanda Romero Cancino";


        System.out.println(
                "byte: " + byteNumber
                + "\n" + "short: " + shortNumber
                + "\n" + "int: " + intNumber
                + "\n" + "long: " + longNumber
                + "\n" + "Integer: " + integerNumber
                + "\n" + "Long: " + longNumberNoNull
                + "\n" + "float: " + floatNumber
                + "\n" + "double: " + doubleNumber
                + "\n" + "char: " + charA
                + "\n" + "boolean: " + booleanTrue + " y " + booleanFalse
                + "\n" + "String: " + stringName
        );
    }
}
