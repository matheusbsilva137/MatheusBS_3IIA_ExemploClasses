package model;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa implements Usuario{
	private double limiteCredito, rendaMensal;
	private String rg, cpf;
	private int cont = 1;
	
	public void setLimiteCredito() {
		this.limiteCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de crédito do cliente: "));
	}
	
	public void setRendaMensal() {
		this.rendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda mensal do cliente: "));
	}
	
	public void setRg() {
		this.rg = JOptionPane.showInputDialog("Digite o RG do cliente: ");
	}
	
	public void setCpf() {
		this.cpf = JOptionPane.showInputDialog("Digite o CPF do cliente: ");
	}
	
	public void setLogin() {
		this.login = JOptionPane.showInputDialog("Digite o login do cliente: ");
	}
	
	public void setSenha() {
		this.senha = JOptionPane.showInputDialog("Digite a senha do cliente: ");
	}
	
	public double getLimiteCredito() {
		return this.limiteCredito;
	}
	
	public double getRendaMensal() {
		return this.rendaMensal;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void inserirDadosCliente() {
		this.codigo = cont;
		this.setNome();
		this.setEndereco();
		this.setBairro();
		this.setCidade();
		this.setUf();
		this.setTelefone();
		this.setCelular();
		this.setLimiteCredito();
		this.setRendaMensal();
		this.setRg();
		this.setCpf();
		this.setLogin();
		this.setSenha();
		cont++;
	}
	
	public void apresentarCliente() {
		JOptionPane.showMessageDialog(null, "Cliente "+this.nome+" (Código: "+this.codigo+")\n Endereço: "+this.getEndereco()+"\n Bairro: "+this.getBairro()+"\n Cidade: "+this.getCidade()+"\n UF: "+this.getUf()+"\n Telefone: "+this.getTelefone()+"\n Celular: "+this.getCelular()+"\n Limite de Crédito: R$"+this.getLimiteCredito()+"\n Renda Mensal: R$"+this.getRendaMensal()+"\n RG: "+this.getRg()+"\n CPF: "+this.getCpf());
	}
	
	public boolean validarLogin(String login, String senha){ //utilização do polimorifismo
		boolean status;
		if(login.equals(this.login) && senha.equals(this.senha)) {
			status = true;
			JOptionPane.showMessageDialog(null, "O LOGIN DO CLIENTE É VÁLIDO!");
			return status;
		}else {
			status = false;
			JOptionPane.showMessageDialog(null, "O LOGIN DO CLIENTE É INVÁLIDO!");
			return status;
		}
	}
}