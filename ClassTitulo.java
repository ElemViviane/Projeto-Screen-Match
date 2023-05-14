package br.com.screenmatch.modelos;

public class Titulo {
//métodos da class
	private String assiste;
	private String nome;
	private String genero;
	private String diretor;
	private int anoLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	private boolean ativa;
	
	
	//método de ficha técnica, que já passa o nome do filme, ano de lançamento e duração.
	public void exibeFichaTecnica() {
		if(this.incluidoNoPlano == true) {
			System.out.println("Liberado, está incluso em seu plano!");
		} else {
			System.out.println("Desculpe, não está incluso no seu plano!");
		}
		if (this.ativa == true) {
			System.out.println("Ativo.");
		} else {
			System.out.println("Não Ativo.");
		}
		System.out.println(nome);
		System.out.println("Gênero: " + genero);
		System.out.println("Ano de Lançamento: " + anoLancamento);
		System.out.println("Diretor: " + diretor);
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

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	 public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}
	 
	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAssiste() {
		return assiste;
	}

	public void setAssiste(String assiste) {
		this.assiste = assiste;
	}

	public boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}	
	
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
}
