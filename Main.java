package com.arreglos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Curso> sucursalA = new ArrayList<>();
        ArrayList<Curso> sucursalB = new ArrayList<>();
        ArrayList<Curso> sucursalC = new ArrayList<>();

        sucursalA.add(new Curso("Matemáticas", 18));
        sucursalA.add(new Curso("Física", 25));
        sucursalA.add(new Curso("Química", 20));

        sucursalB.add(new Curso("Matemáticas", 32));
        sucursalB.add(new Curso("Física", 15));
        sucursalB.add(new Curso("Química", 28));
        sucursalB.add(new Curso("Biología", 32));
        sucursalB.add(new Curso("Historia", 32));
        sucursalB.add(new Curso("Geografía", 32));

        sucursalC.add(new Curso("Literatura", 18));
        sucursalC.add(new Curso("Artes", 25));
        sucursalC.add(new Curso("Botánica", 20));
        sucursalC.add(new Curso("Programación", 34));

        System.out.println("===== SUCURSAL A =====");
        for (Curso curso : sucursalA) {
            System.out.println(curso);

        }

        System.out.println("\n===== SUCURSAL B =====");
        for (Curso curso : sucursalB) {
            System.out.println(curso);

        }

        System.out.println("\n===== SUCURSAL C =====");
        for (Curso curso : sucursalC) {
            System.out.println(curso);

        }


 



    }
}