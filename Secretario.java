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
public class Secretario {
    
    
    String despacho;
    String fax;
    float salario;

    public Secretario(String despacho, String fax, float salario) {
        this.despacho = despacho;
        this.fax = fax;
        this.salario = salario;
    }
    public void Imprimir(){    
        toString();
    }
    @Override
    public String toString() {
        return "Secretario{" + "despacho=" + despacho + ", fax=" + fax + ", salario=" + salario + '}';
    }
}
