package com.mycompany.piramidee;
import java.util.Scanner;
/**

Clase que representa una pirámide con un lado de base y una altura.
*/
public class Piramidee {
    /**

Lado de la base de la pirámide.
*/
    private double ladoBase;
    /**

Altura de la pirámide.
*/
    private double altura;
    /**

Constructor de la clase Piramidee.
@param ladoBase el lado de la base de la pirámide.
@param altura la altura de la pirámide.
*/
    public Piramidee(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }
    /**

Devuelve el lado de la base de la pirámide.
@return el lado de la base de la pirámide.
*/
    public double getLadoBase() {
        return ladoBase;
    }
    /**

Establece el lado de la base de la pirámide.
@param ladoBase el nuevo valor del lado de la base de la pirámide.
*/
    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }
    /**

Devuelve la altura de la pirámide.
@return la altura de la pirámide.
*/
    public double getAltura() {
        return altura;
    }
    /**

Establece la altura de la pirámide.
@param altura el nuevo valor de la altura de la pirámide.
*/
    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**

Calcula el área de la base de la pirámide.
@return el área de la base de la pirámide.
*/
    public double calcularAreaBase() {
        return ladoBase * ladoBase;
    }
    /**

Calcula el volumen de la pirámide.
@return el volumen de la pirámide.
*/
    public float calcularVolumen() {
        return (float) ((1.0 / 3.0) * calcularAreaBase() * altura);
    }
    /**

Método estático que solicita al usuario los datos de una pirámide y crea una nueva instancia de la clase Piramidee.
@return una nueva instancia de la clase Piramidee con los datos proporcionados por el usuario.
*/
    public static Piramidee solicitarValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el lado de la base de la pirámide: ");
        double ladoBase = scanner.nextDouble();
        System.out.print("Introduce la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        return new Piramidee(ladoBase, altura);
    }
   /**

Compara dos pirámides en términos de volumen y tamaño relativo.
@param p1 la primera pirámide.
@param p2 la segunda pirámide.
*/
public static void compararPiramides(Piramidee p1, Piramidee p2) {
        if (p1.calcularVolumen() > p2.calcularVolumen()) {
            System.out.println("La pirámide 1 es más grande que la pirámide 2.");
        } else if (p1.calcularVolumen() < p2.calcularVolumen()) {
            System.out.println("La pirámide 2 es más grande que la pirámide 1.");
        } else {
            System.out.println("Las dos pirámides tienen el mismo volumen.");
        }

        if (p1.getLadoBase() > p2.getLadoBase() && p1.getAltura() > p2.getAltura()) {
            System.out.println("La pirámide 2 cabe dentro de la pirámide 1.");
        } else if (p1.getLadoBase() < p2.getLadoBase() && p1.getAltura() < p2.getAltura()) {
            System.out.println("La pirámide 1 cabe dentro de la pirámide 2.");
        } else {
            System.out.println("Las pirámides no caben una dentro de otra.");
        }
    }
/**
      * Aqui tenemos nuestro main
      * @param args 
      */
    public static void main(String[] args) {
        Piramidee piramide1 = solicitarValores();
        Piramidee piramide2 = solicitarValores();
        
        System.out.println("El volumen de la pirámide 1 es: " + piramide1.calcularVolumen());
        System.out.println("El volumen de la pirámide 2 es: " + piramide2.calcularVolumen());

        compararPiramides(piramide1, piramide2);
    }
}
