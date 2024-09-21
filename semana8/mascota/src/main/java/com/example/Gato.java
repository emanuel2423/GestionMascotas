package com.example;

public class Gato extends Mascotas {

    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + nombre + " maulla: ¡Miau, miau!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + nombre + " con alimento balanceado.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + nombre + " cepillándolo y jugando con él.");
    }
}

