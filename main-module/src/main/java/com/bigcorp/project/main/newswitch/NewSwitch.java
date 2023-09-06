package com.bigcorp.project.main.newswitch;

/**
 * Démonstration des différentes syntaxes de switch
 */
public class NewSwitch {

	private enum Etat {
		ARRETE, DEMARRE, EN_PAUSE, AVANCE_RAPIDE
	}

	public static void main(String[] args) {

		// Ancien switch
		Etat etat = Etat.ARRETE;
		switch (etat) {
		case ARRETE:
			double vitesse = 0;
			break;
		case DEMARRE:
		case EN_PAUSE:
			vitesse = 0;
			break;
		case AVANCE_RAPIDE:
			vitesse = 2;
			System.out.println("La vitesse vaut : " + vitesse);
			break;
		default:
			System.out.println("Je ne sais pas ce que vaut la vitesse");
		}

		// Nouveau switch
		long valeurSwitch = switch (etat) {
		case ARRETE -> {
			System.out.println("Arret");
			yield 0;
		}
		case DEMARRE -> { yield 1;}
		case AVANCE_RAPIDE -> {
			System.out.println("Avance rapide");
			yield 2;
		}
		case EN_PAUSE -> 0;
		};

		// Switch renvoyant une valeur : une instruction, d'où le ; à la fin.
		int j = switch (etat) {
		case ARRETE -> 0;
		case DEMARRE -> 1;
		default -> {
			int k = etat.toString().length();
			yield k;
		}
		};
		System.out.println(j);

	}

}
