package com.company;

public class Problema2 {

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();

        System.out.println(miCoche.numeroPuertas);
    }
}

class Coche {
        public int numeroPuertas=0;

        public void IncrementarPuertas(){
            this.numeroPuertas++;
        }
}

