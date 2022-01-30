package com.sulamybanco;


import com.sulamybanco.controller.ContaCorrente;
import com.sulamybanco.controller.ContaPoupanca;
import com.sulamybanco.entity.Cliente;
import com.sulamybanco.entity.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente ricardo = new Cliente();
		ricardo.setNome("Ricardo");
		
		Conta cc = new ContaCorrente(ricardo);
		Conta poupanca = new ContaPoupanca(ricardo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
