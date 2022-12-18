package com.company.coche;

public class CocheMain {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }
}
