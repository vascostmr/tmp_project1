package geral;

import java.util.Comparator;
import java.util.List;

public class Area{
	public List<Ponto> listaPontos;
	public String nome;
	public int countTweets;
	
	/*
	 * TODO - Garantir :
	 * 	1 - temos sempre uma ListaPontos com mais de 2 pontos 
	 *  2 - sempre que um ponto nao existir nas areas possiveis deve existir uma area generica que o apanhe
	 */
	
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

class CompArea implements Comparator<Area>{
	@Override
	public int compare(Area o1, Area o2) {
		if (o1.countTweets < o2.countTweets)
			return -1;
		else
			return 1;
	}
	
}
