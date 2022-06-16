package com.loaine.cursojava.lista03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Questao26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar quantas notas tem em cima do valor
		Scanner scan=new Scanner(System.in);
		
		String[][] table = new String[7][];
        table[0] = new String[] { "Especificaçao", "Código", "Preço" };
        table[1] = new String[] { "cachorro quente","100","1,20"};
        table[2] = new String[] { "Bauro", "101", "1,30" };
        table[3] = new String[] { "Bauro com ovo", "102", "1,50" };
        table[4] = new String[] { "Hamburguer", "103", "1,20" };
        table[5] = new String[] { "X-hamburguer", "104", "1,30" };
        table[6] = new String[] { "Refrigerante", "105", "1,00" };


        for (String[] row : table) {
       
            System.out.format("%15s %15s %15s %n", row);
            
            
        }
        int codigo;
        
        double preco=0;
        double totalCdaPedido=0;
        double totalCompra=0;
        boolean fimPedido=false;
       do {
    	   System.out.println("Faça seu pedido:");
    	   codigo =scan.nextInt();
    	   int quantidade=0;
        		switch(codigo) {
        		//coloar os códigos
        		case 100:
        			preco=1.20;
        			quantidade++;
        			totalCdaPedido=quantidade*preco;
        			System.out.println("vc pediu:"+quantidade+" "+codigo);
        			break;
        		case 101:
        			 preco=1.30;
        			 quantidade++;
        			 totalCdaPedido=quantidade*preco;
         			System.out.println("vc pediu:"+quantidade+" "+codigo);
        			break;
        		case 102:
        			 preco=1.50;
        			 quantidade++;
        			 totalCdaPedido=quantidade*preco;
         			System.out.println("vc pediu:"+quantidade+" "+codigo);
        			break;
        		case 103:
        			 preco=1.20;
        			 quantidade++;
        			 totalCdaPedido=quantidade*preco;
         			System.out.println("vc pediu:"+quantidade+" "+codigo);
        			break;
        		case 104:
        		 preco=1.30;
        		 quantidade++;
        		 totalCdaPedido=quantidade*preco;
     			System.out.println("vc pediu:"+quantidade+" "+codigo);
        			break;
        		case 105:
        			 preco=1.00;
        			 quantidade++;
        			 totalCdaPedido=quantidade*preco;
         			System.out.println("vc pediu:"+quantidade+" "+codigo);
        			break;
        			
        			
        			default:
        				System.out.println("tem certeza q quer finalizar a sua compra:");
        				fimPedido=scan.nextBoolean();
        				if(fimPedido==true) {
        					System.out.println("Fim do pedido, obrigado!!");
        					System.out.println("Total: "+totalCompra);
        					return;
        				}
        				
        			
        		}
        		if(codigo>=100 && codigo<=105) {
        			totalCompra=totalCompra+ totalCdaPedido;}
        		
        		
        }while(codigo!=0);
       
       System.out.println("Fim do pedido, obrigado!!");
       System.out.println("Total: "+totalCompra);
       
      
	
		
 }
}
