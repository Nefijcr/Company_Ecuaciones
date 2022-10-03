/*
 * Realizar un programa que calcule el perímetro y área de las siguientes figuras
geométricas:
 */
package Ecuaciones;

import java.util.Scanner;

/**
**
@author nefij
*/
public class Ejercicio4_Rectangulo {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula el perimetro y area del rectangulo");
//AREA
System.out.println("AREA");
//VARIABLES
float b,h,A,P;
Scanner teclado =new Scanner (System.in);
System.out.print("ingrese la base: ");
b=teclado.nextFloat();
System.out.print("ingrese la altura: ");
h=teclado.nextFloat();
//PROCESO
A= b*h;
//SALIDA
System.out.println("EL AREA DEL RECTANGULO ES:"+A);
//PERIMETRO
System.out.println("PERIMETRO");
System.out.print("ingrese la base: ");
b=teclado.nextFloat();
System.out.print("ingrese la altura: ");
h=teclado.nextFloat();
//PROCESO
P= (2*b)+(2*h);
//SALIDA
System.out.println("EL PERIMETRO DEL RECTANGULO ES:"+P);
}
}