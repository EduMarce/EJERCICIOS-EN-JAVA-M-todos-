/*
Programa que calcule el costo del estacionamiento en un parking. 
Las primeras 3 horas  se cobrarán a 20 soles. Las siguiemtes después  de las 3 horas
a 15 soles. Hasta llegar al tope de 250 soles, para 24 horas. Si se permanece aparcado
por más de un día, se cobrarán 250 soles por día. Y 15 soles las horas siguientes.
Se le pedirá al usuario ingresar la cantidad de horas, y debe obtener el precio, usando
métodos.
    
 */
package estacionamientométodos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class EstacionamientoMétodos {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int numeroHoras;
        double precioTotal = 0;
        String nombreCliente = " ";

        //Pedimos datos al usuario
        System.out.println("\t>>ESTACIONAMIENTOS 'EDU'<<");
        System.out.println("Procesando...");
        nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre: "); //Ingresamos el nombre del cliente
        numeroHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de horas: ")); //Ingresamos el número de horas
        precioTotal = CalcularPrecio(numeroHoras); // LLamamos al método para calcular el total a pagar
        MostrarDatos(nombreCliente, numeroHoras, precioTotal); // Invocamos al método para que nos muestres los datos

    }

    static double CalcularPrecio(int cantidadHoras) { //El método lleva como parametro la cantida de horas 
        double precio, precioResto;
        int restoHoras, dias;
        if (cantidadHoras <= 24) {  //Si la cantidad de horas es menor que 24 se pasa a la otra condicón
            if (cantidadHoras <= 3) { //Si solo se ingresaron 3 horas, el pago sería el producto de esas horas por 20.
                precio = cantidadHoras * 20; 
            } else {
                precio = (3 * 20) + ((cantidadHoras - 3) * 15);  //Si son más de 3 horas, las tres primeras por 20 y el resto por 15
                if (precio >= 250) { //Ojo que si el precio es mayor que 250, 
                    precio = 250;    //no puede ser ya que se quedó que en un día el precio era de 250 soles
                }
            }
        } else { //Si la cantidad de horas es mayor que 24 se realiza lo siguiente
            dias = cantidadHoras / 24; // Se saca la cantidad de dias: 25 horas: 25/24: 1.0444 -> un día
            restoHoras = cantidadHoras % 24; //Se saca el resto de horas del dia: 25 horas: 25/24: 1.0440. -> 1 día + 1 hora
            if (restoHoras == 0) {
                System.out.println("Tu coche estuvo aparcado " + dias + " dias ");

            } else {
                System.out.println("Tu coche estuvo aparcado " + dias + " dias y " + restoHoras + " horas");
            }

            precioResto = restoHoras * 15; //las horas restantes a partir de que ya han más de 24 horas, el precio suyo sería multiplicado por 15
            if (precioResto >= 250) {
                precioResto = 250; //el precio resto no puede pasra de 250
            }
            precio = (dias * 250) + precioResto; // el precio sería la suma de si es que hay dias, debe ser multiplicado por 250
                                                 // sumado con el precio del resto
        }
        return precio;
    }

    static void MostrarDatos(String nombre, int horas, double precio) {
        System.out.println("¡Bienvenido " + nombre + "!");
        System.out.println("\n\t\tDATOS");
        System.out.println("-----------------------------------------");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("-----------------------------------------");
        System.out.println("Horas Ingresadas: " + horas + " horas");
        System.out.println("Total a pagar: " + precio + " soles");
        System.out.println("-----------------------------------------");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("-----------------------------------------");
    }
}
