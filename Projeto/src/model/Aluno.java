/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NT-ADDIX
 */
public class Aluno {
    private String nome;
	private int idade;
	
	public Aluno (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public boolean equals(Aluno a) {
		if (a.getNome().equals(this.nome) && a.getIdade() == this.idade){
			return true;
		}
		return false;
		
	}
}
