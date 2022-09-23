package com.company;

public class PrimeraParte {
    public static void main(String[] args) {

        int resultado = sumaTresNumeros(20,30,50);

        System.out.println("La suma es " + resultado);
    }

    public static int sumaTresNumeros(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
