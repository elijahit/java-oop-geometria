package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ciao, benvenuto in questo calcolatore di geometria per rettangoli.");
		System.out.println("Questo calcolatore è stato sviluppato da Gabriele Mario Tosto per Boolean.Careers.");
		System.out.println();
		System.out.println();
		System.out.println("Iniziamo con qualche dato: Qual'è la base del tuo rettangolo? (Inerisci un numero intero)");
		int base = sc.nextInt();
		System.out.println("Qual'è l'altezza del tuo rettangolo? (Inserisci un numero intero)");
		int altezza = sc.nextInt();
		sc.close();
		
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		rettangolo.show();

	}

}
