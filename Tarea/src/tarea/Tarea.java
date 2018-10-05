/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Estudiante lista[] = new Estudiante[2];
        Scanner scan = new Scanner(System.in);
        // hacemos un recorrido con for.
        for (int i = 0; i < lista.length; i++) {
            // pedimos al uuario que ingrese sus datos
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = scan.next();
            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = scan.next();
            System.out.println("Ingrese la nota del estudiante: ");
            Double nota = scan.nextDouble();

            lista[i] = new Estudiante(nombre, apellido, nota);
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Estudiante %s\n%s\n", i + 1, lista[i]);
        }
    }

}
