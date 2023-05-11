package org.java.obj;

import org.java.obj.abs.Animale;
import org.java.obj.inter.Vola;

public class Aquila extends Animale implements Vola{
	
	public Aquila(String name) {
		super(name);		
	}

	@Override
	public void dormi() {
		System.out.println("zzz");
	}

	@Override
	public void verso() {
		System.out.println("Strido");
	}

	@Override
	public void mangia() {
		System.out.println("Mangio carne");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
	
	@Override
	public String toString() {
		return  getName();
	}

}
