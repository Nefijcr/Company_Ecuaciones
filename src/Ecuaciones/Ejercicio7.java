/*
 * Realizar un programa que permita ingresar 10 números por teclado, el
programa debe calcular la multiplicación entre la suma de los primeros 5 números y la suma
de los 5 últimos números.
 */
package Ecuaciones;

import java.util.Scanner;

/**
**
@author nefij
*/
public class Ejercicio7 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula la multiplicacion entre la suma de los primeros 5 numeros y la suma de los 5 ultimos numeros");
//VARIABLES
int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,R;
Scanner teclado =new Scanner (System.in);
System.out.print("ingrese los 10 numeros\n");
n1=teclado.nextInt();
n2=teclado.nextInt();
n3=teclado.nextInt();
n4=teclado.nextInt();
n5=teclado.nextInt();
n6=teclado.nextInt();
n7=teclado.nextInt();
n8=teclado.nextInt();
n9=teclado.nextInt();
n10=teclado.nextInt();
//PROCESO
R= (n1+n2+n3+n4+n5)*(n6+n7+n8+n9+n10);
//SALIDA
System.out.println("EL RESULTADO ES: "+R);
}
}