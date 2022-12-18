package com.company.smartDevice;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        SmartPhone smartPhone1 = new SmartPhone("Apple", 30000, "Apple", "gris", true,false);

        SmartWatch smartWatch = new SmartWatch();
        SmartWatch smartWatch1 = new SmartWatch("LG", 234000, "Tizen", "negro", 9.0 );

        System.out.println(smartPhone1);
        System.out.println("\n=====================\n");
        System.out.println(smartWatch1);
    }
}
