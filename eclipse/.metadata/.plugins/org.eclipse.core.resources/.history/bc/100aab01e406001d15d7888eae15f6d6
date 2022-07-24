package com.loaine.cursojava.lista09;

import java.util.Scanner;

public class ContaCorrente {
	
	
	    private String numero;
	    private String agencia;
	    private boolean especial;
	    private double limiteEspecial;
	    private double saldo;
	    
	    //construtores
	    public ContaCorrente() {
	    	
		}
		public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
			super();
			this.numero = numero;
			this.agencia = agencia;
			this.especial = especial;
			this.limiteEspecial = limiteEspecial;
			this.saldo = saldo;
		}
		
		//metodos get e set
		
		

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
//para boolean n utiliza get utiliza o is 
		public boolean isEspecial() {
			return especial;
		}

		public void setEspecial(boolean especial) {
			this.especial = especial;
		}

		public double getLimiteEspecial() {
			return limiteEspecial;
		}

		public void setLimiteEspecial(double limiteEspecial) {
			this.limiteEspecial = limiteEspecial;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		//metodos
		public boolean realizarSaque(double quantiaASacar){

	        //tem saldo na conta
	        if (saldo >= quantiaASacar){
	            saldo -= quantiaASacar;
	            return true;
	        } else { //não tem saldo na conta
	            if (especial) {
	                //verificar se o limite especial tem saldo
	                double limite = limiteEspecial + saldo;
	                if (limite >= quantiaASacar){
	                    saldo -= quantiaASacar;
	                    return true;
	                } else {
	                    return false;
	                }
	            } else {
	                return false; //não é especial e não tem saldo suficiente
	            }
	        }    
	    }
		
		public void depositar(double valorDepositado){

	        saldo += valorDepositado;
	    }

	    public void consultarSaldo(){
	        System.out.println("Saldo atual da conta = " + saldo); 
	    }

	    public boolean verificarUsoChequeEspecial(){
	        return saldo < 0;
	    }
	
	    
	}
	
	
	
	
		
		
		

	

			
	
			

			
			
	



