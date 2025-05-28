/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividademonitoria.modelagem;
/**
 *
 * @author Edoardo
 */
public abstract class Obra implements IObra{
    
    private String titulo, autor;
    private int dataPub;

    public Obra() {
    }

    public Obra(String titulo, String autor, int dataPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPub = dataPub;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDataPub() {
        return dataPub;
    }

    public void setDataPub(int dataPub) {
        this.dataPub = dataPub;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Obra{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", dataPub=").append(dataPub);
        sb.append('}');
        return sb.toString();
    }
    
    
}
