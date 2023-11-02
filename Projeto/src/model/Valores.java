package model;

import java.util.Date;

public class Valores {
    private float valor;
    private String tipo;
    private Date data;
	
	public Valores (float valor, String tipo, Date data) {
		this.valor = valor;
		this.tipo = tipo;
                this.data = data;
	}

    public Valores(String nomeUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
        public void setData(Date data) {
		this.data = data;
	}
        public float getValor() {
		return this.valor;
	}
	public String getTipo() {
		return this.tipo;
	}
        public Date getData() {
		return this.data;
	}
}
