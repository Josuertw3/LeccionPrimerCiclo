/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.leccion;


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
    public int numEntregas = 0;

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
        System.out.println("Nombre: " + firstName);
        System.out.println("Apellido: " + lastName);
        System.out.println("ID: " + id);
        System.out.println("Licencia: " + licenseNumber);
        System.out.println("Anos de experiencia: " + yearExperience);
        System.out.println("Entregas realizadas: " + numEntregas);
    }
    public void registrarEntrega(int cantidad) {
        numEntregas = numEntregas+ cantidad;
    }

    public int calcularEntregas() {
        return numEntregas;
    }
}
   