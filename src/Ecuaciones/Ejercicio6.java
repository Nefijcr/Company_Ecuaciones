/*
 * Realizar un programa que calcule la multiplicación de 5 números ingresados
por teclado.
 */
package Ecuaciones;

import java.util.Scanner;

/**
**
@author nefij
*/
public class Ejercicio6 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
System.out.println("Programa que calcula la multiplicacion de 5 numeros");
//VARIABLES
int n1,n2,n3,n4,n5,R;
Scanner teclado =new Scanner (System.in);
System.out.print("ingrese el primer numero: ");
n1=teclado.nextInt();
System.out.print("ingrese el segundo numero: ");
n2=teclado.nextInt();
System.out.print("ingrese el tercer numero: ");
n3=teclado.nextInt();
System.out.print("ingrese el cuarto numero: ");
n4=teclado.nextInt();
System.out.print("ingrese el quinto numero: ");
n5=teclado.nextInt();
//PROCESO
R= (n1*n2*n3*n4*n5);
//SALIDA
System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: "+R);
}
}