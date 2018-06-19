package view;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Dependente;
import model.Empresa;
import model.Estoque;
import model.Fornecedor;
import model.Funcionario;
import model.Item;

public class Principal {
	public static void main(String[] args) {
		boolean res;
		String login, senha;
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Cadastro do Cliente", "Clientes", JOptionPane.INFORMATION_MESSAGE);
		Cliente cli1 = new Cliente();
		cli1.inserirDadosCliente();
		cli1.apresentarCliente();
		cli1.mostrarTelefone(cli1); //utilizando método com overload para exibição do telefone do cliente
		
		JOptionPane.showMessageDialog(null, "Login do Cliente", "Clientes", JOptionPane.INFORMATION_MESSAGE);
		cli1.setLogin();
		cli1.setSenha();
		cli1.validarLogin(cli1.getLogin(), cli1.getSenha());
		
		JOptionPane.showMessageDialog(null, "Cadastro do Funcionário", "Funcionários", JOptionPane.INFORMATION_MESSAGE);
		Funcionario func1 = new Funcionario();
		func1.inserirDadosFuncionario();
		func1.apresentarFuncionario();
		func1.mostrarTelefone(func1); //utilizando método com overload para exibição do telefone do funcionário
		
		JOptionPane.showMessageDialog(null, "Cadastro do Dependente (1)", "Dependentes", JOptionPane.INFORMATION_MESSAGE);
		Dependente dpt1 = new Dependente();
		dpt1.inserirDadosDependente();
		dpt1.setResponsavel(func1);
		func1.addDependente(dpt1);
		
		JOptionPane.showMessageDialog(null, "Cadastro do Dependente (2)", "Dependentes", JOptionPane.INFORMATION_MESSAGE);
		Dependente dpt2 = new Dependente();
		dpt2.inserirDadosDependente();
		dpt2.setResponsavel(func1);
		func1.addDependente(dpt2);
		
		func1.apresentarDependentes();
		
		JOptionPane.showMessageDialog(null, "Login do Funcionário", "Funcionários", JOptionPane.INFORMATION_MESSAGE);
		func1.setLogin();
		func1.setSenha();
		func1.validarLogin(cli1.getLogin(), cli1.getSenha());
		
		JOptionPane.showMessageDialog(null, "Cadastro do Fornecedor", "Fornecedor", JOptionPane.INFORMATION_MESSAGE);
		Fornecedor forn1 = new Fornecedor();
		forn1.inserirDadosFornecedor();
		forn1.apresentarFornecedor();
		forn1.mostrarTelefone();
		
		JOptionPane.showMessageDialog(null, "Login do Fornecedor", "Fornecedor", JOptionPane.INFORMATION_MESSAGE);
		login = JOptionPane.showInputDialog("Digite o login do fornecedor cadastrado para realizar a validação:");
		senha = JOptionPane.showInputDialog("Digite a senha do fornecedor cadastrado para realizar a validação:");
		forn1.validarLogin(login, senha);
		
		JOptionPane.showMessageDialog(null, "Cadastro da Empresa", "Empresa", JOptionPane.INFORMATION_MESSAGE);
		Empresa emp1 = new Empresa();
		emp1.inserirDadosEmpresa();
		emp1.apresentarEmpresa();
		emp1.addFunc(func1);
		emp1.apresentarFuncionarios();
		
		JOptionPane.showMessageDialog(null, "Cadastro de itens (1)", "Itens", JOptionPane.INFORMATION_MESSAGE);
		Item it1 = new Item();
		it1.inserirDadosItem();
		Estoque est = new Estoque(it1);
		
		JOptionPane.showMessageDialog(null, "Cadastro de itens (2)", "Itens", JOptionPane.INFORMATION_MESSAGE);
		Item it2 = new Item();
		it2.inserirDadosItem();
		est.addItem(it2);
		
		est.apresentarItens();
	}
}