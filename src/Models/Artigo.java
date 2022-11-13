package Models;

import java.util.ArrayList;
import java.util.List;

public class Artigo {

	private int id;
	private String titulo;
	private String resumo;
	private String palavraChaves;
	private int quantPagina;
	private String dataSub;
	private boolean avaliacao;
	List<Autor> autores = new ArrayList<Autor>();
	List<Revisor> revisores = new ArrayList<Revisor>();
	
	//construtor de sobre carga
	public Artigo(int id, String titulo, String resumo, String palavraChaves, int quantPagina, String dataSub,
			boolean avaliacao, List<Autor> autores, List<Revisor> revisores) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumo = resumo;
		this.palavraChaves = palavraChaves;
		this.quantPagina = quantPagina;
		this.dataSub = dataSub;
		this.avaliacao = avaliacao;
		this.autores = autores;
		this.revisores = revisores;
	}
	
	
	//construtor vazio ou default
	
	public Artigo() {
		
	}

	

	//encapsulamento
	public boolean getAvaliacao() {
		return avaliacao;
	}

	
	public void setAvaliacao(Boolean avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setQuantPagina(int quantPagina) {
		this.quantPagina = quantPagina;
	}

	public void addAutor(Autor autor) {

		autores.add(autor);
	}

	public List<Autor> getAutores() {

		return autores;
	}

	public void addRevisor(Revisor revisor) {

		revisores.add(revisor);
	}

	public List<Revisor> getRevisores() {

		return revisores;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return this.resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getPalavraChaves() {
		return this.palavraChaves;
	}

	public void setPalavraChaves(String palavraChaves) {
		this.palavraChaves = palavraChaves;
	}

	public int getQuantPagina() {
		return this.quantPagina;
	}

	public void setQuantPagina(Integer quantPagina) {
		this.quantPagina = quantPagina;
	}

	public String getDataSub() {
		return this.dataSub;
	}

	public void setDataSub(String dataSub) {
		this.dataSub = dataSub;
	}

}
