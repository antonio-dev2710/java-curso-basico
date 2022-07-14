package com.loaine.cursojava.lista06;

public class Usuario {

	public static void main(String[] args) {
		ContaCorrente cliente1= new ContaCorrente();
		
		cliente1.numero="112345678-67";
		cliente1.saldo=1000;
		cliente1.limiteSaque=cliente1.saldo/2;

	}

}
