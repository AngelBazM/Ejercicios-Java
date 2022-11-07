package com.programacion.boletin1.ejercicio12;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int manyEuros;

    static int[] arrayEuros = new int[7];

    public static void entryInterface(){
        System.out.println(" ");
        System.out.println("Escribe un número: ");
        manyEuros = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a mostrar " + manyEuros + " en billetes mas grandes posibles:");

    }

    public static void calculateEuros() {
        arrayEuros[0] = manyEuros / 500;
        manyEuros = manyEuros -arrayEuros[0]*500;

        arrayEuros[1] = manyEuros / 200;
        manyEuros = manyEuros -arrayEuros[1]*200;

        arrayEuros[2] = manyEuros / 100;
        manyEuros = manyEuros -arrayEuros[2]*100;

        arrayEuros[3] = manyEuros / 50;
        manyEuros = manyEuros -arrayEuros[3]*50;

        arrayEuros[4] = manyEuros / 20;
        manyEuros = manyEuros -arrayEuros[4]*20;

        arrayEuros[5] = manyEuros / 10;
        manyEuros = manyEuros -arrayEuros[5]*10;

        arrayEuros[6] = manyEuros / 5;
        manyEuros = manyEuros -arrayEuros[6]*5;
    }

    public static void showSolution() {
        System.out.println(arrayEuros[0]+" Billetes de 500");
        System.out.println(arrayEuros[1]+" Billetes de 200");
        System.out.println(arrayEuros[2]+" Billetes de 100");
        System.out.println(arrayEuros[3]+" Billetes de 50");
        System.out.println(arrayEuros[4]+" Billetes de 20");
        System.out.println(arrayEuros[5]+" Billetes de 10");
        System.out.println(arrayEuros[6]+" Billetes de 5");
        System.out.println(manyEuros+" Euros sueltos");
    }

    public static void main(String[] args) {
        entryInterface();
        calculateEuros();
        showSolution();
    }


}
