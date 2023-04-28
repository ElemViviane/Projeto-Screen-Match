package br.com.alura.screenmatch.modelos;
//Projeto Screen Match.
public class Filme {
//métodos da class.
	public String nome;
	public int anoLancamento;
	public boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	public int duracaoEmMinutos;
	
	
	//método de ficha técnica, que já passa o nome do filme, ano de lançamento e duração.
	public void exibeFichaTecnica() {
		System.out.println("Nome: " + nome);
		System.out.println("Ano de Lançamento: " + anoLancamento);
		System.out.println("Duração: " + duracaoEmMinutos + " Minutos");
	}
	//método de somar e incrementar as avaliações.
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes ++;
	}
	
	//método para retornar média das notas.
	public double getMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

	//método para retornar o total de avaliações.
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
}


import br.com.alura.screenmatch.modelos.Filme;
//testando a funcionalidade.
public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		meuFilme.nome = "A Culpa É das Estrelas";
		meuFilme.anoLancamento = 2014;
		meuFilme.duracaoEmMinutos = 126;
		
		meuFilme.exibeFichaTecnica();
		
		meuFilme.avalia(8);
		meuFilme.avalia(10);
		meuFilme.avalia(7);
		meuFilme.avalia(7.5);
		
		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média das avaliações: " + meuFilme.getMedia());
		
	}
}
