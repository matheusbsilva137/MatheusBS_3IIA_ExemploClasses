package model;

import javax.swing.JOptionPane;

public class Fornecedor extends Pessoa implements Usuario{
	private String cnpj, ie, contato;
	private int cont = 1;
	
	public void inserirDadosFornecedor() {
		this.codigo = cont;
		this.setNome();
		this.setEndereco();
		this.setBairro();
		this.setCidade();
		this.setUf();
		this.setTelefone();
		this.setCelular();
		this.setCnpj();
		this.setIe();
		this.setContato();
		this.setLogin();
		this.setSenha();
		cont++;
	}
	
	public void setCnpj() {
		this.cnpj = JOptionPane.showInputDialog("Digite o CNPJ do fornecedor: ");
	}
	
	public void setIe() {
		this.ie = JOptionPane.showInputDialog("Digite o IE do fornecedor: ");
	}
	
	public void setContato() {
		this.contato = JOptionPane.showInputDialog("Digite o contato do fornecedor: ");
	}
	
	public void setLogin() {
		this.login = JOptionPane.showInputDialog("Digite o login do cliente: ");
	}
	
	public void setSenha() {
		this.senha = JOptionPane.showInputDialog("Digite a senha do cliente: ");
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public String getIe() {
		return this.ie;
	}
	
	public String getContato() {
		return this.contato;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	@Override
	public void mostrarTelefone() {
		System.out.println("Telefone do fornecedor para contato: "+this.telefone);
	}
	
	public void apresentarFornecedor() {
		JOptionPane.showMessageDialog(null, "Fornecedor "+this.getNome()+" (Código: "+this.codigo+")\n Endereço: "+this.getEndereco()+"\n Bairro: "+this.getBairro()+"\n Cidade: "+this.getCidade()+"\n UF: "+this.getUf()+"\n Telefone: "+this.getTelefone()+"\n Celular: "+this.getCelular()+"\n CNPJ: "+this.getCnpj()+"\n IE: "+this.getIe()+"\n Contato: "+this.getContato());
	}
	
	public boolean validarLogin(String login, String senha){ //utilização do polimorifismo
		boolean status;
		if(login.equals(this.login) && senha.equals(this.senha)) {
			status = true;
			JOptionPane.showMessageDialog(null, "O LOGIN DO FORNECEDOR É VÁLIDO!");
			return status;
		}else {
			status = false;
			JOptionPane.showMessageDialog(null, "O LOGIN DO FORNECEDOR É INVÁLIDO!");
			return status;
		}
	}
}