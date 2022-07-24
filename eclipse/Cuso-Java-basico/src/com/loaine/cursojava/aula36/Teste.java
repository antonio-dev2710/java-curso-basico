package com.loaine.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
	
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("-");
		//contato.setTelefone("71992916455");
		
		//criar objeto end-Relacionamneto tem um
		Endereco end = new Endereco();
		end.setNomeRua("Rua Bcu�ba");
		end.setNumero("890");
		end.setCep("41680-050");
		end.setCidade("Salvador");
		end.setComplemento("colina A");
		end.setEstado("Bahia");
		
		////criar objeto tel-Relacionamneto tem um
		Telefone tel = new Telefone();
		tel.setDdd("71");
		tel.setNumero("992916455");
		tel.setTipo("Celular");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("71");
		tel2.setNumero("987798619");
		tel2.setTipo("Celular");
		
		Telefone [] telefones =new Telefone[2];
		telefones[0]=tel;
		telefones[1]=tel2;
		
		//setar objeto enderco no contato
		contato.setEndereco(end);
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		//saida do console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		
		//tratamento de erro para getEndereco()
		if(contato.getEndereco()!=null && contato != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		/*if(contato.getTelefone()!=null && contato != null) {
			System.out.println(contato.getTelefone().getDdd()+"-"+contato.getTelefone().getNumero());
		}

*/
		//verifica��o a esse objeto ou array e a classe � diferente de nulo
		if(contato!=null && contato.getTelefones()!=null) {
			//foreach		
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+"-"+t.getNumero());
			}
		}
		
	}

}
