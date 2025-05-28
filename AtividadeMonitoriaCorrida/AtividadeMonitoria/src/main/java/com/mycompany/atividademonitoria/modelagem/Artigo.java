/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividademonitoria.modelagem;

/**
 *
 * @author Antonia Ribeiro
 */
public class Artigo extends Obra{
    
    private final int DOI;
    private String instituicao;
    
    public Artigo(){
        super();
        DOI = 0;
    }

    public Artigo(int DOI, String instituicao, String titulo, String autor, int dataPub) {
        super(titulo, autor, dataPub);
        this.DOI = DOI;
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getDOI() {
        return DOI;
    }
    
    @Override
    public String exibirResumo(){
        var sb = new StringBuilder();
        sb
                .append("Título: ").append(super.getTitulo()).append("\n")
                .append("Autor: ").append(super.getAutor()).append("\n")
                .append("Data Publicação: ").append(super.getDataPub()).append("\n")
                .append("DOI: ").append(getDOI()).append("\n")
                .append("Universidade: ").append(getInstituicao()).append("\n");
        
        return sb.toString();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Artigo{");
        sb.append("DOI=").append(DOI);
        sb.append(", instituicao=").append(instituicao);
        sb.append('}');
        return sb.toString();
    }

}
