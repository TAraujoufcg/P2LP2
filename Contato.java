package p2lab3agenda;

public class Contato {
	private  int posicaoLida;
	private String nome;
	private String sobrenome;
	private String telefone;
	Agenda pesquisa;
		
	public Contato(int posicao, String nome, String sobrenome, String telefone) {
		posicaoLida = posicao;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	public String novoContato() {
		Agenda salvarContato = new Agenda(posicaoLida, telefone, telefone, telefone);
		String cadastro = salvarContato.cadastraContato();
		return cadastro;
	}
			
	public String getNome() {
		return this.nome;
	}
		
	public String getSobrenome() {
		return this.sobrenome;
	}
		
	public String getTelefone() {
		return this.telefone;		
	}
	
	public String listarContatos(){
		String dadosLista = pesquisa.listaAgenda();
		return dadosLista;
	}
	

	public String buscarContato(int pesquisarContato) {
		String retornoBusca = pesquisa.buscaContato(pesquisarContato);
			return retornoBusca;
	}

	//@Override
	//public String toString() {
	//	return nomeContato;
	//}
}