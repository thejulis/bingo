package com.arreglos;

import java.util.Random;

public final class Curso {
  
    private final String nombreCurso;
   private final int cantMaxAlumnos;
   private final int cantInscritos;

   public Curso(String nombreCurso, int cantInscritos) {
       this.nombreCurso = nombreCurso;
       Random r = new Random();
       int capacidad = r.nextInt(16) + 20; // entre 20 y 35
       this.cantMaxAlumnos = capacidad;
       if (cantInscritos > capacidad) {
           System.out.println(
               "El número de alumnos inscritos no puede pasar de "
               + capacidad
           );
           this.cantInscritos = capacidad;
       } else {
           this.cantInscritos = cantInscritos;
       }
   }
   public String getNombreCurso() {
       return nombreCurso;
   }
   public int getCantMaxAlumnos() {
       return cantMaxAlumnos;
   }
   public int getCantInscritos() {
       return cantInscritos;
   }
   @Override
   public String toString() {
       return "Curso: [" + nombreCurso +
              "], Inscritos: [" + cantInscritos +
              "], Capacidad Máxima: [" + cantMaxAlumnos + "]";
   }
}