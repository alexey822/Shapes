package it.isosistemi.shapes;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.14.10
 */
public class Canvas {
	
	public List<Forma> forme;
	
	public Canvas(){
		forme = new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}

	public int CalcolaAreaTotale(){
		
		int areaTotale = 0;
		
		for(Forma f: forme){
			areaTotale += f.CalcolaArea();
		}
		
		return areaTotale;
	}

	public int CalcolaPerimetroTotale(){
		return 0;
	}

	public void add(Forma f) {
		forme.add(f);
		
	}
	
	public int size() {
		
		return forme.size();
	}

}