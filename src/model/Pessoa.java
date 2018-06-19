package model;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Pessoa {
	protected int codigo;
	protected String nome, endereco, bairro, cidade, uf, telefone, celular, login, senha;
	
	public void setNome() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
	}
	
	public void setEndereco() {
		this.endereco = JOptionPane.showInputDialog("Digite o endereço do cliente: ");
	}
	
	public void setBairro() {
		this.bairro = JOptionPane.showInputDialog("Digite o bairro do cliente: ");
	}
	
	public void setCidade() {
		this.cidade = JOptionPane.showInputDialog("Digite a cidade do cliente: ");
	}
	
	public void setUf() {
		this.uf = JOptionPane.showInputDialog("Digite a Unidade Federativa do cliente: ");
	}
	
	public void setTelefone() {
		this.telefone = JOptionPane.showInputDialog("Digite o número do telefone residencial do cliente: ");
	}
	
	public void setCelular() {
		this.celular = JOptionPane.showInputDialog("Digite o número do telefone celular do cliente: ");
	}
	
	public String  getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public String getUf() {
		return this.uf;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getCelular() {
		return this.celular;
	}
	
	public void mostrarTelefone() {
		System.out.println("Telefone da pessoa para contato: "+this.telefone);
	}
	
	public void mostrarTelefone(Cliente cli) {
		System.out.println("Telefone do cliente "+cli.nome+" para contato: "+this.telefone);
	}
	
	public void mostrarTelefone(Funcionario func) {
		System.out.println("Telefone do funcionário "+func.nome+" para contato: "+this.telefone);
	}
}