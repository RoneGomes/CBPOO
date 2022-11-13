import java.util.Scanner;

import Models.Autor;
import Models.GeneralChair;
import Models.Participante;
import Models.ProgChair;
import Models.Revisor;

public class Menu {

	public static void main(String[] args) {

		Scanner receba = new Scanner(System.in);
		int opcao, id;
		boolean logado = false;

		Participante participante = new Participante();
		Autor autor = new Autor();
		Revisor revisor = new Revisor();
		ProgChair progChair = new ProgChair();
		GeneralChair generalChair = new GeneralChair();

		// Menu

		do {
			System.out.println("=========Sistema CBPOO ==========");
			System.out.println("1- Para fazer Login");
			System.out.println("2- Cadastrar Participante");
			System.out.println("3- Para emetir Certificado");
			System.out.println("4- Enviar artigo");
			System.out.println("5- Ver avaliações ");
			System.out.println("6- Ver artigos aprovados");
			System.out.println("7- Ver artigos negados");
			System.out.println("8- Ver dados do artigo");
			System.out.println("9- Listar  participantes");

			System.out.println("10- Sair");

			opcao = receba.nextInt();

			switch (opcao) {
			case 1: {
				// opção de login
				String CPf, senha;
				System.out.println("Tela de   " + Opcao.Login);

				System.out.println("Digite o Cpf");
				CPf = receba.next();
				System.out.println("Digite o senha");
				senha = receba.next();

				if (CPf == participante.getCpf() && senha == participante.getSenha()) {
					System.out.println("Seja bem vindo(a) a nosso sistema");
					logado = true;

				} else {

					System.out.println("cpf ou senha invalidos , por fovor digite novamente");

				}

				break;

			}
			case 2: {

				// definição de qual tipo de usuario se trata

				System.out.println("Tela de  " + Opcao.Cadastro + " de " + Opcao.Participantes);
				int opcao2;
				do {
					System.out.println("Digite 1-para cadastrar participante comum ");
					System.out.println("Digite 2-para cadastrar autor ");
					System.out.println("Digite 3-para cadastrar revisor ");
					System.out.println("Digite 4-para Voltar ao menu principal");
					opcao2 = receba.nextInt();
					switch (opcao2) {

					case 1: {

						System.out.println("Digite o cpf ");
						participante.setCpf(receba.next());
						System.out.println("Digite o nome ");
						participante.setNome(receba.next());
						System.out.println("Digite o data de nascimento ");
						participante.setDataNascimento(receba.next());
						System.out.println("Digite o nome da instituição ");
						participante.setInstituicao(receba.next());
						System.out.println("Digite a titulação ");
						participante.setTitulacao(receba.next());
						System.out.println("Digite a senha ");
						participante.setSenha(receba.next());
						System.out.println("participante cadastrado com sucesso");

						generalChair.addParticipantes(participante);

						break;
					}
					case 2: {

						System.out.println("Digite o cpf ");
						autor.setCpf(receba.next());
						System.out.println("Digite o nome ");
						autor.setNome(receba.next());
						System.out.println("Digite o data de nascimento ");
						autor.setDataNascimento(receba.next());
						System.out.println("Digite o nome da instituição ");
						autor.setInstituicao(receba.next());
						System.out.println("Digite a titulação ");
						autor.setTitulacao(receba.next());
						System.out.println("Digite a especializaçao ");
						autor.setAreaEspecialidade(receba.next());

						System.out.println("Digite a senha ");
						autor.setSenha(receba.next());
						System.out.println("autor cadastrado com sucesso");

						progChair.addParticipantes(autor);

						break;
					}
					case 3: {

						System.out.println("Digite o cpf ");
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
						autor.setAreaEspecialidade(receba.next());
						System.out.println("Digite a senha ");
						revisor.setSenha(receba.next());
						System.out.println("revisor cadastrado com sucesso");

						progChair.addParticipantes(revisor);

						break;
					}
					case 4: {

						System.out.println("voltando para o menu principal");

						break;
					}
					default:
						System.out.println("opcao inexistente por favor degite novamente");
					}
				} while (opcao2 != 4);

				break;
			}

			case 3: {

				// se usuario estiver logado o objeto generalchair ira imprimir um certificado
				// de acordo com a senha e cpf informados

				System.out.println("Tela para  " + Opcao.Emetir + " " + Opcao.Certificado);
				if (logado) {

					generalChair.emitirCertificado();
				} else {

					System.out.println("por favor  ");
				}

				break;
			}
			case 4: {
				try {
					System.out.println("Tela para  " + Opcao.Enviar + " " + Opcao.Artigo);

					if (logado) {
						autor.enviarArtigo();

					} else {

						System.out.println("por favor , faça seu login ");
					}

				} catch (Exception e) {
					System.out.println("algo ocorreu errado");
				}

				break;

			}
			case 5: {
				try {

					System.out.println("Tela para  " + Opcao.Listar + " " + Opcao.Artigos);

					if (logado) {
						progChair.listarArtigos();
						;

					} else {

						System.out.println("por favor , faça seu login ");
					}

				} catch (Exception e) {

				}

				break;

			}
			case 6: {
				try {
					System.out.println("Tela para  " + Opcao.Ver + " " + Opcao.Artigos + " " + Opcao.Aprovados);

					if (logado) {
						progChair.listarArtigoAprovados();

					} else {

						System.out.println("por favor , faça seu login ");
					}

				} catch (Exception e) {

				}

				break;

			}

			case 7: {
				try {

					System.out.println("Tela para  " + Opcao.Ver + " " + Opcao.Artigos + " " + Opcao.Negados);

					if (logado) {
						progChair.listarArtigoReprovados();
						
					} else {

						System.out.println("por favor , faça seu login ");
					}

				} catch (Exception e) {
					System.out.println("algo ocorreu errado");
				}

				break;

			}

			case 8: {
				
				try {
					System.out.println("Tela para  " + Opcao.Listar + " dados do " + Opcao.Artigo);

					if (logado) {
						// progChair.listarArtigoReprovados();

					} else {

						System.out.println("por favor , faça seu login ");
					}

					
				} catch (Exception e) {
					System.out.println("algo ocorreu errado");
				}

				
				break;

			}

			case 9: {

				
				try {
					
					System.out.println("Tela para  " + Opcao.Listar + " todos  " + Opcao.Participantes);

					if (logado) {
						progChair.listarParticipante();
						
						generalChair.listarParticipante();

					} else {

						System.out.println("por favor , faça seu login ");
					}
					
				} catch (Exception e) {
					System.out.println("algo deu errado");
				}
					
				
				

				break;

			}

			case 10: {
				System.out.println("obrigado por usar nossa agenda!");
				break;
			}

			default:
				System.out.println("opcao inexistente por favor degite novamente");
			}

		} while (opcao != 10);

		receba.close();

	}

}
