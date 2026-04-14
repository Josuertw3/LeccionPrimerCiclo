/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.leccion;

/**
 *
 * @author AKRU
 */
public class Vehiculo {

    public int internalCode;
    public String licensePlate;
    public String brand;
    public double maxLoadCapacity;
    public int batteryL = 100;
    public String states;

  public Vehiculo(int internalCode, String licensePlate, String brand, double maxLoadCapacity) {
    this.internalCode = internalCode;
    this.licensePlate = licensePlate;
    this.brand = brand;
    this.maxLoadCapacity = maxLoadCapacity;
    this.batteryL = 100;
    this.states = "APAGADO";
}
    public void enceder() {
        if (batteryL > 0) {
            states = "Funcionando";
        } else {
            System.out.println("No hay bateriass");
        }
    }

    public void apagar() {
        states = "APAGADO";
    }

    public void usarBateria(int consumo) {
        batteryL =batteryL- consumo;
        if (batteryL < 0) {
            batteryL = 0;
        }
    }

    public void imprimirV() {
        System.out.println("Codigo: " + internalCode);
        System.out.println("Placa: " + licensePlate);
        System.out.println("Marca: " + brand);
        System.out.println("Capacidad: " + maxLoadCapacity);
        System.out.println("Bateria: " + batteryL);
        System.out.println("Estado: " + states);
    }

    }
