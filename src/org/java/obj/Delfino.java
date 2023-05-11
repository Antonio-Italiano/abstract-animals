package org.java.obj;

import org.java.obj.abs.Animale;
import org.java.obj.inter.Nuota;

public class Delfino extends Animale implements Nuota{
	
	public Delfino(String name) {
		super(name);
		
	}

	@Override
	public void dormi() {
		System.out.println("zzz");
	}

	@Override
	public void verso() {
		System.out.println("biosonar");
	}

	@Override
	public void mangia() {
		System.out.println("pesce e calamari");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
	
	@Override
	public String toString() {
		return  getName();
	}
}
