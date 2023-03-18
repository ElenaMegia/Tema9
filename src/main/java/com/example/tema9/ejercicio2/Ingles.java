package com.example.tema9.ejercicio2;

import java.util.Scanner;

public class Ingles  implements Traducir{
    private Scanner sc = new Scanner(System.in);
    private  double distancia;
    private double tiempo;
    private double velocidad;

    @Override
    public void introducirDis() {
        System.out.println("Enter the travelled distance (km).");
        distancia = sc.nextDouble();
    }

    @Override
    public void introTiem( ) {
        System.out.println("Enter the time of the trip (min).");
        tiempo = sc.nextInt();
    }

    @Override
    public void ResouestaI() {
        final int CST = 60;
        velocidad = distancia/(tiempo/CST);
        velocidad = Math.round(velocidad*100.0)/100.0;
    }

    @Override
    public void RespuestaF() {
        System.out.println("You have moved at a speed of " + velocidad + " km/h.");

    }

}
