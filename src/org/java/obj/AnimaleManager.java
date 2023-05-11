package org.java.obj;

import org.java.obj.inter.Nuota;
import org.java.obj.inter.Vola;

public class AnimaleManager {

	public static void faiVolare(Vola volante) {
		volante.vola();
	}
	
	public static void faiNuotare(Nuota nuotatore) {
		nuotatore.nuota();
	}
}
