/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividademonitoria.modelagem;

/**
 *
 * @author Antonia Ribeiro
 */
public class Revista extends Obra{
    
    private final int NUM_EDICAO;
    private String periodicidade;

    public Revista() {
        super();
        this.NUM_EDICAO = 0;
    }

    public Revista(int NUM_EDICAO, String periodicidade, String titulo, String autor, int dataPub) {
        super(titulo, autor, dataPub);
        this.NUM_EDICAO = NUM_EDICAO;
        this.periodicidade = periodicidade;
    }

    public int getNUM_EDICAO() {
        return NUM_EDICAO;
    }

    public String getPeriodicidade() {
        return periodicidade;   
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
    
    @Override
    public String exibirResumo(){
        var sb = new StringBuilder();
        sb
                .append("Título: ").append(super.getTitulo()).append("\n")
                .append("Autor: ").append(super.getAutor()).append("\n")
                .append("Data Publicação: ").append(super.getDataPub()).append("\n")
                .append("Número da Edição: ").append(getNUM_EDICAO()).append("\n")
                .append("Periodicidade: ").append(getPeriodicidade()).append("\n");
        
        return sb.toString();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Revista{");
        sb.append("NUM_EDICAO=").append(NUM_EDICAO);
        sb.append(", periodicidade=").append(periodicidade);
        sb.append('}');
        return sb.toString();
    }
    
}
