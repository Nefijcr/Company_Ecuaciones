/*
 * Calcular el área de un circulo sabiendo que pi = 3,14159265 A= pi x r^2,
sabiendo que r=5.
 */
package Ecuaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
**
@author nefij
*/
public class Ejercicio8 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) throws IOException {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula el Area de un circulo");
//VARIABLES
final double PI = 3.14; // declarando una constante
double A; // declaración de variables
double r = 5;
System.out.println("PI = 3.14");
System.out.println("r = 5");
System.out.println("FORMULA: PI x r^2");
// configuración del bufer de entrada
BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
String entrada;
//PROCESO
A= PI*(r*r);
//SALIDA
System.out.println("EL AREA DEL CIRCULO ES: "+A);
}
}