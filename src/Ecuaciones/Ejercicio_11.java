/*
 * Programa que solicita ingresar un número favorito por teclado y luego el
computador debe mostrar el mensaje “Tu numero favorito es <numero ingresado>”.
 */
package Ecuaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
**
@author nefij
*/
public class Ejercicio_11 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// NEFI JORGE CRUZADO CHUCOS
Scanner leer = new Scanner(System.in);
String texto,textoSalida;
System.out.println("PROGRAMA QUE MUESTRA TU NUMERO FAVORITO");
texto = JOptionPane.showInputDialog("Ingresar un numero favorito:");
textoSalida = "Tu Numero Favorito es "+texto;
JOptionPane.showMessageDialog(null, textoSalida);
}
}