package com.example.tema9.ejercicio2;

import com.example.tema9.OutofRangeException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    Scanner sc = new Scanner(System.in);

    public void Menu(int option) {

                switch (option) {
                    case 1:
                        Spanish espa = new Spanish();

                        espa.introducirDis();
                        espa.introTiem();
                        espa.ResouestaI();
                        espa.RespuestaF();
                        break;
                    case 2:
                        Ingles ing = new Ingles();
                        ing.introducirDis();
                        ing.introTiem();
                        ing.ResouestaI();
                        ing.RespuestaF();
                        break;
                    case 3:
                        Frances fr = new Frances();
                        fr.introducirDis();
                        fr.introTiem();
                        fr.ResouestaI();
                        fr.RespuestaF();
                        break;
                    case 4:
                        Aleman ale = new Aleman();
                        ale.introducirDis();
                        ale.introTiem();
                        ale.ResouestaI();
                        ale.RespuestaF();
                        break;
                    case 0:
                        exit(); //Salida del programa
                        break;
                }

    }


    private void switchOptions() {
        boolean repeat = false;
        do {
            try {

                repeat = false;
                System.out.println("¿En qué idioma deseas comunicarte?"
                        + "1º Español.\n"
                        + "2º Ingles.\n"
                        + "3º Francés.\n"
                        + "4º Aleman.\n"
                        + "0º Salir\n"
                        + "Porfavor escriba la opción deseada: ");
                int choice = sc.nextInt();
                if (choice < 0 || choice > 4)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 0 y 4"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Menu(choice);
            } catch (OutofRangeException exc2) {
                System.out.println(exc2.getMessage());
                repeat = true;
            } catch (InputMismatchException exc3) {
                sc.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat = true;
            }
        } while (repeat);
    }

    public static void exit () { //Metodo para salir del programa
        System.out.println("Gracias por usar nuestro programa. ¡Hasta pronto!");
    }
}
