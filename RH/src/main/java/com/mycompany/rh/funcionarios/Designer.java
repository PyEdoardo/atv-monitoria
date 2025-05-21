/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rh.funcionarios;

/**
 *
 * @author Antonia Ribeiro
 */
public class Designer extends Funcionario implements Bonus {
    
    private double adicional;

    public Designer() {
    }

    public Designer(int id, String nome, double salarioBase, double adicional) {
        super(id, nome, salarioBase);
        this.adicional = adicional;
    }
    
    @Override
    public double calcularBonus(){
        return adicional;
    }
    
    @Override
    public double calcularSalario(){
        return aplicarBonus(super.getSalarioBase());
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString().replace("Funcionario", "Designer"));
        sb.append("adicional=").append(adicional);
        sb.append('}');
        return sb.toString();
    }
    
}
