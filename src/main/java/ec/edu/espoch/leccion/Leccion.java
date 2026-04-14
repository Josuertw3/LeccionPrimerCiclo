/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.leccion;

/**
 *
 * @author AKRU
 */
public class Leccion {

    public static void main(String[] args) {
        Conductores conductor1 = new Conductores("Pedrito","ajdsk",123,456789,5);
        Vehiculo vehiculo1 = new Vehiculo( 1,"ABC-123", "Toyota",500);
        Rutas ruta1 = new Rutas( "2026-04-13","Centro",15.5,20,30,vehiculo1, conductor1);
        System.out.println(" DATOS DEL CONDUCTOR ");
        conductor1.imprimir();

        
        System.out.println(" DATOS DEL VEHiCULO ");
        vehiculo1.imprimirV();

        
        System.out.println(" DATOS DE LA RUTA ");
        ruta1.imprimirRutas();

        
        System.out.println(" Total entregas del conductor: " + conductor1.calcularEntregas());
    }

}
