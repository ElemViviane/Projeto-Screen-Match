package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classsificavel;

public class Serie extends Titulo implements Classsificavel {
	
	private int temporadas;
	private int episodiosPorTempordas;
	private int minutosPorEpisodio;
	private int visualizacao;
	
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
	
	public int getVisualizacao() {
		return visualizacao;
	}
	
	public void setVisualizacao(int visualizacao) {
		this.visualizacao = visualizacao;
	}
	
	@Override
	public int getClassificacao() {
		if (visualizacao > 15000) {
			return 5;
			
		} else if (visualizacao > 10000 && visualizacao <= 15000) {
			return 4;
			
		} else if (visualizacao > 5000 && visualizacao <= 10000) {
			return 3;
			
		} else if (visualizacao > 1000 && visualizacao <= 5000) {
			return 2;
			
		} else if (visualizacao > 500 && visualizacao <= 1000) {
			return 1;
			
		} else {
			return 0;
		}
	}
}
