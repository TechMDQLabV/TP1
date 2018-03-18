/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp1;

/**
 *
 * @author TechMDQ
 */
abstract class Empleado {

    private int id;
    private String nombre;
    private int anio_ingreso;
    static int id_cont = 0;

    public Empleado(String nombre, int anio_ingreso) {
        id_cont++;
        this.id = id_cont;
        this.nombre = nombre;
        this.anio_ingreso = anio_ingreso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    abstract double getSueldo();

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " Año de ingreso: " + this.getAnio_ingreso();
    }
}
