package geral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Twitter {

	public HashMap<Tweet,Integer> topTweets;
	public HashMap<String,Integer> tweetPorMinuto;
	public HashMap<String,LinkedList<Tweet>> Tweets;
	public List<Area> cidades;
	
	public Twitter(){
		
	}
	
	public void post(Tweet tweet){
		ActualizaTopTweets(tweet);
		ActualizaTweetsPorData(tweet.getData());
		ActualizaCidades(tweet.getGeoLoc());
		
	}
	
	
	private void ActualizaCidades(Ponto geoLoc) {
		for (Area area : cidades) {
			if (pontoDaZona(area, geoLoc)){
				area.setCountTweets(area.getCountTweets()+1);
			}
		};
		
	}

	private boolean pontoDaZona(Area area, Ponto geoLoc) {
		
		return false;
	}

	private void ActualizaTweetsPorData(Date data) {
		// TODO Auto-generated method stub
		
	}

	private void ActualizaTopTweets(Tweet tweettweet){
		
	}
	
	public void getTopTweets(int rangeTweets){
		
		
	}
	
	public void getNumTweetsUser(String c){
		
	}
	
	public void getBestWindows(Date d1, Date d2, int granularidade){
		
	}
	
	public List<String> getTopCidades(int numeroDeTop){
		
		List<String> lista = new ArrayList<>();
		
		if (numeroDeTop>0 && cidades.size()>=numeroDeTop){
			Collections.sort(cidades, new CompArea());
			for (Area a : cidades) {
				lista.add(a.getNome());
				numeroDeTop--;
				if (numeroDeTop == 0){
					break;
				}
			}
		}
		
		return lista;
	}
	
	
}
