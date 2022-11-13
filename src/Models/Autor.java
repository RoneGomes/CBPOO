package Models;

import java.util.Scanner;

public class Autor extends Especialista {

	// metodo que envia o artigo para ser avaliado
	public void enviarArtigo() {

		Scanner receba = new Scanner(System.in);
		Artigo artigo = new Artigo();
		Revisor revisor = new Revisor();
		Autor autor = new Autor();

		// dados do artigo
		System.out.println("digite o id artigo");
		artigo.setId(receba.nextInt());

		System.out.println("digite o titulo  ");
		artigo.setTitulo(receba.next());

		System.out.println(" digete resumo  ");
		artigo.setResumo(receba.next());

		System.out.println("digte as palavraChaves: ");
		artigo.setPalavraChaves(receba.next());

		System.out.println("digite a quantidade de paginas ");
		artigo.setQuantPagina(receba.nextInt());

		System.out.println("digite a data de submissão:");
		artigo.setDataSub(receba.next());

		// dados do autor
		System.out.println("Digite o cpf do autor ");
		autor.setCpf(receba.next());
		System.out.println("Digite o nome do autor ");
		autor.setNome(receba.next());
		System.out.println("Digite o data de nascimento do autor ");
		autor.setDataNascimento(receba.next());
		System.out.println("Digite o nome da instituição ");
		autor.setInstituicao(receba.next());
		System.out.println("Digite a titulação ");
		autor.setTitulacao(receba.next());
		System.out.println("Digite a especializaçao ");
		autor.setAreaEspecialidade(receba.next());
		System.out.println("Digite a senha ");
		autor.setSenha(receba.next());

		artigo.addAutor(autor);

		revisor.avaliar(artigo);

		receba.close();

	}

}
