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
public class Ejercicio4_Cuadrado {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula el perimetro y area del cuadrado");
//AREA
System.out.println("AREA");
//VARIABLES
float a,A,P;
Scanner teclado =new Scanner (System.in);
System.out.print("ingrese el lado: ");
a=teclado.nextFloat();
//PROCESO
A= a*a;
//SALIDA
System.out.println("EL AREA DEL CUADRADO ES:"+A);
//PERIMETRO
System.out.println("PERIMETRO");
System.out.print("ingrese el Lado: ");
a=teclado.nextFloat();
//PROCESO
P= 4*a;
//SALIDA
System.out.println("EL PERIMETRO DEL CUADRADO ES:"+P);
}
}