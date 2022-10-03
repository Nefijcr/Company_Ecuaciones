/*
 *Realizar un programa que permita calcular la suma de 5 números
 */
package Ecuaciones;

import java.util.Scanner;

/**
**
@author nefij
*/
public class Ejercicio3 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula la suma de 5 numeros");
//VARIABLES
int n1,n2,n3,n4,n5,s;
Scanner teclado=new Scanner(System.in);
System.out.print("Numero 1:");
n1=teclado.nextInt();
System.out.print("Numero 2:");
n2=teclado.nextInt();
System.out.print("Numero 3:");
n3=teclado.nextInt();
System.out.print("Numero 4:");
n4=teclado.nextInt();
System.out.print("Numero 5:");
n5=teclado.nextInt();
//PROCESO
s=n1+n2+n3+n4+n5;
//SALIDA
System.out.println("Suma="+s);
}
}