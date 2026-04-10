/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.leccion;

import java.util.Scanner;

/**
 *
 * @author AKRU
 */
public class Conductores {

    public String firstName;
    public String lastName;
    public int id;
    public int licenseNumber;
    public int yearExperience;
    public int NumEntregas = 0;
    

    public Conductores() {
    }

    public Conductores(String firstName, String lastName, int id, int licenseNumber, int yearExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.licenseNumber = licenseNumber;
        this.yearExperience = yearExperience;
    }

    public void imprimir() {
        System.out.println("El nombre del conductor es " + firstName);
        System.out.println("El apellido del conductor es " + lastName);
        System.out.println("El codigo unico es :" + id);
        System.out.println("El numero de la licencia :" + licenseNumber);
        System.out.println("Los años de experiencia es " + yearExperience);

    }

    public int cacularEntregas() {
      
        
        return 0;
    }
}
