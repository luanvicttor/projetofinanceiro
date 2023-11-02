/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NT-ADDIX
 */
public class Pessoa {
    private String nome;
    private String funcao;
   
	
	public Pessoa (String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

    public Pessoa(String nomeUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String funcao) {
		this.funcao = funcao;
	}
        
	public String getNome() {
		return this.nome;
	}
	public String getFuncao() {
		return this.funcao;
	}
        
	public boolean equals(Pessoa a) {
		if (a.getNome().equals(this.nome) && a.getFuncao() == this.funcao){
			return true;
		}
		return false;
		
	}
}
