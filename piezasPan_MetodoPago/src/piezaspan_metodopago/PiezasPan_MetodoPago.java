/*
    Programa que nos pedirá la cantidad de piezas compradas, y el precio por piezas
    si se compraron 100 o más piezas, se dará el 20% de descuento por pieza.
    Calcular el total a pagar, usando métodos
 */
package piezaspan_metodopago;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class PiezasPan_MetodoPago {

    public static void main(String[] args) {
        double cantidadPiezas;
        double precio;

        Scanner sc = new Scanner(System.in); //Objeto Scanner 
        metodoPago m1 = new metodoPago(); // Creamos un objeto de la clase metodoPago(nombre de la clase)

        System.out.println("\t---TIENDA---");
        System.out.println("Inciando Proceso....");
        
        do{
           cantidadPiezas = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la cantidad de piezas de pan: "));
        }while(cantidadPiezas<=0.00);
        
        do{
            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
        }while(precio<=0.00);
        
        m1.MostraDatos(cantidadPiezas, precio);
        System.out.println("Total a pagar:  " + m1.MetodoPago(cantidadPiezas, precio));
    }

}
