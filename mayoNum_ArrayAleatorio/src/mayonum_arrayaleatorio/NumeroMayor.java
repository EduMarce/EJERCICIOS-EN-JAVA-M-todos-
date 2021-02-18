/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayonum_arrayaleatorio;

/**
 *
 * @author eduardo
 */
public class NumeroMayor {
    static int MaximoNum(int arreglo[]){
     int maximo = 0;
     for(int i=0;i<arreglo.length;i++){
       if(maximo<arreglo[i]){
        maximo = arreglo[i];
       }
     }
     return maximo;
    }
}
