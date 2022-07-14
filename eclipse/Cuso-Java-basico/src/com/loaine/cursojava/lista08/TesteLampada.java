package com.loaine.cursojava.lista08;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada led = new Lampada();
		
		led.tipo="Arco";
		led.preco=8.39;
		led.voltagem=1500;
		
		System.out.println("tipo da lampada: "+led.tipo+ "\n"+"Preco"+led.preco+ "\n"+"Voltagem"+led.voltagem);
		//chamda da função;
		 int teste=led.funcionar(1);
		 System.out.println("Vc encerrou o metodo"+teste);
		 
		 

	}

}
