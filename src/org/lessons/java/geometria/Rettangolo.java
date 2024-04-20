package org.lessons.java.geometria;

public class Rettangolo {
	private int base, altezza;
	
	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	private int calcolaArea() {
		return base*altezza;
	}
	
	private int calcolaPerimetro() {
		return (base*2) + (altezza*2);
	}
	
	private String disegnaRettangolo () {
		String basePainted = "";
		String altezzaPainted = "";
		
		//Disegno la base
		for(int i = 0; i < base; i++) {
			basePainted += "o ";
		}
		
		//Disegno l'altezza
		for(int i = 0; i < altezza-2; i++) {
			String spaceCalcolator = "";
			// Calcolo lo spazio da inserire fra le due righe di altezza
			for(int j = 1; j < basePainted.length()-2; j++) {
				spaceCalcolator += " ";
			}
			altezzaPainted += "o" + spaceCalcolator + "o\n";
		}
		// restituisco il disegno sottoforma di stringa
		return basePainted + "\n" + altezzaPainted + basePainted;
	}
	
	void show() {
		System.out.println("Base: " + base + "\n" +
							"Altezza: " + altezza + "\n" +
							"Perimetro: " + calcolaPerimetro() + "\n" +
							"Area: " + calcolaArea() + "\n" + disegnaRettangolo());
	}
	
}
