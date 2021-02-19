/*
    Crearemos un método estático que recibirá un array como parametro
    que fue llenado con números aleatorios, y al final nos devolverá 
    cúal es el menor
*/
package menornumaleatorio;

/**
 *
 * @author eduardo
 */
public class MenorNumAleatorio {

    public static void main(String[] args) {
         //Arreglo de 6 posiciones
         int arrayAleatorio[] = new int[6];
         System.out.println("\tNÚMEROS ALEATORIOS DEL 1 AL 100");
         System.out.println("Los números son: ");
         for(int i=0;i<arrayAleatorio.length;i++){
            arrayAleatorio[i] = (int)(Math.random()*100);
            if(i!=0){
             System.out.print(" - ");
            }
            System.out.print(arrayAleatorio[i] + " ");
         }
         
         System.out.println("\nEl número menor es: " + numMenor.calcularMenor(arrayAleatorio) );
    }
    
}
