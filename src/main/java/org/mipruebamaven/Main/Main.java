package org.mipruebamaven.Main;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Persona alumno = new Persona("Omar", 1252522);
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Matricula: " + alumno.getMatricula());
    }
}
