package model;

import javax.swing.JOptionPane;

public class Item {
	private String nome;
	private double quant;
	
	public String getNome() {
		return this.nome;
	}
	
	public double getQuant() {
		return this.quant;
	}
	
	public void setNome() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do item: ");
	}
	
	public void setQuant() {
		this.quant = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade disponível do item: "));
	}
	
	public void inserirDadosItem() {
		this.setNome();
		this.setQuant();
	}	
}