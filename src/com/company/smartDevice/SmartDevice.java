package com.company.smartDevice;

public abstract class SmartDevice {

    String marca;
    Integer precio;
    String sistemaOperativo;
    String color;

    public SmartDevice() { }

    public SmartDevice(String marca, Integer precio, String sistemaOperativo, String color) {
        this.marca = marca;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
    }

}
