import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import br.com.alura.screenmatch.modelos.Serie;

import br.com.alura.screenmatch.modelos.Filme;


public class Principal {
	public static void main(String[] args) {
		
		System.out.println("______________________________________________");
		Filme aCulpaEDasEstrelas = new Filme();
		aCulpaEDasEstrelas.setIncluidoNoPlano(true);
		aCulpaEDasEstrelas.setNome("A Culpa É das Estrelas");
		aCulpaEDasEstrelas.setGenero("Romance/Drama");
		aCulpaEDasEstrelas.setDiretor("Josh Boone");
		aCulpaEDasEstrelas.setAnoLancamento(2014);
		aCulpaEDasEstrelas.setDuracaoEmMinutos(126);
		aCulpaEDasEstrelas.setAtiva(true);
		
		aCulpaEDasEstrelas.exibeFichaTecnica();
		
		aCulpaEDasEstrelas.avalia(8);
		aCulpaEDasEstrelas.avalia(10);
		aCulpaEDasEstrelas.avalia(7);
		aCulpaEDasEstrelas.avalia(7.5);
		aCulpaEDasEstrelas.avalia(5.5);
		
		System.out.println("Duração: " + aCulpaEDasEstrelas.getDuracaoEmMinutos() + 
				" Minutos");
		
		System.out.println("Total de avaliações:  "
				+ aCulpaEDasEstrelas.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				aCulpaEDasEstrelas.getMedia()));
		
		FiltroRecomendacao aCulpaEstrelas = new FiltroRecomendacao();
        aCulpaEstrelas.filtra(aCulpaEDasEstrelas);
        
        System.out.println("Classificação: " 
        + aCulpaEDasEstrelas.getClassificacao() + "★");
        
        System.out.println("______________________________________________");
		System.out.println("\n");
		
		
		System.out.println("______________________________________________");
		Filme taChovendoHamburguer = new Filme();
		taChovendoHamburguer.setIncluidoNoPlano(false);
		taChovendoHamburguer.setNome("Tá Chovendo Hambúguer");
		taChovendoHamburguer.setGenero("Infantil/Comédia");
		taChovendoHamburguer.setDiretor("Phil Lord e Chris Miller");
		taChovendoHamburguer.setAnoLancamento(2009);
		taChovendoHamburguer.setDuracaoEmMinutos(90);
		taChovendoHamburguer.setAtiva(false);
		
		taChovendoHamburguer.exibeFichaTecnica();
		
		taChovendoHamburguer.avalia(7.9);
		taChovendoHamburguer.avalia(6.9);
		taChovendoHamburguer.avalia(10);
		taChovendoHamburguer.avalia(5);
		taChovendoHamburguer.avalia(6);
		
		System.out.println("Duração: " + taChovendoHamburguer.getDuracaoEmMinutos() 
		+ " Minutos");
		
		System.out.println("Total de avaliações: "
		+ taChovendoHamburguer.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				taChovendoHamburguer.getMedia()));
		
		FiltroRecomendacao chovendoHamburguer = new FiltroRecomendacao();
		chovendoHamburguer.filtra(taChovendoHamburguer);
		
		System.out.println("Classificação: " 
		+ taChovendoHamburguer.getClassificacao() + "★");
		
		System.out.println("_________________________________________________");
		System.out.println("\n");
		
		
		System.out.println("_________________________________________________");
		Filme transformersOFilme = new Filme();
		transformersOFilme.setIncluidoNoPlano(true);
		transformersOFilme.setNome("Transformers - O Filme");
		transformersOFilme.setGenero("Ação/Ficção Científica");
		transformersOFilme.setDiretor("Michael Bay");
		transformersOFilme.setAnoLancamento(2007);
		transformersOFilme.setDuracaoEmMinutos(144);
		transformersOFilme.setAtiva(false);
	
		transformersOFilme.exibeFichaTecnica();
		
		transformersOFilme.avalia(10);
		transformersOFilme.avalia(8.9);
		transformersOFilme.avalia(8.7);
		transformersOFilme.avalia(10);
		transformersOFilme.avalia(9);
		
		System.out.println("Duração: " + transformersOFilme.getDuracaoEmMinutos()
			    + " Minutos");
		
		System.out.println("Total de avaliações: " 
				+ transformersOFilme.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				transformersOFilme.getMedia()));
		
		FiltroRecomendacao transformersFilme = new FiltroRecomendacao();
		transformersFilme.filtra(transformersOFilme);
		
		System.out.println("Classificação: " 
		+ transformersOFilme.getClassificacao() + "★");
		
		System.out.println("___________________________________________________________");
		System.out.println("\n");
		
		
		System.out.println("_____________________________________________________________");
		Filme panicoVI = new Filme();
		panicoVI.setIncluidoNoPlano(true);
		panicoVI.setNome("Pânico VI");
		panicoVI.setGenero("Terror/Mistério");
		panicoVI.setDiretor("Tyler Guillett, Wes Craven e Matt Bettinelli-Olpin");
		panicoVI.setAnoLancamento(2023);
		panicoVI.setDuracaoEmMinutos(122);
		panicoVI.setAtiva(true);
		
		panicoVI.exibeFichaTecnica();
		
		panicoVI.avalia(7.5);
		panicoVI.avalia(3);
		panicoVI.avalia(2);
		panicoVI.avalia(5.1);
		panicoVI.avalia(2);
		
		System.out.println("Duração: " + panicoVI.getDuracaoEmMinutos() + " Minutos");
		
		System.out.println("Total de avaliações: " + panicoVI.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				panicoVI.getMedia()));
		
		FiltroRecomendacao panico = new FiltroRecomendacao();
		panico.filtra(panicoVI);
		
		System.out.println("Classificação: " + panicoVI.getClassificacao() + "★");
		
		System.out.println("_____________________________________________________________");
		System.out.println("\n");
		
		
		System.out.println("___________________________________________________");
		Filme itACoisa = new Filme();
		itACoisa.setIncluidoNoPlano(true);
		itACoisa.setNome("IT - A Coisa");
		itACoisa.setGenero("Terror/Thriller");
		itACoisa.setDiretor("Andy Muschietti");
		itACoisa.setAnoLancamento(2017);
		itACoisa.setDuracaoEmMinutos(135);
		itACoisa.setAtiva(true);
		
		itACoisa.exibeFichaTecnica();
		
		itACoisa.avalia(10);
		itACoisa.avalia(9);
		itACoisa.avalia(9.8);
		itACoisa.avalia(8.5);
		itACoisa.avalia(8.9);
		
		System.out.println("Duração: " + itACoisa.getDuracaoEmMinutos() + " Minutos");
		
		System.out.println("Total de avaliações: " + itACoisa.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				itACoisa.getMedia()));
		
		FiltroRecomendacao it = new FiltroRecomendacao();
		it.filtra(itACoisa);
		
		System.out.println("Classificação: " + itACoisa.getClassificacao() + "★");
		
		System.out.println("____________________________________________________");
		System.out.println("\n");
		
		
		System.out.println("_____________________________________________________________");
		Serie pousandoNoAmor = new Serie();
		pousandoNoAmor.setAssiste("Dorama/Kdrama");                  
		System.out.println(pousandoNoAmor.getAssiste());
		pousandoNoAmor.setIncluidoNoPlano(true);
		pousandoNoAmor.setAtiva(true);
		pousandoNoAmor.setNome("Pousando No Amor");
		pousandoNoAmor.setGenero("Comédia Romântica");
		pousandoNoAmor.setDiretor("Lee Jeong-hyo");
		pousandoNoAmor.setAnoLancamento(2019);
		pousandoNoAmor.setMinutosPorEpisodio(70);
		pousandoNoAmor.setTemporadas(1);
		pousandoNoAmor.setEpisodiosPorTempordas(16);
		
		pousandoNoAmor.exibeFichaTecnica();
		
		pousandoNoAmor.avalia(10);
		pousandoNoAmor.avalia(9.9);
		pousandoNoAmor.avalia(8.9);
		pousandoNoAmor.avalia(10);
		pousandoNoAmor.avalia(10);
		
		System.out.println("Temporadas: " + pousandoNoAmor.getTemporadas());
		
		System.out.println("Episódios por temporada: "
		+ pousandoNoAmor.getEpisodiosPorTempordas());
		
		System.out.println("Minutos por episódio: " +
		pousandoNoAmor.getMinutosPorEpisodio() + " Minutos");
		
		System.out.println("Total de avaliações: " 
		+ pousandoNoAmor.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				pousandoNoAmor.getMedia()));
		
		FiltroRecomendacao pousandoAmor = new FiltroRecomendacao();
		Serie pa = new Serie();
		pa.setVisualizacao(21000);
		pousandoAmor.filtra(pa);
		
		System.out.println("Classificação: " + pa.getClassificacao() + "★");
		System.out.println(pa.getVisualizacao() + " Visualiazões");
		
		System.out.println(String.format("Duração total de %d Minutos, para maratonar %s ",
				pousandoNoAmor.getDuracaoEmMinutos(), pousandoNoAmor.getNome()));
		
		System.out.println("____________________________________________________________");
		System.out.println("\n");
		
		
		System.out.println("____________________________________________________________");
		Serie supernatural = new Serie();
		supernatural.setIncluidoNoPlano(true);
		supernatural.setAtiva(true);
		supernatural.setNome("Supernatural");
		supernatural.setGenero("Mistério");
		supernatural.setDiretor("Eric Kripke");
		supernatural.setAnoLancamento(2005);
		supernatural.setMinutosPorEpisodio(45);
		supernatural.setTemporadas(15);
		supernatural.setEpisodiosPorTempordas(22);
		
		supernatural.exibeFichaTecnica();
		
		supernatural.avalia(10);
		supernatural.avalia(3);
		supernatural.avalia(10);
		supernatural.avalia(9.9);
		supernatural.avalia(9.8);
		
		System.out.println("Temporadas: " + supernatural.getTemporadas());
		
		System.out.println("Episódios por temporada: " + 
				supernatural.getEpisodiosPorTempordas());
		
		System.out.println("Minutos por episódio: " + 
				supernatural.getMinutosPorEpisodio() + " Minutos");
		
		System.out.println("Total de avaliações: " + supernatural.getTotalDeAvaliacoes());
		
		System.out.println(String.format("Média das avaliações: %.1f",
				supernatural.getMedia()));
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		Serie sp = new Serie();
		sp.setVisualizacao(15000);
		filtro.filtra(sp);
		
		System.out.println("Classificação: " + sp.getClassificacao() + "★");
		System.out.println(sp.getVisualizacao() + " Visualizações");
		
		System.out.println(String.format("Duração total de %d Minutos, "
				+ "para maratonar %s ", supernatural.getDuracaoEmMinutos(),
				supernatural.getNome()));
		
		System.out.println("____________________________________________________________");
		System.out.println("\n");
		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(aCulpaEDasEstrelas);
		calculadora.inclui(taChovendoHamburguer);
		calculadora.inclui(transformersOFilme);
		calculadora.inclui(supernatural);
		calculadora.inclui(pousandoNoAmor);
		calculadora.inclui(itACoisa);
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨"
				+ "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(String.format("Tempo total para maratonar: %s e %s,"
				+ " é de %d Minutos", supernatural.getNome(), pousandoNoAmor.getNome(),
				calculadora.getTempoTotal()));
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨"
				+ "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
				
				
		ArrayList<Filme> filmes = new ArrayList<>();
		filmes.add(transformersOFilme);
		filmes.add(taChovendoHamburguer);
		filmes.add(aCulpaEDasEstrelas);
		filmes.add(panicoVI);
		filmes.add(itACoisa);
		
		System.out.println("Lista de Filmes");
		System.out.println(filmes.get(0).getNome() 
				+ " " + filmes.get(0).getClassificacao() + "★");
		
		System.out.println(filmes.get(1).getNome()
				+ " " + filmes.get(1).getClassificacao() + "★");
		
		System.out.println(filmes.get(2).getNome()
				+ " " + filmes.get(2).getClassificacao() + "★");
		
		System.out.println(filmes.get(3).getNome()
				+ " " + filmes.get(3).getClassificacao() + "★");
		
		System.out.println(filmes.get(4).getNome()
				+ " " + filmes.get(4).getClassificacao() + "★");
		
		ArrayList<Serie> series = new ArrayList<>();
		series.add(supernatural);
		series.add(pousandoNoAmor);
		
		System.out.println("\nLista de Séries");
		System.out.println(series.get(0).getNome());
		System.out.println(series.get(1).getNome());
		
		System.out.println("\nQuantidades de filmes adicionados: "
				+ filmes.size());
		System.out.println("Quantidade de Séries adicionados: "
				+ series.size());
	}
}
