package com.mycompany.primosrango.java;
import java.util.Scanner;

/**
 * Clase que muestra los números primos que aparecen entre dos valores solicitados al usuario.
 */
public class PrimosRangoJava {
    
    /**
     * Método principal que solicita los valores al usuario y llama al método que muestra los números primos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el primer número: ");
        int primerNumero = sc.nextInt();
        
        System.out.print("Introduzca el segundo número: ");
        int segundoNumero = sc.nextInt();
        
        int mayorNumero, menorNumero;
        if (primerNumero > segundoNumero) {
            mayorNumero = primerNumero;
            menorNumero = segundoNumero;
        } else {
            mayorNumero = segundoNumero;
            menorNumero = primerNumero;
        }
        
        mostrarNumerosPrimosEnRango(mayorNumero, menorNumero);
    }
    
    /**
     * Método que muestra los números primos que se encuentran entre los valores especificados.
     * 
     * @param mayorValor El valor más grande del rango.
     * @param menorValor El valor más pequeño del rango.
     */
    public static void mostrarNumerosPrimosEnRango(int mayorValor, int menorValor) {
        boolean esPrimo;
        
        for (int i = menorValor; i <= mayorValor; i++) {
            esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i + " ");
            }
        }
    }
}

