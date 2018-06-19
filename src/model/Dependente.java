package model;

import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Dependente {
	private String nome, grauParentesco;
	private Date dtnasc;
	private Pessoa responsavel;
	
	public String getNome() {
		return this.nome;
	}
	
	public String getGrauParentesco() {
		return this.grauParentesco;
	}
	
	public Date getDtNasc() {
		return this.dtnasc;
	}
	
	public void setResponsavel(Funcionario resp) {
		this.responsavel = resp;
	}
	
	public Pessoa getResponsavel() {
		return this.responsavel;
	}
	
	public void inserirDadosDependente(){
		this.nome = JOptionPane.showInputDialog("Digite o nome do depente: ");
		this.grauParentesco = JOptionPane.showInputDialog("Digite o grau de parentesco do dependente com relação ao funcionário: ");
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dtnasc = (java.util.Date)formatter.parse(JOptionPane.showInputDialog("Digite a data de nascimento do dependente: "));
		} catch (HeadlessException e) {
			e.printStackTrace();
			System.out.println("FORMATO DE DATA INCORRETO");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("PROBLEMA COM A CONVERSÃO DA DATA");
		}
	}
}