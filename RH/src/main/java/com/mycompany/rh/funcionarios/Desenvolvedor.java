/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rh.funcionarios;

/**
 *
 * @author Antonia Ribeiro
 */
public class Desenvolvedor extends Funcionario implements Bonus {
    
    private int tarefasFeitas;
    private int idChefe;

    public Desenvolvedor() {
        super();
    }
    
    public Desenvolvedor(int tarefasFeitas, int idChefe, int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
        this.tarefasFeitas = tarefasFeitas;
        this.idChefe = idChefe;
    }
    
    @Override
    public double calcularBonus(){
        return tarefasFeitas * 100; //100 Reais
    }
    
    public double calcularSalario(){
        return aplicarBonus(super.getSalarioBase());
    }

    public int getTarefasFeitas() {
        return tarefasFeitas;
    }

    public void setTarefasFeitas(int tarefasFeitas) {
        this.tarefasFeitas = tarefasFeitas;
    }

    public int getIdChefe() {
        return idChefe;
    }

    public void setIdChefe(int idChefe) {
        this.idChefe = idChefe;
    }
    
    


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString().replace("Funcionario", "Desenvolvedor"));
        sb.append("tarefasFeitas=").append(tarefasFeitas);
        sb.append(", chefe=").append(idChefe);
        sb.append('}');
        return sb.toString();
    }
}
