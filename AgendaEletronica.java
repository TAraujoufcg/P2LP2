package p2lab3agenda;
/**
 * UFCG - Universidade Federal de Campina Grande-PB;
 * Disciplina: Programacao II;
 * Atividade: lab3 - Agenda de Contatos;
 * @author Tiago da S Araujo - Mat.: 117210355;
 */

import java.util.Scanner;

/**
 * Classe de inicialização do Programa
 */
public class AgendaEletronica {
	private static Scanner entrada = new Scanner(System.in);
	private static MenuPrincipal meuMenu = new MenuPrincipal();
	private final static String MENU = "(C)adastrar contato;\n"+
										"(L)istar contatos;\n"+
										"(E)xibir;\n"+
										"(S)air;";
	
	public static void main(String[] args) {
		String opcao;
		
		System.out.println("Bem-vindo a sua agenda Eletronica de contatos!");
		System.out.println("Favor selecionar uma opcao no Menu, digitando a letra correspondente!" );
		
		do {
			exibeMenu();
			opcao = entrada.nextLine().toUpperCase();
			meuMenu.escolheOpcao(opcao);
		}while (!(opcao.equals("S")));
	}
	
	private static void exibeMenu() {
		System.out.println(MENU);
		System.out.println("Selecione uma opcao> ");
	}

}


