package com.bigcorp.project.main.lambda;

/**
 * Classe usine contenant des machines 
 * qui traitent toutes de manière unique
 * les matériaux qu'on leur donne.
 */
public class Usine {
	
	public static void main(String[] args) {
		
		//Création de la machine
		Machine machine1 = new Machine();
		machine1.setId(1);
		machine1.setNom("Decoupeuse");
		machine1.setReference("decoup-001");
		
		//Remplissage de la machine
		machine1.setMatiere(new Matiere("Verre", 2, 100));
		
		//La machine fait son traitement
		System.out.println("Utilisation d'une lambda pour le traitement");
		final int a = 5;
		machine1.travaille((m) -> {	System.out.println(m);});
		
		
		//utilisation de méthode de référence
		System.out.println("Avec System.out::println");
		machine1.travaille(System.out::println);
		
		System.out.println("Avec Matiere::afficheNom");
		machine1.travaille((m) -> m.afficheNom());
		machine1.travaille(Matiere::afficheNom);
		
		
	}

}
