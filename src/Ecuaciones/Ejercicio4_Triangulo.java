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
public class Ejercicio4_Triangulo {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula el perimetro y area del triangulo");
Scanner objeto =new Scanner (System.in);
//AREA
System.out.println("AREA");
//VARIABLES
Double b,h,l,m,n,A,P;
System.out.print("ingrese la Base: ");
b=objeto.nextDouble();
System.out.print("ingrese la Altura: ");
h=objeto.nextDouble();
//PROCESO
A=(b*h)/2;
//SALIDA
System.out.println("EL AREA DEL TRIANGULO ES:"+A);
//PERIMETRO
System.out.println("PERIMETRO");
System.out.print("ingrese el Lado1: ");
l=objeto.nextDouble();
System.out.print("ingrese el Lado2: ");
m=objeto.nextDouble();
System.out.print("ingrese el Lado3: ");
n=objeto.nextDouble();
//PROCESO
P=l+m+n;
//SALIDA
System.out.println("EL PERIMETRO DEL TRIANGULO ES:"+P);
}
}