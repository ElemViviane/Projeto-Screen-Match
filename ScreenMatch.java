package br.com.screenmatch.modelos;
//Projeto Screen Match.
public class Titulo {
//métodos da class.
	private String assiste;
	private String nome;
	private String genero;
	private int anoLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	//método de ficha técnica, que já passa o nome do filme, ano de lançamento e duração.
	public void exibeFichaTecnica() {
	    if (this.incluidoNoPlano == true) {
		 System.out.println("Liberado, está incluso em seu plano!");
	    } else {
		System.out.println("Desculpe, não está incluso em seu plano!");
	    }
		System.out.println("Nome: " + nome);
		System.out.println("Gênero: " + genero);
		System.out.println("Ano de Lançamento: " + anoLancamento);
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
}


//class Filme que herda os atributos da superClass Titulo.
package br.com.screenmatch.modelos;

public class Filme extends Titulo {

	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return super.getDuracaoEmMinutos();
	}
}


//Class Serie que herda os atributos da superClass Titulo.
package br.com.screenmatch.modelos;

public class Serie extends Titulo {
	
    private int temporadas;
    private int episodiosPorTempordas;
    private boolean ativa;
    private int minutosPorEpisodio;
	
	public int getTemporadas() {
		return temporadas;
 	 }
	
	 public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
   	 }
	
  	 public int getEpisodiosPorTempordas() {
		return episodiosPorTempordas;
	 }
	
  	 public void setEpisodiosPorTempordas(int episodiosPorTempordas) {
		this.episodiosPorTempordas = episodiosPorTempordas;
	}
	
        public boolean isAtiva() {
		return ativa;
        }
	
        public void setAtiva(boolean ativa) {
	        this.ativa = ativa;
        }
	
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTempordas * minutosPorEpisodio;
	}
}

//claculador de tempo para maratonar.
package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

	private int tempoTotal;
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	public void inclui(Titulo titulo) {
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}



//testando a funcionalidade.
import br.com.screenmatch.modelos.Serie;

import br.com.screenmatch.modelos.Titulo;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
		
	Titulo meuFilme = new Titulo();
		meuFilme.setAssiste("Filme");
		System.out.println(meuFilme.getAssiste());
		meuFilme.setIncluidoNoPlano(true);
		meuFilme.setNome("A Culpa É das Estrelas");
		meuFilme.setGenero("Romance/Drama");
		meuFilme.setAnoLancamento(2014);
		meuFilme.setDuracaoEmMinutos(126);
		
		meuFilme.exibeFichaTecnica();
		
		meuFilme.avalia(8);
		meuFilme.avalia(10);
		meuFilme.avalia(7);
		meuFilme.avalia(7.5);
		meuFilme.avalia(5.5);
		
		System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos() + " Minutos");
		System.out.println("Total de avaliações:  " + meuFilme.getTotalDeAvaliacoes());
		System.out.println(String.format("Média das avaliações: %.1f", meuFilme.getMedia()));
		
		System.out.println();
		
		Titulo filme = new Titulo();
		filme.setAssiste("Filme");
		System.out.println(filme.getAssiste());
		filme.setIncluidoNoPlano(false);
		filme.setNome("Tá Chovendo Hambúguer");
		filme.setGenero("Infantil/Comédia");
		filme.setAnoLancamento(2009);
		filme.setDuracaoEmMinutos(90);
		
		filme.exibeFichaTecnica();
		
		filme.avalia(7.9);
		filme.avalia(6.9);
		filme.avalia(10);
		filme.avalia(5);
		filme.avalia(6);
		
		System.out.println("Duração: " + filme.getDuracaoEmMinutos() + " Minutos");
		System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
		System.out.println(String.format("Média das avaliações: %.1f", filme.getMedia()));
		
		System.out.println();
		
		Titulo f = new Titulo();
		f.setAssiste("Filme");
		System.out.println(f.getAssiste());
		f.setIncluidoNoPlano(true);
		f.setNome("Transformers - O Filme");
		f.setGenero("Ação/Ficção Científica");
		f.setAnoLancamento(2007);
		f.setDuracaoEmMinutos(144);
	
		f.exibeFichaTecnica();
		
		f.avalia(10);
		f.avalia(8.9);
		f.avalia(8.7);
		f.avalia(10);
		f.avalia(9);
		
		System.out.println("Duração: " + f.getDuracaoEmMinutos() + " Minutos");
		System.out.println("Total de avaliações: " + f.getTotalDeAvaliacoes());
		System.out.println(String.format("Média das avaliações: %.1f", f.getMedia()));
		
		System.out.println();
		
		Serie serie = new Serie();
		serie.setAssiste("Dorama/Kdrama");
		System.out.println(serie.getAssiste());
		serie.setIncluidoNoPlano(false);
		serie.setAtiva(true);
		serie.setNome("Pousando No Amor");
		serie.setGenero("Comédia Romântica");
		serie.setAnoLancamento(2019);
		serie.setMinutosPorEpisodio(70);
		serie.setTemporadas(1);
		serie.setEpisodiosPorTempordas(16);
		
		serie.exibeFichaTecnica();
		
		serie.avalia(10);
		serie.avalia(9.9);
		serie.avalia(8.9);
		serie.avalia(10);
		serie.avalia(10);
		
		System.out.println(String.format("Duração total de %d Minutos, "
				+ "para maratonar %s ", serie.getDuracaoEmMinutos(), serie.getNome()));
		
		System.out.println("Temporadas: " + serie.getTemporadas());
		System.out.println("Episódios por temporada: " + serie.getEpisodiosPorTempordas());
		System.out.println("Minutos por episódio: " + serie.getMinutosPorEpisodio() 
		+ " Minutos");
		
		System.out.println("Total de avaliações: " + serie.getTotalDeAvaliacoes());
		System.out.println(String.format("Média das avaliações: %.1f", serie.getMedia()));
		
		System.out.println();
		
		Serie supernatural = new Serie();
		supernatural.setAssiste("Série");
		System.out.println(supernatural.getAssiste());
		supernatural.setIncluidoNoPlano(true);
		supernatural.setAtiva(true);
		supernatural.setNome("Supernatural");
		supernatural.setGenero("Mistério");
		supernatural.setAnoLancamento(2005);
		supernatural.setMinutosPorEpisodio(45);
		supernatural.setTemporadas(15);
		supernatural.setEpisodiosPorTempordas(20);
		
		supernatural.exibeFichaTecnica();
		
		supernatural.avalia(10);
		supernatural.avalia(3);
		supernatural.avalia(10);
		supernatural.avalia(9.9);
		supernatural.avalia(9.8);
		
		System.out.println(String.format("Duração total de %d Minutos, "
				+ "para maratonar %s ", supernatural.getDuracaoEmMinutos(),
				supernatural.getNome()));
		
		System.out.println("Temporadas: " + supernatural.getTemporadas());
		System.out.println("Episódios por temporada: " + 
				supernatural.getEpisodiosPorTempordas());
		
		System.out.println("Minutos por episódio: " + 
				supernatural.getMinutosPorEpisodio() + " Minutos");
		
		System.out.println("Total de avaliações: " + supernatural.getTotalDeAvaliacoes());
		System.out.println(String.format("Média das avaliações: %.1f",
				supernatural.getMedia()));
		
		System.out.println();
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(filme);
		calculadora.inclui(f);
		calculadora.inclui(supernatural);
		
		System.out.println(String.format("Tempo total para maratonar: %s, %s,"
				+ "\n%s, %s é %d Minutos",
				meuFilme.getNome(), filme.getNome(), f.getNome(), supernatural.getNome(),
				calculadora.getTempoTotal()));
	}
}
