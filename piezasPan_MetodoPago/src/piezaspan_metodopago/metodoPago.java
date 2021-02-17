/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piezaspan_metodopago;

/**
 *
 * @author eduardo
 */
public class metodoPago {
    double cantidad;
    double precio;
    double pagoTotal;
    
    public double MetodoPago(double cantidad, double precio){
        if(cantidad<100){
          pagoTotal = cantidad*precio;
          System.out.println("NO OBTUVO DESCUENTO");
        }
        else{
          pagoTotal = (cantidad*precio)- (0.20*(cantidad*precio));
          System.out.println("OBTUVO UN 20% DE DESCUENTO");
        } 
        return pagoTotal;
    }
    
    public void MostraDatos(double cantidad, double precio){
      System.out.println("\n------------------------------------");
      System.out.println("\t---PEDIDO---");
      System.out.print("Cantidad de piezas de pan: " + cantidad);
      System.out.print("\nPrecio: " + precio+ " soles.");
      System.out.println("\n------------------------------------");
    }
    
}
