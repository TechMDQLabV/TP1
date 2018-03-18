/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp1;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TechMDQ
 */
public class Permanente extends Empleado implements Cloneable {

    static double basico = 13550.0;
    static int year = Calendar.getInstance().get(Calendar.YEAR);

    private double porcentajeAntiguedad;
    private double sueldo;

    public Permanente(String nombre, int anio_ingreso, double porcentajeAntiguedad) {
        super(nombre, anio_ingreso);
        this.porcentajeAntiguedad = porcentajeAntiguedad;
    }

    public void setPorcentajeAntiguedad(double porcentajeAntiguedad) {
        this.porcentajeAntiguedad = porcentajeAntiguedad;
    }

    public double getPorcentajeAntiguedad() {
        return porcentajeAntiguedad;
    }

    @Override
    double getSueldo() {
        return sueldo = Permanente.basico + (Permanente.year - super.getAnio_ingreso()) * this.porcentajeAntiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + " Basico: " + Permanente.basico + " Antiguedad: " + (Permanente.year - super.getAnio_ingreso()) + " Porcentaje Antiguedad: " + this.porcentajeAntiguedad + " A Cobrar: " + this.sueldo;
    }

    @Override
    public boolean equals(Object o) {
        boolean resp = false;

        if ((o != null) && (o instanceof Temporal)) {
            Permanente e = (Permanente) o;
            resp = this.getNombre().equals(e.getNombre()) && this.getAnio_ingreso() == e.getAnio_ingreso() && this.getId() == e.getId();
        }

        return resp;
    }

    @Override
    public Permanente clone() throws CloneNotSupportedException {

        Permanente e = (Permanente) super.clone();
        return e;
    }
}
