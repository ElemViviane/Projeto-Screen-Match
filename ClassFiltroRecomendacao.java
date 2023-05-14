package br.com.screenmatch.calculos;

public class FiltroRecomendacao {

	public void filtra(Classsificavel classificavel) {
		if (classificavel.getClassificacao() >= 4) {
			System.out.println("Está entre os preferidos do momento!");
			
		} else if (classificavel.getClassificacao() >= 3 && 
				classificavel.getClassificacao() < 4) {
			System.out.println("Muito bem avaliado no momento!");
			
		} else {
			System.out.println("Não está bem avaliado!");
		}
	}
}
