/*
    Introudcir 5 números enteros en un arreglo, de forma creciente,
    y ordenados. Por ejemplo 2,4,6,8,10.
    Estos números se almacenarán en un arreglo de tamaño 10. 
    Posteriormente introduciremos un números entero n, y se insertará 
    en el lugar correspondiente, sin alterar la tabla.
 */
package arrrayordenado;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ArrrayOrdenado {

    public static void main(String[] args) {
        //Objeto Sacnner 
        Scanner sc = new Scanner(System.in);

        //Variables 
        int numero, posNumero;
        boolean creciente = true;
        int array[] = new int[10];

        //Pedimos datos al usuario
        System.out.println("\tHOLA USUARIO");
        System.out.println("<<Digite un arreglo ordenado>>");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese un número: "); //Ingreso de los valores del array 
                array[i] = sc.nextInt();
            }
            //Comprobar si el arreglo esta ordenado
            for (int i = 0; i < 4; i++) {
                if (array[i] < array[i + 1]) { // 1 - 2 - 3 
                    creciente = true;
                }
                if (array[i] > array[i + 1]) { // 3 - 2 - 1
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nERROR. array desordenado, vuelva ingresar.");
                System.out.println("");
            }

        } while (creciente == false);
        
        System.out.println("\n---Array Ordenado---");
        System.out.print("\nDigite un nuevo número para el array: ");
        numero = sc.nextInt();
        posNumero = 0;
        int j = 0;

        while (array[j] < numero && j <= 4) { //Para identificar en que posición se insertará el nuevo número
            posNumero++;
            j++;
        }

        for (int i = 4; i >= posNumero; i--) {
            array[i + 1] = array[i];
        }

        array[posNumero] = numero;

        System.out.println("\tMOSTRANDO EL ARRAY");
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }

    }

}
