/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import main.Dashboard;
import model.Despesa;
import model.Pessoa;
import model.Receita;
import model.ReceitaT;
import model.Valores;
import model.User;
import util.Lista_Pessoa;
import util.Lista_User;
import util.No_User;

/**
 *
 * @author NT-ADDIX
 */
public class Controller {
    
    //private Lista_User usuario = new Lista_User();
    private Lista_Pessoa pessoa = new Lista_Pessoa();
    private Lista_Pessoa receita = new Lista_Pessoa();
    private Lista_Pessoa despesa = new Lista_Pessoa();
    private Lista_Pessoa adicionaValor = new Lista_Pessoa();
    private Lista_Pessoa todasreceitas = new Lista_Pessoa();
    //private Lista_Pessoa saldo = new Lista_Pessoa();
    float saldo = 0;
    
    
    
    /*public User CadastroUsuario (String nomeUser, String senhaUser) {
        User us = new User (nomeUser, senhaUser);
        usuario.adicionaFinal(us);
        return us;
    }
    public User VerificaUsuario (String nomeUser, String senhaUser) {
        User us = new User (nomeUser, senhaUser);
        usuario.verifica(us);
        if(usuario.verifica(us)==true){
            System.out.println("Login Efetuado");
        }else{
            System.out.println("Usuário ou Senha Incorretos");
        }
        return us;
    }
    public boolean valida(String nome, String senha) {
		String n, s;
                No_User primeiro = null;
		No_User novo = primeiro;
		for(int i=0;i<usuario.totalusuario();i++) {
			n = novo.getUser().getNome();
			if(n.equals(nome)) {
                            s = novo.getUser().getSenha();
                            if(s.equals(senha)){
                                return true;
                            }
			}
                        novo = novo.getProx();
                }
                return false;
	}
    public static void adicionar(Connection c, String nome, String senha) throws Exception{
        String sql="insert into Pessoa (nome,senha) values (?,?,?);";
        PreparedStatement comando = c.prepareStatement(sql);
        comando.setString(1, nome);
        comando.setString(2, senha);
        comando.execute();
        comando.close();
    }
    public static void listar (Connection c) throws Exception{
        String sql = "select * from Pessoa";
        PreparedStatement comando = c.prepareStatement(sql);
        ResultSet res = comando.executeQuery(sql);
        while(res.next()!=false) {
                System.out.println(res.getString("nome"));
                System.out.println(res.getString("senha"));
        }
        comando.close();
    }
    public static void substituir(Connection c, String cpf, String nome) throws Exception{
        String sql="update Pessoa set nome = ? where cpf = "+cpf+";";
        PreparedStatement comando = c.prepareStatement(sql);
        comando.setString(1, nome);
        comando.execute();
        comando.close();
    }
    public static void deletar(Connection c, String cpf) throws Exception{
        String sql="delete from Pessoa where cpf = ?;";
        PreparedStatement comando = c.prepareStatement(sql);
        comando.setString(1, cpf);
        comando.execute();
        comando.close();
    }*/

    public Pessoa CadastroPessoa (String nome, String funcao) {
        Pessoa p = new Pessoa (nome, funcao);
        pessoa.adicionaFinal(p);
        return p;
    }
    public Receita CadastroReceita (String nome, String tipo) {
        Receita r = new Receita (nome, tipo);
        receita.adicionaFinal(r);
        return r;
    }
    public Despesa CadastroDespesa (String nome, String tipo) {
        Despesa d = new Despesa (nome, tipo);
        despesa.adicionaFinal(d);
        return d;
    }
    public String RetornaReceita (){
        return receita.receitaToString();
    }
    public String RetornaDespesa (){
        return despesa.despesaToString();
    }
    public Valores AdicionaValor (float valor, String tipo, Date data) {
        Valores s = new Valores (valor, tipo, data);
        adicionaValor.adicionaFinal(s);
        AtualizaSaldo(valor);
        return s;
    }
    public String RetornaPessoa (){
        return pessoa.pessoaToString();
    }
    
     public ReceitaT AtualizaReceita(String tipo, float valor, java.util.Date date){
        ReceitaT p = new ReceitaT (tipo, valor, date);
        todasreceitas.adicionaFinal(p);
        AtualizaSaldo(valor); 

        return p;
    }
    public String RetornaReceitaT (){
        return todasreceitas.receitaTToString();
    }
    public float AtualizaSaldo(float valor){
        saldo = saldo + valor;
        
        return saldo;
    }
    public float RetornaSaldo(){  
        return saldo;
    }
    
    
    
}
