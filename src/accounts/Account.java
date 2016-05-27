package accounts;

import java.util.ArrayList;
import java.util.List;

import bot.EigenesDorf;

public class Account {
	public List<EigenesDorf> liste;
	public String name;
	public Rohstofflager lager;
	
	public Account(List<EigenesDorf> liste, String name, Rohstofflager lager) {
		super();
		this.liste = liste;
		this.name = name;
		this.lager = lager;
	}
	private Account(){
		
	}
	public List<EigenesDorf> getListe() {
		return liste;
	}
	public String getName() {
		return name;
	}
	public Rohstofflager getLager() {
		return lager;
	}
	
	
	
	
}
