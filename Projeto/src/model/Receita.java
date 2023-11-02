/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NT-ADDIX
 */
public class Receita {
    private String nome;
    private String tipo;
	
	public Receita (String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
                
	}

    public Receita(String nomeUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
        public String getNome() {
		return this.nome;
	}
	public String getTipo() {
		return this.tipo;
	}
       
	public boolean equals(Receita a) {
		if (a.getNome().equals(this.nome) && a.getTipo() == this.tipo){
			return true;
		}
		return false;
		
	}
}
