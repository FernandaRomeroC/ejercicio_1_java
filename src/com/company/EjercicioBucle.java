package com.company;

public class EjercicioBucle {

    public static void main(String[] args) {

        String[] listNombres = {"Francisco", "Javier", "Martina", "Rafaela"};

        for ( String nombre: listNombres ) {
            System.out.println("Estudiante " + nombre + " faltó a clases hoy");
        }

    }
}
