package Models;

import java.util.Scanner;

public class Revisor extends Especialista {

	
	
	Scanner receba = new Scanner(System.in);
	

	// medoto q valida ou nao o artigo e insere um revisor para a lista de revisores
	// do artigo
	public void avaliar(Artigo artigo) {
		ProgChair progChair = new ProgChair();
		Revisor revisor = new Revisor();
		int cont = 0;
		int aux = 0;
		for (Autor a : artigo.getAutores()) {
			cont++;
			if (a.getCpf() != null && a.getSenha() != null) {
				aux++;
			}
		}

		if (cont > 1 && cont <= 5 && aux != 0) {

			System.out.println("artigo aprovado");

			artigo.setAvaliacao(true);

		} else {

			System.out.println("artigo reprovado");
			artigo.setAvaliacao(false);

		}

		System.out.println("Digite o cpf do revisor ");
		revisor.setCpf(receba.next());
		System.out.println("Digite o nome ");
		revisor.setNome(receba.next());
		System.out.println("Digite o data de nascimento ");
		revisor.setDataNascimento(receba.next());
		System.out.println("Digite o nome da instituição ");
		revisor.setInstituicao(receba.next());
		System.out.println("Digite a titulação ");
		revisor.setTitulacao(receba.next());
		System.out.println("Digite a especializaçao ");
		revisor.setAreaEspecialidade(receba.next());
		System.out.println("Digite a senha ");
		revisor.setSenha(receba.next());
		artigo.addRevisor(revisor);
		progChair.Avaliar(artigo);

	}

}
