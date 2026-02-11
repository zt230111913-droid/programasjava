/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Wizca
 */
import java.util.Scanner; // Importa la clase Scanner para leer datos desde la consola (teclado)

/**
 * @author Wizca
 */
public class PRO6 { // Definición de la clase principal
     public static void main(String[] args) { // Punto de entrada principal del programa
        
        // --- Declarar e inicializar las variables y el Scanner ---
        
        // Crea una instancia de Scanner llamada 'leer' para recibir la entrada del usuario
        Scanner leer = new Scanner(System.in);
        
        // Variable para almacenar la base (el número a elevar)
        double numero;
        
        // Variable para almacenar el cálculo final
        double resultado;

        // --- TU CÓDIGO ---
        
        // Solicita al usuario el número base
        System.out.println("Escribe un numero que se elevara al cuadrado");
        
               // Captura el número ingresado por el usuario y lo guarda en 'numero'
        numero = leer.nextDouble();

        // Solicita al usuario el exponente o potencia
        System.out.println("Escribe la potencia");
        
        // Declara y captura directamente la variable 'potencia' desde el teclado
        double potencia = leer.nextDouble();

        /**
         * Math.pow(base, exponente) es una función de la librería estándar de Java.
         * Realiza la operación matemática: resultado = numero ^ potencia
         */
        resultado = Math.pow(numero, potencia);

        // Imprime el mensaje final concatenando el texto con el valor de la variable 'resultado'
        System.out.println("Resultado: " + resultado);
    }
}