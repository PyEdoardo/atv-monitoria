/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rh.funcionarios;

/**
 *
 * @author Antonia Ribeiro
 */
public class Gerente extends Funcionario implements Bonus {

    public Gerente() {
    }

    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }
    
    @Override
    public double calcularBonus(){
        throw new UnsupportedOperationException();
    }
    
    public double calcularBonus(double valor){
        return valor;
    }
    
    @Override
    public double calcularSalario(){
        return this.aplicarBonus(super.getSalarioBase());
    }
    
    @Override
    public double aplicarBonus(double valor){
        return super.getSalarioBase() + (valor * 1.2D);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString().replace("Funcionario", "Gerente"));
        sb.append('}');
        return sb.toString();
    }
    
}
