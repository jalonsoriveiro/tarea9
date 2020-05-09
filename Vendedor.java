/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9;

/**
 *
 * @author jose
 */
public class Vendedor {
    
    String Coche;
    String matricula;
    String modelo;
    int telefono;
    String mobil;
    String areaVenta;
    String listaClientes;
    int porBeneficios;

    public Vendedor(String Coche, String matricula, String modelo, int telefono, String mobil, String areaVenta, String listaClientes, int porBeneficios) {
        this.Coche = Coche;
        this.matricula = matricula;
        this.modelo = modelo;
        this.telefono = telefono;
        this.mobil = mobil;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        this.porBeneficios = porBeneficios;
    }
    
     public void Imprimir(){    
        toString();
    }

    @Override
    public String toString() {
        return "Vendedor{" + "Coche=" + Coche + ", matricula=" + matricula + ", modelo=" + modelo + ", telefono=" + telefono + ", mobil=" + mobil + ", areaVenta=" + areaVenta + ", listaClientes=" + listaClientes + ", porBeneficios=" + porBeneficios + '}';
    }
    
}
