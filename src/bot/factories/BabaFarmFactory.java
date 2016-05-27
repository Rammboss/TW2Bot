package bot.factories;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

import bot.Babarendorf;
import bot.Dorf;
import common.AuftragslisteInterface;
import common.Aufträge.AngriffDorf;
import io.Filehandler;
import settings.Utils;

public class BabaFarmFactory {
	
	private AuftragslisteInterface liste;
	
	private ArrayList<Babarendorf> babaliste;
	
	private static BabaFarmFactory singelton;
	
	public static BabaFarmFactory getBabafactory(AuftragslisteInterface liste){
		if(singelton == null){
			return new BabaFarmFactory(liste);
		}else return singelton;
	}
	
	private BabaFarmFactory(AuftragslisteInterface liste){
		singelton = this;
		this.liste = liste;
		
		babaliste = Filehandler.readData(new File("TXT\\c.txt"));
		int i = 0;
		for(Dorf d : babaliste){
			System.out.println(d.getClass() + "  " + i++);
		}
		this.sortFarms();
	}
	
	public static void sortFarms(){
		singelton.babaliste.sort(new Comparator<Dorf>(){

			@Override
			public int compare(Dorf o1, Dorf o2) {
				return (int) (o1.getDistance()* 1000 - o2.getDistance() * 1000);
			}	
		});
	}
	
	public void check(){
		if(liste.size() < 5){
			ArrayList<Babarendorf> babalistClone = (ArrayList<Babarendorf>) babaliste.clone();
			for(Babarendorf d : babalistClone ){
				liste.add(new AngriffDorf(d,Utils.CURRENT.getFarmHotkey()));
			}
		}
	}
	
}
