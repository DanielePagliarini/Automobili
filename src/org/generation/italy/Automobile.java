package org.generation.italy;

public class Automobile {

	int velocit�;
	float carburante, consumoMedio, totKmPercorsi;
	
	public void accelera() {
		
		if (velocit�<=190)
			velocit�+=10; // mi incrementa di 10
		else 
			System.out.println("velocit� massima raggiunta");
		}	
	
	public void decellera() {
		
		if (velocit�>=10)
			velocit�-=10; // mi decrementa di 10
		else 
			System.out.println("velocit� minima raggiunta");	
	}	
	public void mostraDati() {
		System.out.println(" Velocit� attutale:" + velocit� + "km/h");
		System.out.println(" Carburante:" + carburante + "l");
		System.out.println(" Consumo medio:" + consumoMedio + "km/l");
		System.out.println(" Kilometri percorsi:" +totKmPercorsi + "km/");
	}
	public void aggiorna() {
		int kmPercorsi1h=velocit�;
		totKmPercorsi+=kmPercorsi1h;
		carburante-=kmPercorsi1h/consumoMedio;
		
	}
		
	}
	
	

