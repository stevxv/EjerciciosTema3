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

        Coche miCoche = new Coche();

        System.out.println("El coche tenia " + miCoche.puertas + " puertas.");

        miCoche.addPuerta();

        System.out.println("Ahora, el coche tiene " + miCoche.puertas + " puertas.");
    }
}
