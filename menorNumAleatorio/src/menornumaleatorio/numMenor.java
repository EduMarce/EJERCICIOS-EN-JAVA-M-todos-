/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menornumaleatorio;

/**
 *
 * @author eduardo
 */
public class numMenor {
    //Variables
    
    static int calcularMenor(int array[]){
        int numeroMenor = 50;
      for(int i=0;i<array.length;i++){
         if(numeroMenor>array[i]){
           numeroMenor = array[i];
         }
      }
      return numeroMenor;
    }
}
