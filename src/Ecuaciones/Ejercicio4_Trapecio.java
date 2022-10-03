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
public class Ejercicio4_Trapecio {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula el perimetro y area del trapecio");
//AREA
System.out.println("AREA");
//VARIABLES
float l,m,n,o,b,B,h,A,P;
Scanner teclado =new Scanner (System.in);
System.out.print("ingrese la base menor: ");
b=teclado.nextFloat();
System.out.print("ingrese la base mayor: ");
B=teclado.nextFloat();
System.out.print("ingrese la altura: ");
h=teclado.nextFloat();
//PROCESO
A= (h*(B+b))/2;
//SALIDA
System.out.println("EL AREA DEL TRAPECIO ES:"+A);
//PERIMETRO
System.out.println("PERIMETRO");
System.out.print("ingrese el lado1: ");
l=teclado.nextFloat();
System.out.print("ingrese el lado2: ");
m=teclado.nextFloat();
System.out.print("ingrese el lado3: ");
n=teclado.nextFloat();
System.out.print("ingrese el lado4: ");
o=teclado.nextFloat();
//PROCESO
P= l+m+n+o;
//SALIDA
System.out.println("EL PERIMETRO DEL TRAPECIO ES:"+P);
}
}