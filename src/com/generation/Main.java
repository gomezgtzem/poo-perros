package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.nombre = "Oso";
        perro.edad = 2;
        perro.raza = "pastor belga";
        perro.tamanio = "grande";
        perro.caractericticas();
        perro.comer();

        Perro perro2 = new Perro();
        perro2.nombre = "Firulais";
        perro2.edad = 2;
        perro2.raza = "viejo pastor ingles";
        perro2.tamanio = "pequeño";
        perro2.caractericticas();
        perro2.dormir();

        Perro perro3 = new Perro("Milaneso");
        perro3.nombrePerro();

        Perro perro4 = new Perro("Sr. Kawamura", "husky", 4,"grande");
        perro4.caractericticas();
    }
}
