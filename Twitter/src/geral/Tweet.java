package geral;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Tweet {
	private String idTweet;
	private String user;
	private Date data;
	private String conteudo;
	private ArrayList<String> rUsers;
	private ArrayList<String> rTopics;
	private Ponto geoLoc;
	private Tweet retweet;
	
	
	public Tweet(String user, Date data, String conteudo) {
		this.user = user;
		this.data = data;
		this.conteudo = conteudo;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public ArrayList<String> getrUsers() {
		return rUsers;
	}
	public void setrUsers(ArrayList<String> rUsers) {
		this.rUsers = rUsers;
	}
	public ArrayList<String> getrTopics() {
		return rTopics;
	}
	public void setrTopics(ArrayList<String> rTopics) {
		this.rTopics = rTopics;
	}
	public Ponto getGeoLoc() {
		return geoLoc;
	}
	public void setGeoLoc(Ponto geoLoc) {
		this.geoLoc = geoLoc;
	}
	public Tweet getRetweet() {
		return retweet;
	}
	public void setRetweet(Tweet retweet) {
		this.retweet = retweet;
	}

	public String getIdTweet() {
		return idTweet;
	}

	public void setIdTweet(String idTweet) {
		this.idTweet = idTweet;
	}	
	
}


class DateComp implements Comparator<Tweet>{
	@Override
    public int compare(Tweet e1, Tweet e2) {
        if(e1.getData().after(e2.getData())){
            return 1;
        } else {
            return -1;
        }
    }
}
