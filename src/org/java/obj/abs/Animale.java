package org.java.obj.abs;

public abstract class Animale {
	
	private String name;
	
	public Animale(String name) {
		setName(name);
	}

	public abstract void dormi();
	public abstract void verso();
	public abstract void mangia();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "(A)" + name;
	}
}
