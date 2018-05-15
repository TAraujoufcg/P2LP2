package p2lab3agenda;

public class Agenda {
	private static String[][] pessoas = new String[100][3];
	private int localInsercao;
	private String nomeContato;
	private String sobrenomeContato;
	private String telefoneContato;

	public Agenda(int posicao, String nome, String sobrenome, String telefone) {
		localInsercao = posicao -1;
		nomeContato = nome;
		sobrenomeContato = sobrenome;
		telefoneContato = telefone;
	}

	public String cadastraContato() {
		pessoas[localInsercao][0] = nomeContato;
		pessoas[localInsercao][1] = sobrenomeContato;
		pessoas[localInsercao][2] = telefoneContato;
		return "CADASTRO REALIZADO!\n";
	}
	
	public String listaAgenda() {
		String retornoAgenda = null;
		String oNome;
		String oSobrenome;
		int contatosValidos = 0;
		for (int i = 0; i < 100; i++) {
			if (!((pessoas[i][0].equals(null)) && (pessoas[i][1].equals(null)))){
				contatosValidos++;
				int pos = i+1;
				
				String aPosicao = String.format("%d", pos);
				oNome = pessoas[i][0];
				oSobrenome = pessoas[i][1];
				String osContatos = aPosicao + " - " + oNome + " " + oSobrenome;
				if (retornoAgenda.equals(null)) {
					retornoAgenda = osContatos + "\n";
				}else {
					retornoAgenda += osContatos + "\n";
				}
			}
		}
		if (contatosValidos == 0) {
			return "Agenda Vazia";
		}else {
			return retornoAgenda;
		}
	}


	
	public String buscaContato(int pesquisarContato) {
		int localContato = pesquisarContato - 1;
			if ((pessoas[localContato][0].equals(null)) && 
				(pessoas[localContato][1].equals(null)) && 
				(pessoas[localContato][2].equals(null))){
				return "Contato Inexistente";
			}else {
				String nomePesquisado = pessoas[localContato][0].toString();
				String sobrenomePesquisado = pessoas[localContato][1].toString();
				String telefonePesquisado = pessoas[localContato][2].toString();
				return nomePesquisado +" " + sobrenomePesquisado + " - " + telefonePesquisado;
			}
	}		
}