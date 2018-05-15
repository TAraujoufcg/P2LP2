package p2lab3agenda;
/**
 * Classe de Menu e de controle de saidas;
 */

import java.util.Scanner;

public class MenuPrincipal {
	private final String CADASTRAR = "C";
	private final String LISTAR = "L";
	private final String EXIBIR = "E";
	private final String SAIR = "S";
	private Scanner sc = new Scanner(System.in);
	private Contato buscar;

	public void escolheOpcao(String opcao) {
		String nome;
		String sobrenome;
		String telefone;
		int posicao;
		
		switch(opcao) {
			
			case CADASTRAR:
				System.out.println("posicao: ");
				posicao = sc.nextInt();
				while ((posicao < 1) || (posicao > 100)){
					System.out.println("Posicao Invalida!");
					System.out.println("informe um valor entre 1 e 100");
					posicao = sc.nextInt();
				}
				
				sc.nextLine();
				System.out.println("Nome: ");
				nome = sc.nextLine();
				while (nome.equals("")){
					System.out.println("Favor inserir um nome para o contato!");
					nome = sc.nextLine();
				}
				System.out.println("Sobrenome: ");
 				sobrenome = sc.nextLine();
				while (sobrenome.equals("")){
					System.out.println("Favor inserir um Sobrenome para o contato!");
					sobrenome = sc.nextLine();
				}
 				System.out.println("Telefone: ");
 				telefone = sc.nextLine();
 				Contato novoContato = new Contato(posicao, nome, sobrenome, telefone);
 				String confirma = novoContato.novoContato();
 				System.out.println(confirma);
 				break;
			
			case LISTAR:
				String lista = buscar.listarContatos();
				System.out.println(lista);
				break;
				
			case EXIBIR:
				System.out.println("Digite a posicao: ");
				int posContato = sc.nextInt();
				String mostraContato = buscar.buscarContato(posContato);
				System.out.println(mostraContato);
				break;
				
			case SAIR:
				System.out.println("Sistema Encerrado!");
				break;
				
			default:
				System.out.println("Opcao Invalida!");
					
		}
	}
}