package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Empresa {
	private String nomeEmpresa, cnpj, nomeDiretor;
	private ArrayList<Funcionario> func = new ArrayList<Funcionario>();
	
	
	public void inserirDadosEmpresa(){
		this.nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa: ");
		this.cnpj = JOptionPane.showInputDialog("Digite o CNPJ da empresa: ");
		this.nomeDiretor = JOptionPane.showInputDialog("Digite o nome do diretor da empresa: ");
	}
	
	public void addFunc(Funcionario funcionario) {
		func.add(funcionario);
	}
	
	public void apresentarEmpresa() {
		JOptionPane.showMessageDialog(null, "Empresa "+this.nomeEmpresa+" (CNPJ: "+this.cnpj+")\n Nome do Diretor: "+this.nomeDiretor);
	}
	
	public void apresentarFuncionarios() {
		int i=1;
		for(Funcionario f: func) {
			JOptionPane.showMessageDialog(null, "Funcionário "+i+", Nome: "+f.nome+" - Endereço: "+f.endereco);
			i++;
		}
	}
}