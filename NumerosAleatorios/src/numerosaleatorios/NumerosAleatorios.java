/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

/**
 *
 * @author eduardo
 */
public class NumerosAleatorios {

    public static void main(String[] args) {
        //Arreglo de tipo entero
        
       int numerosAleatorios[] = new int[10];
        System.out.println("Números aleatorios del 1 al 100: ");
        for(int i=0;i<numerosAleatorios.length;i++){
          numerosAleatorios[i] = (int)(Math.random()*100);
          System.out.print(numerosAleatorios[i] + " ");
        }
    }
    
}
