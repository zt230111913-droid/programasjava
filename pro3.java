/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Wizca
 */
import javax.swing.JOptionPane;

public class pro3 {
    private static String nombre; 
    private static float estatura;
    private static char sexo;
    private static int edad;

    public static void main(String[] args) { 
        
        nombre = JOptionPane.showInputDialog("escribe nombre"); // Corregido JOptionPane
        
        // Nota: Para que funcione el float, se requiere Float.parseFloat
        estatura =  Float.parseFloat(JOptionPane.showInputDialog("escribe estatura")); 
       
        sexo = JOptionPane.showInputDialog("escribe el sexo de una persona ").charAt(0);   
         
         edad = Integer.parseInt(JOptionPane.showInputDialog("escribe la edad"));
        
JOptionPane.showMessageDialog(null, "El nombre es: " + nombre + "\nSu estatura es: " + estatura + "\nSu sexo es: " + sexo + "\nSu edad es: " + edad);
    }
}