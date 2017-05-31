package it.isosistemi.shapes;

public class Triangolo implements Forma{
	
	int base;
	int altezza;
	
	public Triangolo(){
		
	}
	
	public Triangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public int CalcolaArea(){
		return (this.base * this.altezza);
	}
	
	@Override
	public int CalcolaPerimetro(){
		return 0;
	}

}
