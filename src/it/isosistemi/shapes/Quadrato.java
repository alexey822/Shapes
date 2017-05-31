package it.isosistemi.shapes;


/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.15.01
 */
public class Quadrato implements Forma{

	private int lato;

	public Quadrato(){

	}

	public Quadrato(int lato2) {
		lato = lato2;
	}

	public void finalize() throws Throwable {

	}

	public int CalcolaArea(){
		return lato * lato;
	}

	public int CalcolaPerimetro(){
		return lato * 4;
	}

}