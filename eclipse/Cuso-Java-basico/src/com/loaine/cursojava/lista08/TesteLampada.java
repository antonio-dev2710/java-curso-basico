package com.loaine.cursojava.lista08;
import java.util.Scanner;
public class TesteLampada {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Lampada led = new Lampada();
		
		//passando valor pra o metodo set
				led.setTipo("Arco");
				//pegando o valor setado
		System.out.println("O tipo � :"+led.getTipo());
		
		led.setPreco(8.39);
		System.out.println("O pre�o � :"+led.getPreco());
		led.setVoltagem(1500);
		System.out.println("O pre�o � :"+led.getVoltagem());
		
		
		 while(led.getFuncionar()!=3) {
			 System.out.println("Escolha 1 para ligar a luz e 2 para apagar a luz"+"\n"+"3 para encerrar");
			 led.setFuncionar(scan.nextInt());
			 
		 }
		
		 
	}

}
