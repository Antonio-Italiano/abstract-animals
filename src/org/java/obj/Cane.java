package org.java.obj;

import org.java.obj.abs.Animale;
import org.java.obj.inter.Nuota;

public class Cane extends Animale implements Nuota{
	
	public Cane(String name) {
		super(name);
	}
	
	@Override
	public void dormi() {
		System.out.println("zzz");
	}

	@Override
	public void verso() {
		System.out.println("bau");
	}

	@Override
	public void mangia() {
		System.out.println("Croccantini");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
