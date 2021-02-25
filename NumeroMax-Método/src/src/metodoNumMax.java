/*
    Crearemos un método estático, llamado máximo, con dos parametros
    este método nos devolverá con la sentencia retun, cual es el mayor
    de esos dos números recibidos.
*/
package src;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class metodoNumMax {
    public static void main(String[]args){
        //Lector de Datos
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\tMÁXIMO NÚMERO");
        System.out.println(" ");
        System.out.print("1.- Digite un número: ");
        byte N1 = entrada.nextByte();
        System.out.print("2.- Digite un número: ");
        byte N2 = entrada.nextByte();
        
        //Lllamamos a las funciones
        byte maximoNumero = MaximoNum(N1, N2);
        mostrarNum(maximoNumero);
        
    }
    
    public static byte MaximoNum(byte NUMERO1, byte NUMERO2){
     byte maximo;
     if(NUMERO1>NUMERO2){
         maximo = NUMERO1;
     }
     else{
         maximo = NUMERO2;
     }
     return maximo;
    }
    
    public static void mostrarNum(byte resultado){
        System.out.println("\nEl máximo número: " + resultado);
    }
}
