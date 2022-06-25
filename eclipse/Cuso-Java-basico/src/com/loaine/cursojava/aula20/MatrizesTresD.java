package com.loaine.cursojava.aula20;

public class MatrizesTresD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----------------------------------linha-coluna-profundidade
		int [][][] matirzD= new int [3][3][3];
		int soma=0;
		int somaPar=0;
		int somaImpar=0;
for(int i = 0 ; i<matirzD.length;i++) {
			for(int j = 0 ; j<matirzD[i].length;j++) {
					for(int k = 0 ; k<matirzD[i][j].length;k++) {
						System.out.println("i = " + i + " - j = " + j + " - k = " + k);
						matirzD[i][j][k]= i+j+k;
						
						matirzD[i][j][k]= i+j+k;
						
						soma+=matirzD[i][j][k];
						if(soma%2==0) {
							somaPar+=matirzD[i][j][k];
							
						}
						else {
							somaImpar+=matirzD[i][j][k];
						}
						
					}
			}
	}

System.out.println("Soma = "+soma);
System.out.println("SomaPar = "+ somaPar);
System.out.println("SomaImpar = "+ somaImpar);

}

}

