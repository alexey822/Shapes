package it.isosistemi.shapes;


/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.15.10
 */
public class Cerchio implements Forma{

	private int raggio;

	public Cerchio(){

	}

	public Cerchio(int radius) {
		this.raggio = radius;
	}

	public void finalize() throws Throwable {

	}

	public int CalcolaArea(){
		return 3 * raggio * raggio;
	}

	public int CalcolaPerimetro(){
		return 1 * raggio;
	}

}