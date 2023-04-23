
package project.calcu;

import java.util.Scanner; //Clase Scanner, en esta se encuentra lo necesario acerca de la función para leer datos introducidos por el usuario

/**
 *
 * @author Kevin Elías Luna Palacios #11, segundo año de bachillerato general sección C
 */
public class ProjectCalcu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Con esto creamos la variable de la clase y el obejto, nombrando la clase para poder invocar luego para su uso
        
        float num1, num2, resultado; //En esta línea se encuentran las 3 variables que usaran, teniendo en cuanta que num1 y num2 dos son dos números que serán ingresados por el usuario y que resultado será una variable donde se guardará como bien dice su nombre el resultado de las operaciones
        int opciones; //Con esta variable se permitirá hacer selección de la operación a hacer
        
        do{ //sin importar que, siempre se ejecutará todo el programa la primera vez para que no haya problemas de inicialización, permitiendo así que la calculadora empieze a funcioanr 
            System.out.println("Calculadora Básica:\nIngrese el número de la lista para ejecutar la operación"); //Se da la bienvenida al progama y se indica como proceder
            System.out.println("1. SUMA"); //el "número". indica el número a introducir para hacer la operación que realizará 
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACIÓN");
            System.out.println("4. DIVISIÓN");
            System.out.println("5. SALIR DEL PROGRAMA");
            opciones = teclado.nextInt(); // pide el valor de opción para procerder, guardandolo en la variable opciones
            
        if(opciones >=1 && opciones <=4){ //Se evalua que si la variable "opciones" esta dentro del rango para procceder, en el caso que la condición se cumpla se seguira con
            System.out.println("Ingrese el primer valor");
            num1 = teclado.nextFloat(); //Pide el primer valor, asignado a la variable num1
            System.out.println("Ingrese el segundo valor");
            num2 = teclado.nextFloat(); //Pide el segundo valor, asignado a la variable num2
             
            switch(opciones){ //Evalua el valor que contiene "opciones" para elegir uno de los casos
                case 1: //Evalua si el valor que se introdujo es 1 y procede a realizar lo que se enuentra dentro de el
                    resultado = num1 + num2; //reliza la suma y la guarda en la variable "resultado"
                    System.out.println("El resultado de la suma es: " + resultado + "\n"); //imprime el texpo y luego el valor obtenido de la suma
                    break; //detiene la ejecución para salir del switch y que no siga ejecutando el resto de casos
                case 2:  //Evalua si el valor que se introdujo es 2 y procede a realizar lo que se enuentra dentro de el
                    resultado = num1 - num2; //reliza la resta y la guarda en la variable "resultado"
                    System.out.println("El resultado de la resta es: " + resultado + "\n");  //imprime el texto y luego el valor obtenido de la resta
                    break; //detiene la ejecución para salir del switch y que no siga ejecutando el resto de casos
                case 3: //Evalua si el valor que se introdujo es 3 y procede a realizar lo que se enuentra dentro de el
                    resultado = num1 * num2; //reliza la multiplicación y la guarda en la variable "resultado"
                    System.out.println("El resultado de la multiplicación es: " + resultado + "\n"); //imprime el texto y luego el valor obtenido de la multipliación
                    break; //detiene la ejecución para salir del switch y que no siga ejecutando el resto de casos
                case 4:  //Evalua si el valor que se introdujo es  y procede a realizar lo que se enuentra dentro de el
                    if(num2 == 0){ //Evalua si el segundo valor introducido es estrictamente igual a cero 
                        System.out.println("El valor no puede ser 0, pues no se puede dividir entre 0");
                    } else { //en el caso que no sea así, se procedera con el else
                        resultado = num1 / num2; //realiza la división y la guarda en el variable "resultado"
                        System.out.println("El valor de la división es: " +  resultado + "\n"); //imprime el texto y luego el valor obtenido de la división 
                    }
                    break; //detiene la ejecución para salir del switch y que no siga ejecutando el resto de casos
             }
        } else if (opciones == 5){ //se comprueba la segunda condición en caso que el if no se cumpla y ejecuta lo siguiente, teniendo en cuenta que "opcioens" tiene que ser igual si o si a 5, y con esto se concluye el programa, pues al ser el valor igual a 5 el prgrama se terminará
            System.out.println("Usted ha seleccionado la opción de terminar el programa, gracias.\n");
        } else { //en el caso que ninguna de las condiciones (if, else if) se cumpla se ejecutará el else
            System.out.println("Usted ha seleccionado una opción inválida, por favor inserte un valor válido según la lista mostrada\n");
        }
        }while (opciones != 5); //se comprueba si el valor de while no sea igual a 5 se seguirá ejecutando el bucle entero
                teclado.close(); //cierra la lectura del Scanner "teclado" 
    }
    
}
