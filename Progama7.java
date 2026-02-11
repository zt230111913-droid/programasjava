
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Wizca
 */
import java.io.*;        // Import necesario para BufferedReader y IOException

public class Progama7 {

    static int n1;
    static float n2;

    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);
        // Nota: Es mejor usar solo uno (Scanner O BufferedReader). 
        // Usar ambos al mismo tiempo sobre System.in puede causar conflictos.
        // Aquí usaremos BufferedReader para el String como pediste.
        BufferedReader escribir = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa número entero A:");
        int a = leer.nextInt();
        
        System.out.println("Ingresa número entero B:");
        int b = leer.nextInt();
        
        System.out.println("Ingresa número flotante C:");
        float c = leer.nextFloat();
        
        System.out.println("Ingresa número double E:");
        double e = leer.nextDouble();

        // --- CORRECCIÓN CRÍTICA ---
        // Cuando usas nextInt/Double, queda un "Enter" (\n) en el buffer.
        // Si no lo limpias, el siguiente readLine() leerá ese vacío y se saltará el nombre.
        // Como estamos mezclando Scanner y BufferedReader, esta limpieza es compleja.
        // La forma más segura aquí es limpiar el buffer del Scanner antes de cambiar de herramienta:
        leer.nextLine(); 

        System.out.println("Ingresa tu nombre:");
        String nombre = escribir.readLine(); 

        // Cálculos
        // Corregido "relsutado" a "resultado"
        float resultado = ((float)a + (float)b + c + (float)e) / 4;
        
        double c1 = Math.sqrt(c);
        double c2 = Math.pow(e, 2);

        // --- SALIDA DE DATOS ---
        System.out.println("----------------Resultados----------------");
        System.out.println("Hola: " + nombre);
        System.out.println("Variable A mostrada antes: " + a);
        System.out.println("El promedio (resultado) es: " + resultado);
        System.out.println("Raíz cuadrada de C: " + c1);
        System.out.println("E elevado al cuadrado: " + c2);
    }
}