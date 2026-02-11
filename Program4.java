/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program4;
import java.util.Scanner;

/**
 *
 * @author Wizca
 */
public class Program4 {
    // Constantes
    static int d = 18;
    static float e = 1.2f;
    static float l = 1.05f;
    static int pesos;
    static float resultado = 0.0f;

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Escribe una cantidad en pesos");
        pesos = numeros.nextInt();
        
        resultado = (float) pesos / d;
        System.out.println("Los dolares son: " + resultado);
        
        resultado = resultado / e;
        System.out.println("Los Euro son: " + resultado);
        
        resultado = resultado / l;
        System.out.println("Los Libra son: " + resultado);
    }
}
        // TODO code application logic here
 