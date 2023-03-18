# Tema9

**Link al repositorio:**

[REPOSITORIO](https://github.com/ElenaMegia/Tema9.git)

## EJERCICIOS:
### Ejercicio 1: El alquiler de bicis
El objetivo es crear un programa que permita a una empresa de alquiler de bicicletas, mostrar los modelos que se ofrecen en alquiler y los precios.

Se pueden alquilar bicicletas, segways y giroscopios. Para todos, es necesario conocer su marca, modelo y fecha de compra. Las bicicletas están equipadas con un sistema de cambio de marchas. Algunas tienen más velocidades que otras. Los segways y los giroscopios tienen cierta autonomía en kilómetros. Debido a su manillar, el Segway requiere que su piloto tenga una altura mínima.

Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de compra.

### Ejercicio 2: Velocidad media versión plurilingüe

Requisitos previos: ejercicio 4 del capítulo El pseudocódigo

Reanudar el ejercicio del cálculo de la velocidad media para hacerlo plurilingüe.

El algoritmo, primero pide al usuario el idioma y luego se comunica con él en ese idioma.

Para hacer esto, cree una interfaz Traduccion que contenga cuatro métodos abstractos, introducirDistancia(), introducirTiempo(), inicioRespuesta() y finRespuesta(). Cree una clase que implemente esta interfaz para cada idioma deseado. Finalmente modifique el algoritmo en consecuencia.