package com.JANA60.lista.controller.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Creare una classe Main con metodo main in cui implementare il seguente programma:
			Creare una lista dei desideri vuota e chiedere all’utente di aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
			Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri sono contenuti nella lista in quel momento.
			Al termine dell’inserimento stampare a video la lista ordinata.
			…poi, visto che siamo buoni ma non buonissimi, possiamo anche mettere un limite a quanti desideri può inserire una persona :sorriso:

		 */
		
		List<String> wishList = new ArrayList<String>();
		Scanner keyboard = new Scanner (System.in);
		String cmd;
		boolean end=false;
		
		System.out.println("Benvenuto nella Lista dei desideri");
		
		do
		{
			
			System.out.println("Vuoi inserire un desiderio?");
			cmd= keyboard.nextLine();
			
			switch(cmd.toLowerCase())
			{
				case "si":
				{
					System.out.println("Inserire il proprio desiderio: ");
					wishList.add(keyboard.nextLine());
					
					System.out.println("Lista dei desideri: " +wishList);
				}
				break;
				case "no":
				{
					end=true;
				}
				break;
				default:
					System.out.println("Comando errato, riprovare.");
					
			}
			
			if(wishList.size()<10 && cmd.equalsIgnoreCase("si"))
				end=false;
			else
				end=true;
			System.out.println("Hai raggiunto il limite. La lista non può essere più grande di 10 elementi.");
			
		}while(!end);
		
		Collections.sort(wishList);
		System.out.println("La tua lista dei desideri contiene i seguenti elementi: " +wishList);
		
		System.out.println("Grazie e arrivederci");
		
		
		
		keyboard.close();
		
	}

}
