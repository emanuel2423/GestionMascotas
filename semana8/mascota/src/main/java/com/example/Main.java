package com.example;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Max", "Canino", "Labrador", 3, "Mediano", "Dorado", "Saludable");
        Gato gato = new Gato("Luna", "Felino", "Siamés", 2, "Pequeño", "Blanco", "Saludable");
        Pajaro pajaro = new Pajaro("Tweety", "Aviar", "Canario", 1, "Pequeño", "Amarillo", "Saludable");
        tortuga tortuga = new tortuga("Tomy", "Reptil", "Tortuga de tierra", 5, "Grande", "Verde", "Saludable");

        
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();
        perro.mostrarInformacion();
        
        System.out.println();
        
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar();
        gato.mostrarInformacion();
        
        System.out.println();
        
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();
        pajaro.mostrarInformacion();
        
        System.out.println();
        
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();
        tortuga.mostrarInformacion();
    }

}
