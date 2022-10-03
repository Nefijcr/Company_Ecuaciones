/*
 * Calcular la suma de las áreas de 3 círculos cuyos radios son 8.9, 6.7 y 7.9
 */
package Ecuaciones;
/**
**
@author nefij
*/
public class Ejercicio9 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula la suma de las Areas de 3 circulos\n");
//VARIABLES
// declarando una constante
double A1,A2,A3,A; // declaración de variables
double r1 = 8.9 ,r2 = 6.7 ,r3 = 7.9;
final double PI = 3.14;
System.out.println("DATOS:");
System.out.println("PI = 3.14");
System.out.println("Primer circulo su radio es: 8.9");
System.out.println("Sugundo circulo su radio es: 6.7");
System.out.println("Tercer circulo su radio es: 7.9\n");
System.out.println("FORMULA: PI x r^2\n");
//PROCESO
A1= PI*(r1*r1);
A2= PI*(r2*r2);
A3= PI*(r3*r3);
A= A1+A2+A3;
//SALIDA
System.out.println("AREA DEL PRIMER CIRCULO: "+A1);
System.out.println("AREA DEL SEGUNDO CIRCULO: "+A2);
System.out.println("AREA DEL TERCER CIRCULO: "+A3);
System.out.println("\nLA SUMA DE LAS 3 AREAS ES: "+A);
}
}