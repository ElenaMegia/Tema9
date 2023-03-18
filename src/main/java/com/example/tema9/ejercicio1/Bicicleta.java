package com.example.tema9.ejercicio1;



public class Bicicleta extends Vehiculo {
    private int velocidades;
    double precio = 4.90;

    public Bicicleta(String marca, String modelo, int fechaDeCompra, int velocidades) {
        super(marca, modelo, fechaDeCompra);
        this.velocidades = velocidades;
    }

    public int getVelocidades() {
        return this.velocidades;
    }

    public double getPrecio() {
        return Math.round(this.precio*100.0)/100.0;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Bicis " + getMarca() + " " + getModelo()  + "(" + getFechaDeCompra() + " años) " + getVelocidades() + " velocidades.  ----- " + getPrecio() + "€/hora");

    }

}
