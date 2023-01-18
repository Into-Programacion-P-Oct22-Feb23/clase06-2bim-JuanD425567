/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    // método que permita preguntar al usuario el nombre de la empresa
    public static String Trabajo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de su empresa");
        String empresa=entrada.nextLine();
        return empresa;
    }
    public static String Direccion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloque la direccion de la empresa");
        String direccion = entrada.nextLine();
        return direccion;
    }
}


