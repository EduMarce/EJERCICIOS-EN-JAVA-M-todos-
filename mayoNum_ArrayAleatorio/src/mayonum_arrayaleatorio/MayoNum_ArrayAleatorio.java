/*
    Crear un programa con un método, en el cual obtengamos el número mayor
    de un arreglo llenado con números aleatorios entre 1 y 100.
*/
package mayonum_arrayaleatorio;

/**
 *
 * @author eduardo
 */
public class MayoNum_ArrayAleatorio {

    public static void main(String[] args) {
        //Variables
        int numerosAleatorio[] = new int[6];
        
        System.out.println("\tNÚMEROS GENERADOS ALEATORIAMENTE");
        System.out.println("Son: ");
        for(int i=0;i<numerosAleatorio.length;i++){
          numerosAleatorio[i] = (int) (Math.random()*100+1);
          System.out.print(numerosAleatorio[i] + " ");
        }
        System.out.println("\nEl Máximo número es: " + NumeroMayor.MaximoNum(numerosAleatorio));
    }
    
}
