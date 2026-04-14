/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.leccion;

/**
 *
 * @author AKRU
 */
public class Rutas {

    public String date;
    public String deliveryArea;
    public double distanceTravel;
    public int numPackaTrans;
    public int estimTripTime;
    public Vehiculo v;
    public Conductores conductores;

    public Rutas(String date, String deliveryArea, double distanceTravel, int numPackaTrans, int estimTripTime, Vehiculo v, Conductores conductores) {
        this.date = date;
        this.deliveryArea = deliveryArea;
        this.distanceTravel = distanceTravel;
        this.numPackaTrans = numPackaTrans;
        this.estimTripTime = estimTripTime;
        this.v = v;
        this.conductores = conductores;
    }

    public void imprimirRutas() {
        System.out.println("Fecha: " + date);
        System.out.println("Area: " + deliveryArea);
        System.out.println("Distancia: " + distanceTravel);
        System.out.println("Paquetes: " + numPackaTrans);
        System.out.println("Tiempo estimado: " + estimTripTime);
        System.out.println("Vehiculo asignado: " + v.licensePlate);
        System.out.println("Conductor: " + conductores.firstName + " " + conductores.lastName);
    }

}
