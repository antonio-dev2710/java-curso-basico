package com.loaine.cursojava.lista03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Questao27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		double n=1;
		double m=1;
		double total=0;
		
		for(int i=0;i<=5;i++) {
		
       System.out.println(+n+"/"+m);
       total=total+(n/m);
       n++;
       m=m+2;
      
		}
       
      
	
		
 }
}
