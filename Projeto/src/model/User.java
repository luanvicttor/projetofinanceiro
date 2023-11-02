/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NT-ADDIX
 */
public class User {
    private String nome;
	private String senha;
	
	public User (String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

    public User(String nomeUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return this.nome;
	}
	public String getSenha() {
		return this.senha;
	}
	public boolean equals(User a) {
		if (a.getNome().equals(this.nome) && a.getSenha() == this.senha){
			return true;
		}
		return false;
		
	}
}
