/*
 *Calcular la suma de las áreas de 8 círculos cuyos radios son 18.9, 16.7,
71.9, 4.6, 6.7, 5.6. 4.7y 10.
 */
package Ecuaciones;
/**
**
@author nefij
*/
public class Ejercicio_10 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula la suma de las Areas de 8 circulos\n");
//VARIABLES
// declarando una constante
double A1,A2,A3,A4,A5,A6,A7,A8,A; // declaración de variables
double r1=18.9 ,r2=16.7 ,r3=71.9 ,r4=4.6 ,r5=6.7 ,r6=5.6 ,r7=4.7 ,r8=10;
final double PI = 3.14;
System.out.println("DATOS:");
System.out.println("PI = 3.14");
System.out.println("Primer circulo su radio es: 18.9");
System.out.println("Segundo circulo su radio es: 16.7");
System.out.println("Tercer circulo su radio es: 71.9");
System.out.println("Cuarto circulo su radio es: 4.6");
System.out.println("Quinto circulo su radio es: 6.7");
System.out.println("Sexto circulo su radio es: 5.6");
System.out.println("Septimo circulo su radio es: 4.7");
System.out.println("Octavo circulo su radio es: 10\n");
System.out.println("FORMULA: PI x r^2\n");
//PROCESO
A1= PI*(r1*r1);
A2= PI*(r2*r2);
A3= PI*(r3*r3);
A4= PI*(r4*r4);
A5= PI*(r5*r5);
A6= PI*(r6*r6);
A7= PI*(r7*r7);
A8= PI*(r8*r8);
A= A1+A2+A3+A4+A5+A6+A7+A8;
//SALIDA
System.out.println("AREA DEL PRIMER CIRCULO: "+A1);
System.out.println("AREA DEL SEGUNDO CIRCULO: "+A2);
System.out.println("AREA DEL TERCER CIRCULO: "+A3);
System.out.println("AREA DEL CUARTO CIRCULO: "+A4);
System.out.println("AREA DEL QUINTO CIRCULO: "+A5);
System.out.println("AREA DEL SEXTO CIRCULO: "+A6);
System.out.println("AREA DEL SEPTIMO CIRCULO: "+A7);
System.out.println("AREA DEL OCTAVO CIRCULO: "+A8);
System.out.println("\nLA SUMA DE LAS 8 AREAS ES: "+A);
}
}