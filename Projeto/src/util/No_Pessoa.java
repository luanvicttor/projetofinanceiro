
package util;
import model.Despesa;
import model.Pessoa;
import model.Receita;
import model.ReceitaT;
public class No_Pessoa {
    private Object a;
	private No_Pessoa prox;
	private No_Pessoa ant;
	
	public No_Pessoa(Object a) {
		this.a=a;
	}
	public void setUser(Object a) {
		this.a = a;
	}
	public void setProx(No_Pessoa prox) {
		this.prox = prox;
	}
	public Object getUser() {
		return this.a;
	}
	public No_Pessoa getProx() {
		return this.prox;
	}
	public void setAnt(No_Pessoa ant) {
		this.ant = ant;
	}
	public No_Pessoa getAnt() {
		return this.ant;
	}
        
        
        public void setReceita(Receita a) {
		this.a = a;
	}
        public Receita getReceita() {
		return (Receita) this.a;
	}
        
        public void setReceitaT(ReceitaT a) {
		this.a = a;
	}
        public ReceitaT getReceitaT() {
		return (ReceitaT) this.a;
	}
        
        public void setDespesa(Despesa a) {
		this.a = a;
	}
        public Despesa getDespesa() {
		return (Despesa) this.a;
	}
        public void setPessoa(Pessoa a) {
		this.a = a;
	}
        public Pessoa getPessoa() {
		return (Pessoa) this.a;
	}
}
