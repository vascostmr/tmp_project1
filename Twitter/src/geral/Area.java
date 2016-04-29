package geral;

import java.util.List;

public class Area {
	public List<Ponto> listaPontos;
	public String nome;
	public int countTweets;
	
	
	public Area(List<Ponto> listaPontos, String nome, int countTweets){
		this.listaPontos = listaPontos;
		this.nome = nome;
		this.countTweets = countTweets;
	}
	
	public Area(List<Ponto> listaPontos, String nome){
		this.listaPontos = listaPontos;
		this.nome = nome;
		this.countTweets = 0;
	}
	
	public void incrementaSeDentroPonto(Ponto ponto){
		
		if (isDentroDeArea(ponto)){
			countTweets++;
		}
	}
	
	private boolean isDentroDeArea(Ponto ponto){
		return false;
	}
	
	public List<Ponto> getListaPontos() {
		return listaPontos;
	}
	public void setListaPontos(List<Ponto> listaPontos) {
		this.listaPontos = listaPontos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCountTweets() {
		return countTweets;
	}
	public void setCountTweets(int countTweets) {
		this.countTweets = countTweets;
	}
	
}
