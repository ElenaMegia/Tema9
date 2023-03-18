package com.example.tema9.ejercicio2;

import java.util.Scanner;

public class Frances implements Traducir{
    private Scanner sc = new Scanner(System.in);
    private  double distancia;
    private double tiempo;
    private double velocidad;

    @Override
    public void introducirDis() {
        // System.out.println("Introduzca la distancia recorrida (km)."); en frances
        System.out.println("Entrez la distance parcourue (km).");
        distancia = sc.nextDouble();


    }

    @Override
    public void introTiem() {
        // System.out.println("Introduzca el tiempo del recorrido (min)."); en frances
        System.out.println("Entrez le temps du trajet (min).");
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
        // System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h."); en frances
        System.out.println("Vous avez parcouru à une vitesse de " + velocidad + " km/h.");

    }
}
