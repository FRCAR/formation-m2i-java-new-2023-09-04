package com.bigcorp.project.main.correction;

public class Strings{

	public static void main(String[] args) {
		//Création de la chaîne de caractères
		char emSpace = '\u2003';
		String baseString = emSpace + " Salut, les gens,\n\n ça va ? \n";

		//Répétition 3 fois
		String string3 = baseString.repeat(3);
		
		//Extraction des lignes avec suppression des caractères blancs
		string3.lines().map(String::strip).forEach(System.out::println);
		//équivaut à : 
		string3.lines().forEach(s -> System.out.println(s.strip()));
		
	}
	
}
