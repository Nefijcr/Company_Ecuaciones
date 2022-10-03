/*
 *Realizar un programa que calcule el promedio de 5 notas ingresadas por
teclado.
 */
package Ecuaciones;

import java.util.Scanner;

/**
**
@author nefij
*/
public class Ejercicio5 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula el promedio de 5 notas");
//VARIABLES
float n1,n2,n3,n4,n5,P;
Scanner teclado =new Scanner (System.in);
System.out.print("ingrese la primera nota: ");
n1=teclado.nextFloat();
System.out.print("ingrese la segunda nota: ");
n2=teclado.nextFloat();
System.out.print("ingrese la tercera nota: ");
n3=teclado.nextFloat();
System.out.print("ingrese la cuarta nota: ");
n4=teclado.nextFloat();
System.out.print("ingrese la quinta nota: ");
n5=teclado.nextFloat();
//PROCESO
P= (n1+n2+n3+n4+n5)/5;
//SALIDA
System.out.println("EL PROMEDIO ES: "+P);
}
}