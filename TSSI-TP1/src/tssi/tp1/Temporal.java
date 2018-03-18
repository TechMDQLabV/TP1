/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TechMDQ
 */
public class Temporal extends Empleado implements Cloneable {

    static double importePorHora = 120.0;

    private double horas;
    private double sueldo;

    public Temporal(double horas, String nombre, int anio_ingreso) {
        super(nombre, anio_ingreso);
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public double getSueldo() {
        return sueldo = horas * Temporal.importePorHora;
    }

    @Override
    public boolean equals(Object o) {
        boolean resp = false;

        if ((o != null) && (o instanceof Temporal)) {
            Temporal e = (Temporal) o;
            resp = this.getNombre().equals(e.getNombre()) && this.getAnio_ingreso() == e.getAnio_ingreso() && this.getId() == e.getId();
        }

        return resp;
    }

    @Override
    public Temporal clone() throws CloneNotSupportedException {

        Temporal e = (Temporal) super.clone();
        return e;
    }

    @Override
    public String toString() {
        return super.toString() + " Importe por Hora: " + Temporal.importePorHora + " Horas Trabajadas: " + this.horas + " A Cobrar: " + this.sueldo;
    }

}
