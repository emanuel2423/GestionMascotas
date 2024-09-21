package com.example;

public class tortuga extends Mascotas {

    public tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La tortuga " + nombre + " no hace mucho ruido, pero puede hacer un suave 'grug grug'.");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar a " + nombre + " con vegetales y pellets especiales.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidar a " + nombre + " manteniendo su hábitat limpio y proporcionando agua.");
    }
}


