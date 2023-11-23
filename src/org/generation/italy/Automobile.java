package org.generation.italy;

public class Automobile {

	int velocità;
	float carburante, consumoMedio, totKmPercorsi;
	
	public void accelera() {
		
		if (velocità<=190)
			velocità+=10; // mi incrementa di 10
		else 
			System.out.println("velocità massima raggiunta");
		}	
	
	public void decellera() {
		
		if (velocità>=10)
			velocità-=10; // mi decrementa di 10
		else 
			System.out.println("velocità minima raggiunta");	
	}	
	public void mostraDati() {
		System.out.println(" Velocità attutale:" + velocità + "km/h");
		System.out.println(" Carburante:" + carburante + "l");
		System.out.println(" Consumo medio:" + consumoMedio + "km/l");
		System.out.println(" Kilometri percorsi:" +totKmPercorsi + "km/");
	}
	public void aggiorna() {
		int kmPercorsi1h=velocità;
		totKmPercorsi+=kmPercorsi1h;
		carburante-=kmPercorsi1h/consumoMedio;
		
	}
		
	}
	
	

