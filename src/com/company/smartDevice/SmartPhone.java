package com.company.smartDevice;

public class SmartPhone extends SmartDevice {
    boolean conexion5g;
    boolean conexionBluetooth;

    public SmartPhone() { }

    public SmartPhone(boolean conexion5g, boolean conexionBluetooth) {
        this.conexion5g = conexion5g;
        this.conexionBluetooth = conexionBluetooth;
    }

    public SmartPhone(String marca, Integer precio, String sistemaOperativo, String color, boolean conexion5g, boolean conexionBluetooth) {
        super(marca, precio, sistemaOperativo, color);
        this.conexion5g = conexion5g;
        this.conexionBluetooth = conexionBluetooth;
    }

    @Override
    public String toString() {
        return "SmartPhone" +
                "\n------------------"+
                "\n conexion 5G : " + conexion5g +
                "\n conexion bluetooth : " + conexionBluetooth +
                "\n marca : " + marca +
                "\n precio : " + precio +
                "\n sistema operativo : " + sistemaOperativo  +
                "\n color : " + color ;
    }
}
