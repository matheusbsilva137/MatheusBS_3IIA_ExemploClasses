package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa implements Usuario{
	private double salarioBase, salarioFinal;
	private int cont = 1;
	private ArrayList<Dependente> dpdts = new ArrayList <Dependente> ();
	
	public double getSalarioFinal() {
		return this.salarioFinal;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioFinal() {
		this.salarioFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio final do funcion�rio: "));
	}
	
	public void setSalarioBase() {
		this.salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio base do funcion�rio: "));
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setLogin() {
		this.login = JOptionPane.showInputDialog("Digite o login do funcion�rio: ");
	}
	
	public void setSenha() {
		this.senha = JOptionPane.showInputDialog("Digite a senha do funcion�rio: ");
	}
	
	public void inserirDadosFuncionario() {
		this.codigo = cont;
		this.setNome();
		this.setEndereco();
		this.setBairro();
		this.setCidade();
		this.setUf();
		this.setTelefone();
		this.setCelular();
		this.setSalarioFinal();
		this.setSalarioBase();
		cont++;
	}
	
	public void setDepedentes(ArrayList<Dependente> dependentes) {
		this.dpdts = dependentes;
	}
	
	public ArrayList<Dependente> getDependentes(){
		return this.dpdts;
	}
	
	public void addDependente (Dependente dependente) {
		this.dpdts.add(dependente);
	}
	
	public void apresentarDependentes() {
		int i=1;
		for(Dependente d: dpdts) {
			JOptionPane.showMessageDialog(null, "Dependente "+i+", Nome: "+d.getNome()+" ("+d.getGrauParentesco()+") - Data de Nascimento: "+d.getDtNasc());
			i++;
		}
	}
	
	public void apresentarFuncionario() {
		JOptionPane.showMessageDialog(null, "Funcion�rio "+this.nome+" (C�digo: "+this.codigo+")\n Endere�o: "+this.getEndereco()+"\n Bairro: "+this.getBairro()+"\n Cidade: "+this.getCidade()+"\n UF: "+this.getUf()+"\n Telefone: "+this.getTelefone()+"\n Celular: "+this.getCelular()+"\n Sal�rio Base: R$"+this.getSalarioBase()+"\n Sal�rio Final: R$"+this.getSalarioFinal());
	}
	
	public boolean validarLogin(String login, String senha){ //utiliza��o do polimorifismo
		boolean status;
		if(login.equals(this.login) && senha.equals(this.senha)) {
			status = true;
			JOptionPane.showMessageDialog(null, "O LOGIN DO FUNCION�RIO � V�LIDO!");
			return status;
		}else {
			status = false;
			JOptionPane.showMessageDialog(null, "O LOGIN DO FUNCION�RIO � INV�LIDO!");
			return status;
		}
	}
}