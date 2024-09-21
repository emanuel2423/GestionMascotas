package com.example;

public class Perro extends Mascotas {

    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " ladra: ¡Guau, guau!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + nombre + " con croquetas.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + nombre + " con paseos y baños regulares.");
    }
}
