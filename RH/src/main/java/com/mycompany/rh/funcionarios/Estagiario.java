/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rh.funcionarios;

/**
 *
 * @author Antonia Ribeiro
 */
public class Estagiario extends Funcionario {

    public Estagiario() {
    }

    public Estagiario(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }
    
    @Override
    public double calcularSalario(){
        return super.getSalarioBase();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString().replace("Funcionario", "Estagiário"));
        sb.append("Salário Base: ").append(super.getSalarioBase());
        sb.append("Salário Final: ").append(calcularSalario());
        sb.append('}');
        return sb.toString();
    }
    
    
}
