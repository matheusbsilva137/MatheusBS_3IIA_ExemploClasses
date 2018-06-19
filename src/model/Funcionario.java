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
		this.salarioFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário final do funcionário: "));
	}
	
	public void setSalarioBase() {
		this.salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do funcionário: "));
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setLogin() {
		this.login = JOptionPane.showInputDialog("Digite o login do funcionário: ");
	}
	
	public void setSenha() {
		this.senha = JOptionPane.showInputDialog("Digite a senha do funcionário: ");
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
		JOptionPane.showMessageDialog(null, "Funcionário "+this.nome+" (Código: "+this.codigo+")\n Endereço: "+this.getEndereco()+"\n Bairro: "+this.getBairro()+"\n Cidade: "+this.getCidade()+"\n UF: "+this.getUf()+"\n Telefone: "+this.getTelefone()+"\n Celular: "+this.getCelular()+"\n Salário Base: R$"+this.getSalarioBase()+"\n Salário Final: R$"+this.getSalarioFinal());
	}
	
	public boolean validarLogin(String login, String senha){ //utilização do polimorifismo
		boolean status;
		if(login.equals(this.login) && senha.equals(this.senha)) {
			status = true;
			JOptionPane.showMessageDialog(null, "O LOGIN DO FUNCIONÁRIO É VÁLIDO!");
			return status;
		}else {
			status = false;
			JOptionPane.showMessageDialog(null, "O LOGIN DO FUNCIONÁRIO É INVÁLIDO!");
			return status;
		}
	}
}