package com.company;

public class CalculadoraIVA {

    public static void main(String[] args) {
        int precio = 50;
        System.out.println("Precio original: " + precio + "\nPrecio con IVA: " + calcularIVA(precio));
    }

    public static double calcularIVA(int precio) {
        return precio + (precio * 0.19);
    }
}
