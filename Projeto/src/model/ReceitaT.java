/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NT-ADDIX
 */
public class ReceitaT {
    private String tipo;
    private float valor;
    private java.util.Date date;       
	
	public ReceitaT (String tipo, float valor, java.util.Date date) {
		this.tipo = tipo;
                this.valor = valor;
                this.date = date;
	}

    public ReceitaT(String nomeUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
        public void setValor(float valor) {
		this.valor = valor;
	}
        public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getTipo() {
		return this.tipo;
	}
        public float getValor() {
		return this.valor;
	}
        public java.util.Date getDate() {
		return this.date;
	}
	public boolean equals(ReceitaT a) {
		if (a.getTipo().equals(this.tipo) && a.getValor() == this.valor
                        && a.getDate().equals(this.date) ){
			return true;
		}
		return false;
		
	}
}
