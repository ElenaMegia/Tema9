package com.example.tema9.ejercicio1;

public class Ejercicio1 {
    Bicicleta b1 = new Bicicleta("Lapierre", "speed 400", 1, 27);
    Bicicleta b2 = new Bicicleta("Btwin", "riverside 900", 0, 10);
    Giroscopio g1 = new Giroscopio("Segway", "Nine", 0, 40);
    Giroscopio g2 = new Giroscopio("Weebot", "Echo", 1, 35);
    Segway s1 = new Segway("Immotion", "v8", 0, 40);
    Segway s2 = new Segway("Segway", "Ninebot One E+", 0, 30);


    public void Ejercicio1metodo() {
        b1.mostrar();
        b2.mostrar();
        g1.mostrar();
        g2.mostrar();
        s1.mostrar();
        s2.mostrar();


    }
}
