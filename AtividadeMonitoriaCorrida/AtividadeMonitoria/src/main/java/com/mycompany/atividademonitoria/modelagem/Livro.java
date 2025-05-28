/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividademonitoria.modelagem;

import java.util.Objects;

/**
 *
 * @author Antonia Ribeiro
 */
public class Livro extends Obra{
    
    private int numPag;
    private String genero;
    
    public Livro(){
        super();
    }

    public Livro(int numPag, String genero, String titulo, String autor, int dataPub) {
        super(titulo, autor, dataPub);
        this.numPag = numPag;
        this.genero = genero;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String exibirResumo(){
        var sb = new StringBuilder();
        sb
                .append("Título: ").append(super.getTitulo()).append("\n")
                .append("Autor: ").append(super.getAutor()).append("\n")
                .append("Data Publicação: ").append(super.getDataPub()).append("\n")
                .append("Gênero: ").append(getGenero()).append("\n")
                .append("Número de Páginas: ").append(getNumPag()).append("\n");
        
        return sb.toString();
    }
    
    @Override
    public String toString(){
        var sb = new StringBuilder();
        sb.append(super.toString()).append(getNumPag()).append(getGenero());
        
        return sb.toString();
    }

}
