package util;

public class Lista_Pessoa {
    int totalUser = 0;
	No_Pessoa primeiro, ultimo;
	
	public void adicionaInicio(Object a) {
            No_Pessoa novo = new No_Pessoa(a);
                if(totalUser == 0) {
                    primeiro = novo;
                    ultimo = primeiro;
                }else {
                    novo.setProx(primeiro);
                    primeiro = novo;
                }
                totalUser++;
                //System.out.println("Total User: "+totalUser);

	}

	public void adicionaFinal(Object a) {
		if(totalUser == 0) {
                    adicionaInicio(a);
                        
		}else {
                    
                    No_Pessoa novo = new No_Pessoa (a);
                    ultimo.setProx(novo);
                    ultimo = novo;
                    totalUser++;
                    //System.out.println("Total User: "+totalUser);
		}
		
	}
	
	public void adicionaPos(Object a, int pos){
		if(pos==0) {
			adicionaInicio(a);
		}else if(pos==totalUser){
			adicionaFinal(a);
		}else {
			No_Pessoa novo = new No_Pessoa (a);
			No_Pessoa anterior= primeiro;
			for(int i=0;i<pos-1;i++) {
				anterior = anterior.getProx();
			}
			No_Pessoa atual = anterior.getProx();
			anterior.setProx(novo);
			novo.setProx(atual);
			totalUser++;
		}
	}
	
	public void removeInicio() {
		No_Pessoa temp=primeiro;
		primeiro = primeiro.getProx();
		temp.setProx(null);
		temp=null;
		totalUser--;
	}
	
	public void removeFinal() {
		No_Pessoa anterior = primeiro;
		for(int i=0;i<totalUser-2;i++) {
			anterior = anterior.getProx();
		}
		anterior.setProx(null);
		totalUser--;
		ultimo = anterior;
	}
	
	public void removePos(int pos){
		if(pos==0) {
			removeInicio();
		}else if(pos==totalUser){
			removeFinal();
		}else {
			No_Pessoa anterior= primeiro;
			for(int i=0;i<pos-1;i++) {
				anterior = anterior.getProx();
			}
			No_Pessoa atual = anterior.getProx();
			No_Pessoa posterior = atual.getProx();
			anterior.setProx(posterior);
		}
		totalUser--;
	}
	
	
        
        public boolean listavazia() {
            if(totalUser == 0) {
                    return true;}
            else{
                return false;
            }
        }
        
        public int totalusuario(){
            System.out.println("Total User: "+totalUser);
            return totalUser;
        }
        
        public String receitaToString() {
		if(totalUser == 0) {
			return "";
		}else {
			String r = " ";
			No_Pessoa atual = primeiro;
			for(int i = 0; i < totalUser - 1; i++) {
				r = r+ atual.getReceita().getNome()+", ";
				atual = atual.getProx();
			}
			r = r+ atual.getReceita().getNome();
                        
			return r;
		}
	}
        public String receitaTToString() {
		if(totalUser == 0) {
			return "";
		}else {
			String r = "";
			No_Pessoa atual = primeiro;
			for(int i = 0; i < totalUser - 1; i++) {
				r = r+ atual.getReceitaT().getTipo()+", "+
                                       atual.getReceitaT().getValor()+", "+
                                       atual.getReceitaT().getDate()+"## ";
				atual = atual.getProx();
			}
			r = r+ atual.getReceitaT().getTipo()+", "+
                               atual.getReceitaT().getValor()+", "+
                               atual.getReceitaT().getDate()+"## ";
                        
			return r;
		}
	}
        
        public String despesaToString() {
            if(totalUser == 0) {
                    return "";
            }else {
                String r = " ";
                No_Pessoa atual = primeiro;
                for(int i = 0; i < totalUser - 1; i++) {
                    r = r+ atual.getDespesa().getNome()+", ";
                    atual = atual.getProx();
                }
                r = r+ atual.getDespesa().getNome();
                return r;
            }
	}
        public String pessoaToString() {
		if(totalUser == 0) {
			return "";
		}else {
			String r = " ";
			No_Pessoa atual = primeiro;
			for(int i = 0; i < totalUser - 1; i++) {
				r = r+ atual.getPessoa().getNome()+", ";
				atual = atual.getProx();
			}
			r = r+ atual.getPessoa().getNome();
                        //System.out.println("Aqui");
			return r;
		}
        
	}
}
