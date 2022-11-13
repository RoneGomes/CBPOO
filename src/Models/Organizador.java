package Models;


import java.util.ArrayList;
import java.util.List;

public class Organizador extends Pessoa {
	
	
	List<Participante> participantes= new ArrayList<Participante>();
	
	
	public void addParticipantes(Participante participante) {
		participantes.add(participante);
		
		
	}
	
    
 public void listarParticipante() {
	 
	 for (Participante p : participantes) {

			System.out.println("Cpf: " + p.getCpf());
			
			System.out.println("nome: " + p.getNome());

			System.out.println("data de nascimento " +p.getDataNascimento());

			System.out.println("titulação: " + p.getTitulacao());
			
			System.out.println("instituição: " + p.getInstituicao());

			System.out.println("--------------------------------------------");

		}

		}



	 
	
 }




