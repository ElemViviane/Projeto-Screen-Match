package br.com.alura.screenmatch.modelos;
//Projeto Screen Match.
public class Filme {
//métodos da class.
	private String nome;
	private int anoLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	//método de ficha técnica, que já passa o nome do filme, ano de lançamento e duração.
	public void exibeFichaTecnica() {
		System.out.println("Nome: " + nome);
		System.out.println("Ano de Lançamento: " + anoLancamento);
		System.out.println("Duração: " + duracaoEmMinutos + " Minutos");
		System.out.println("Incluido no plano: " + incluidoNoPlano);
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
	
	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}
	
	//método para retornar o nome.
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//método para retornar o ano de lançamento.
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	//método para retornar se esta incluso no plano.
	public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}
	
	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	
	//método para retornar a soma das avaliações.
	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}
	
	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}
	
	//método para retornar a duração do filme em minutos.
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
}


import br.com.alura.screenmatch.modelos.Filme;
//testando a funcionalidade.
public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		meuFilme.setNome("A Culpa É das Estrelas");
		meuFilme.setAnoLancamento(2014);
		meuFilme.setDuracaoEmMinutos(126);
	        meuFilme.setIncluidoNoPlano(true);
		
		meuFilme.exibeFichaTecnica();
		
		meuFilme.avalia(8);
		meuFilme.avalia(10);
		meuFilme.avalia(7);
		meuFilme.avalia(7.5);
		
		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média das avaliações: " + meuFilme.getMedia());
		
	}
}
