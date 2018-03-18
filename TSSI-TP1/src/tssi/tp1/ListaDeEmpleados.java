/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TechMDQ
 */
public class ListaDeEmpleados {

    private List<Empleado> listadoDeEmpleados;

    public ListaDeEmpleados() {
        this.listadoDeEmpleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado e) {
        this.listadoDeEmpleados.add(e);
    }

    public boolean delEmpleado(int id) {
        boolean ok = false;
        for (int i = 0; i < this.listadoDeEmpleados.size(); i++) {
            if (this.listadoDeEmpleados.get(i).getId() == id) {
                listadoDeEmpleados.remove(i);
                ok = true;
            }
        }
        return ok;
    }

    public void listadoDeEmpleados() {
        char tipo;
        System.out.printf("             Listado de Empleados\n\n");
        System.out.printf("----------------------------------------------\n");
        System.out.printf("|   Id   |         Nombre         |   Tipo   |\n");
        System.out.printf("----------------------------------------------\n");
        /*
        for (int i = 0; i < this.listadoDeEmpleados.size(); i++) {
            if (this.listadoDeEmpleados.get(i) instanceof Temporal) {
                tipo = 'T';
            } else {
                tipo = 'P';
            }
            System.out.printf("| %06d | %-22.22s |     %c    |\n", this.listadoDeEmpleados.get(i).getId(), this.listadoDeEmpleados.get(i).getNombre(), tipo);
        }
         */
        for (Empleado e : this.listadoDeEmpleados) {
            if (e instanceof Temporal) {
                tipo = 'T';
            } else {
                tipo = 'P';
            }
            System.out.printf("| %06d | %-22.22s |     %c    |\n", e.getId(), e.getNombre(), tipo);
        }

        System.out.printf("----------------------------------------------\n");
        System.out.printf("\n\n");
    }

    public void listadoDeSueldos() {
        char tipo;
        System.out.printf("                    Listado de Sueldos\n\n");
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("|         Nombre         |   Tipo   |        Sueldo        | \n");
        System.out.printf("------------------------------------------------------------\n");

        for (int i = 0; i < this.listadoDeEmpleados.size(); i++) {
            if (this.listadoDeEmpleados.get(i) instanceof Temporal) {
                tipo = 'T';
            } else {
                tipo = 'P';
            }
            System.out.printf("| %-22.22s |     %c    | %,20.2f |\n", this.listadoDeEmpleados.get(i).getNombre(), tipo, this.listadoDeEmpleados.get(i).getSueldo());
        }
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Total a Pagar......................: %,21.2f\n", getTotalSueldos());
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("\n\n");
    }

    public double getTotalSueldos() {
        double total = 0;

        for (Empleado e : this.listadoDeEmpleados) {
            total = total + e.getSueldo();
        }

        return total;
    }
}
