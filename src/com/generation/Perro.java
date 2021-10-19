package com.generation;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    public Perro(){

    }

    public Perro(String nombre){
        this.nombre = nombre;
    }

    public Perro(int edad){
        this.edad = edad;
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perro(String nombre, String raza, int edad, String tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public void caractericticas(){
        System.out.println("Hola mi nombre es "+this.nombre
                +", soy de raza "+this.raza+", tengo " +this.edad+" años. Soy de tamaño "+this.tamanio);
    }
    public void nombrePerro(){
        System.out.println("Hola mi nombre es "+this.nombre);
    }
    public void comer(){
        System.out.println(nombre+": Estoy comiendo");
    }
    public void dormir(){
        System.out.println(nombre+": Roncando zZzZzZzZ");
    }
    public void jugar(){
        System.out.println(nombre+": Vamos a jugar woof woof");
    }

}
