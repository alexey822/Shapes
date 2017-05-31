package it.isosistemi.shapes;


/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.14.49
 */
public class Retangolo implements Forma{

	private int altezza;
	private int larghezza;

	public Retangolo(){

	}

	public Retangolo(int height, int width) {
		this.altezza = height;
		this.larghezza = width;
	}

	public void finalize() throws Throwable {

	}

	public int CalcolaArea(){
		return this.altezza * this.larghezza;
	}

	public int CalcolaPerimetro(){
		return this.altezza * 2 + this.larghezza * 2;
	}

}