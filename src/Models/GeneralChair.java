package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneralChair extends Organizador {
	List<Participante> participantes = new ArrayList<Participante>();

	public void ValidarParticipante(Participante participante) {

		if (participante.getCpf() != null) {

			participantes.add(participante);
			System.out.println("participante validado ");

		} else {
			System.out.println("participante não validado validado ");

		}

	}

	public void emitirCertificado() {
		String cpf, senha;

		Scanner receba = new Scanner(System.in);

		System.out.println("digite o cpf do participante ");
		cpf = receba.next();

		System.out.println("digite a senha do participante ");
		senha = receba.next();
		
		for (Participante part : participantes) {
			
			
			if (part.getCpf() == cpf && part.getSenha() == senha) {

				System.out.println("Certificado de participante  ");
				System.out.println("nome: " + part.getNome());
				System.out.println("Cpf: " + part.getCpf());
				System.out.println("data de nascimento " + part.getDataNascimento());
				System.out.println("titulação: " + part.getTitulacao());
				System.out.println("instituição: " + part.getInstituicao());
				System.out.println("--------------------------------------------");

			} else {
				System.out.println("participante inexistente ");

			}
		}
		
		receba.close();

	}

	
	

}
