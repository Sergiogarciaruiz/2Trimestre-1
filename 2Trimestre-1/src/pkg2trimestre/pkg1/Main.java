/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2trimestre.pkg1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen:");
        double i = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        double j = sc.nextDouble();
        double a = j - (i * 0.4);
        double nota = a / 0.6;
        System.out.println("Para tener un "+ i +" en el trimestre necesitas sacar un "+ nota +" en el segundo examen");    }
    
}
