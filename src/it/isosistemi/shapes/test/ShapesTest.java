package it.isosistemi.shapes.test;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;

import it.isosistemi.shapes.Canvas;
import it.isosistemi.shapes.Cerchio;
import it.isosistemi.shapes.Quadrato;
import it.isosistemi.shapes.Retangolo;
import it.isosistemi.shapes.Triangolo;


public class ShapesTest {

	private Canvas ca;
	private Retangolo r;
	private Cerchio c;
	private Quadrato q;
	
	@Before
	public void setup(){
		
		int height = 4;
		int width = 5;
		int radius = 6;
		int lato = 7;
		
		ca = new Canvas();
		r = new Retangolo(height, width);
		c = new Cerchio(radius);
		q = new Quadrato(lato);
		
	}
	
	@Test
	public void shouldAddToCanvas() {
		
		// creo un canvas e una forma
		
		
		// aggiungo la forma al canvas
		ca.add(r);
		
		// verifico che il canvas comtiene 1 forma
		assertEquals("Il canvas ha una forma", 1, ca.size());
	}
	
	@Test
	public void shouldAddAllShapesToCanvas(){
		
		ca.add(r);
		ca.add(c);
		ca.add(q);
		
		assertEquals("Ci sono tre forme", 3, ca.size());
	}
	
	@Test
	public void shouldCalculateAreaOnShape(){
		
		int area = r.CalcolaArea();		
		assertTrue("L'area non è nulla", area > 0);
				
		int areaCerchio = c.CalcolaArea();
		assertTrue("L'area del cerchio non è nulla", areaCerchio > 0);
				
		int areaQuadrato = q.CalcolaArea();
		assertTrue("L'area del quadrato non è nulla", areaQuadrato > 0);			
	}
	
	@Test
	public void shouldCalculateCanvasArea(){
		/*int area = r.CalcolaArea();
		int areaCerchio = c.CalcolaArea();
		int areaQuadro = q.CalcolaArea();*/
		
		ca.add(c);
		ca.add(q);
		ca.add(r);
		
		int areaTotale = ca.CalcolaAreaTotale();
		
		assertTrue("L'area totale è positiva", areaTotale > 0);
		assertEquals("L'area totale è pari a 68", 177, areaTotale);
	}
	
	@Test
	public void shouldCalculateTriangles(){
		
		ca.add(c);
		ca.add(q);
		ca.add(r);
		
		Triangolo t = new Triangolo(2, 2);
		
		ca.add(t);
		int areaTotale = ca.CalcolaAreaTotale();
		assertEquals("L'area totale e pari a 70", 181, areaTotale);
		
	}

}
