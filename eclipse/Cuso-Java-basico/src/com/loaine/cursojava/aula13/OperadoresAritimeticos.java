package com.loaine.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int resultado=1+2;
		System.out.println(resultado);
		
		resultado=resultado-1;
		System.out.println(resultado);
		
		resultado=resultado*3;
		System.out.println(resultado);
		
		resultado=resultado/2;
		System.out.println(resultado);
		
		resultado=resultado+10;
		System.out.println(resultado);
		
		resultado=resultado%2;
		System.out.println(resultado);
		
//concatena??o de strings
		
		String primeiroNome="Esta ?";	
		String segundoNome="uma string concatenada";
		
		System.out.println(primeiroNome +" "+ segundoNome);
		
	
		
		System.out.println(resultado++);
		//mesma coisa
		//resultado=resultado+1
		//resultado+=1
		
		
		System.out.println(++resultado);
		//mesma coisa
				//resultado=resultado+1
				//resultado+=1
		
		resultado--;
		//retirando 1
		System.out.println(resultado);
		//vai imprimir 6 e vai tirar 1
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		
		
	}

}
