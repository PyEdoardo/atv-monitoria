/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rh.funcionarios;

/**
 *
 * @author Antonia Ribeiro
 */
public abstract class Funcionario {
    
    private final int id;
    private String nome;
    private double salarioBase;

    public Funcionario() {
        id = 0;
    }
    
    public Funcionario(int id, String nome, double salarioBase){
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public int getId(){
        return id;
    }
    
    public abstract double calcularSalario();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", salarioBase=").append(salarioBase);
        sb.append('}');
        return sb.toString();
    }
    
}
