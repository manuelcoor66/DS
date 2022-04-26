/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion3;

abstract class Filtros {
    public double ejecutar(double revoluciones, int EstadoMotor, int EstadoSCACV){
        return revoluciones;
    }
    
    void setUltimoConocido(double uC) {}
    
    double getUltimoConocido() {
        return 0.0;
    }
}
