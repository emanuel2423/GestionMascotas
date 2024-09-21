package com.example;

public class Pajaro extends Mascotas{

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro " + nombre + " canta: ¡Pío, pío!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + nombre + " con semillas y frutas.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + nombre + " cambiando su jaula y dándole tiempo fuera.");
    }
}

