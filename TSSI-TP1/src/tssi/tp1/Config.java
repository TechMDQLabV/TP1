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
public class Config {

    static ListaDeEmpleados cargarLista(ListaDeEmpleados lista) {
        Empleado ep1 = new Permanente("Pepe", 2010, 0.25);
        lista.addEmpleado(ep1);

        Empleado et1 = new Temporal(10, "Juan", 2010);
        lista.addEmpleado(et1);

        Empleado ep2 = new Permanente("Federico", 2000, 0.55);
        lista.addEmpleado(ep2);

        Empleado et2 = new Temporal(15, "Maria", 2015);
        lista.addEmpleado(et2);

        return lista;
    }

}
