package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public Estoque (Item i) {
		this.addItem(i);
	}
	
	public void addItem(Item i) {
		itens.add(i);
	}
	
	public void apresentarItens() {
		int j=1;
		for(Item i: itens) {
			JOptionPane.showMessageDialog(null, "Item "+j+", Nome: "+i.getNome()+", Quantidade: "+i.getQuant());
			j++;
		}
	}
}