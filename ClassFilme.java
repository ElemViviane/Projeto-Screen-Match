package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classsificavel;

public class Filme extends Titulo implements Classsificavel {

	
	@Override
	public int getDuracaoEmMinutos() {
		return super.getDuracaoEmMinutos();
	}

	//Assisnatura com a interface classificavel, onde aqui é preciso fazer um cast de valor.
	@Override
	public int getClassificacao() {
		return (int) getMedia() / 2;
	}
}
