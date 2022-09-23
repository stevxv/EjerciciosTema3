package com.company;

class Coche {
    int puertas = 3;

    void addPuerta()
    {
        puertas++;
    }
}

public class SegundaParte {
    public static void main(String[] args) {

        Coche objCoche = new Coche();

        System.out.println("El coche tenia " + objCoche.puertas + " puertas.");

        objCoche.addPuerta();

        System.out.println("Ahora, el coche tiene " + objCoche.puertas + " puertas.");
    }
}
