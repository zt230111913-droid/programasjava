
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wizca
 */
public class pro5parcial1 {
    
    public static void main(String[] args) {
        
        // Declaración de variables
        try (Scanner leer = new Scanner(System.in)) {
            // Declaración de variables
            double numero;
            double potencia; // Corregido: antes decías "pontencia"
            double resultado = 0.0; // Corregido: antes decías "relsutado"
            // Entrada de datos
            System.out.println("Escribe un numero base: ");
            numero = leer.nextDouble(); // Usamos nextDouble para coincidir con la variable
            System.out.println("Escribe la potencia: ");
            potencia = leer.nextDouble(); // FALTABA ESTO: leer la potencia
            // Cálculo
            resultado = Math.pow(numero, potencia);
            // Salida4
            System.out.println("Resultado: " + resultado);
            // Cerrar scanner (opcional pero recomendado)
        }  
        
        
    }
}


    

