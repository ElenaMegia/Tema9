package com.example.tema9.ejercicio1;

public class Giroscopio extends Vehiculo{
    private int autonomia;
    private double precio = 9.90;

    public Giroscopio(String marca, String modelo, int fechaDeCompra, int autonomia) {
        super(marca, modelo, fechaDeCompra);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Giroscopio " + getMarca() + " " + getModelo() + "(" + getFechaDeCompra() + " años) " + getAutonomia() + " km de autonomía.  ----- " + getPrecio() + "€/hora");
    }


}