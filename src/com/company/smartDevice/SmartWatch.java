package com.company.smartDevice;

public class SmartWatch extends SmartDevice {
    double duracionBateriaHr;

    public SmartWatch() { }

    public SmartWatch(double duracionBateriaHr) {
        this.duracionBateriaHr = duracionBateriaHr;
    }

    public SmartWatch(String marca, Integer precio, String sistemaOperativo, String color, double duracionBateriaHr) {
        super(marca, precio, sistemaOperativo, color);
        this.duracionBateriaHr = duracionBateriaHr;
    }

    @Override
    public String toString() {
        return "SmartWatch" +
                "\n----------------"+
                "\n duracion bateria en Hr : " + duracionBateriaHr +
                "\n marca : " + marca +
                "\n precio : " + precio +
                "\n sistema operativo : " + sistemaOperativo +
                "\n color : " + color ;
    }
}
