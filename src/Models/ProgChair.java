package Models;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ProgChair extends Organizador {
	List<Artigo> aprovados = new ArrayList<Artigo>();
	List<Artigo> reprovados = new ArrayList<Artigo>();
	List<Artigo> artigos = new ArrayList<Artigo>();
	List<Especialista> especialistas = new ArrayList<Especialista>();

	public void addParticipantes(Especialista especialista) {
		especialistas.add(especialista);

	}

	public void addArtigo(Artigo artigo) {
		artigos.add(artigo);

	}

	public void Avaliar(Artigo artigo) {

		if (artigo.getAvaliacao()) {
			System.out.println("Artigo aprovado");
			aprovados.add(artigo);

		} else {
			System.out.println("Artigo reprovado");
			reprovados.add(artigo);
		}

		artigos.add(artigo);
	}

	// sobre escrita do metodo da classe mãe
	@Override
	public void listarParticipante() {

		for (Especialista p : especialistas) {

			System.out.println("Cpf: " + p.getCpf());

			System.out.println("nome: " + p.getNome());

			System.out.println("data de nascimento " + p.getDataNascimento());

			System.out.println("titulação: " + p.getTitulacao());

			System.out.println("instituição: " + p.getInstituicao());
			
			System.out.println("area de especialidade"+ p.getAreaEspecialidade());

			System.out.println("--------------------------------------------");

		}
	}

	public void listarArtigoAprovados() {

		for (Artigo a : aprovados) {

			System.out.println("id: " + a.getId());

			System.out.println("titulo: " + a.getTitulo());

			System.out.println("resumo " + a.getResumo());

			System.out.println("palavraChaves: " + a.getPalavraChaves());

			System.out.println("quantPagina: " + a.getQuantPagina());

			System.out.println("dataSub :" + a.getDataSub());

			System.out.println("--------------------------------------------");

		}
	}

	public void listarArtigoReprovados() {

		for (Artigo a : reprovados) {

			System.out.println("id: " + a.getId());

			System.out.println("titulo: " + a.getTitulo());

			System.out.println("resumo " + a.getResumo());

			System.out.println("palavraChaves: " + a.getPalavraChaves());

			System.out.println("quantPagina: " + a.getQuantPagina());

			System.out.println("dataSub :" + a.getDataSub());

			System.out.println("--------------------------------------------");

		}
	}

	public void listarArtigos() {

		for (Artigo a : artigos) {

			System.out.println("id: " + a.getId());

			System.out.println("titulo: " + a.getTitulo());

			System.out.println("resumo " + a.getResumo());

			System.out.println("palavraChaves: " + a.getPalavraChaves());

			System.out.println("quantPagina: " + a.getQuantPagina());

			System.out.println("dataSub :" + a.getDataSub());

			System.out.println("--------------------------------------------");

		}
	}

}
