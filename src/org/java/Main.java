package org.java;

import org.java.obj.AnimaleManager;
import org.java.obj.Cane;
import org.java.obj.Passerotto;
import org.java.obj.Aquila;
import org.java.obj.Delfino;
import org.java.obj.abs.Animale;


public class Main {

	public static void main(String[] args) {
		
		Cane c1 = new Cane("doggo"); 		
		Passerotto p1 = new Passerotto("passerello"); 
		Aquila a1 = new Aquila("doggo Alante");		
		Delfino d1 = new Delfino("doggo Marino"); 
		
		Animale[] animali = {c1, p1, a1, d1};
		
		for(int x=0;x<animali.length;x++) {
			
			Animale a = animali[x];
			a.getName();
			a.dormi();
			a.verso();
			a.mangia();
			System.out.println("\n");
		}		
		
		AnimaleManager.faiNuotare(c1);
		AnimaleManager.faiVolare(p1);
		AnimaleManager.faiVolare(a1);
		AnimaleManager.faiNuotare(d1);
	}
	
}
