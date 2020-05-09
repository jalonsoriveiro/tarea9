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
public class Empregado {
    
     String nome ;
     String apelidos;
     String DNI;
     String direccion;
     int telefono;
     float salario;
     String supervisor;

    public Empregado(String nome, String Apelidos, String DNI, String Direccion, int telefono, float Salario) {
        this.nome = nome;
        this.apelidos = Apelidos;
        this.DNI = DNI;
        this.direccion = Direccion;
        this.telefono = telefono;
        this.salario = Salario;
    }

    public void Imprimir(){    
        toString();
    }
    public void setSupervisor(String newSupervisor){
        
        supervisor = newSupervisor;
    
    }
    public void setSalario(float newSalario){
    
        salario += newSalario;
    }
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", apelidos=" + apelidos + ", DNI=" + DNI + ", direccion=" + direccion + ", telefono=" + telefono + ", salario=" + salario + ", supervisor=" + supervisor + '}';
    }         
    
           
}
