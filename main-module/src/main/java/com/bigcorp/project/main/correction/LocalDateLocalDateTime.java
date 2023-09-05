package com.bigcorp.project.main.correction;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Classe d'affichage de date passée en paramètre.
 */
public class LocalDateLocalDateTime {

	public static void main(String[] args) {
		// Créer un programme qui instancie une LocalDate (avec .of()) et affiche si
		// cette
		// dernière est dans une année bissextile.
		LocalDate localDate1 = LocalDate.of(2025, 3, 4);
		System.out.println(localDate1 + " est une année bissextile ? : " + localDate1.isLeapYear());
		// Créer un programme en Java qui prend un paramètre au lancement. Ce paramètre
		// représente une date au format ISO-8601 (AAAA-MM-JJ) . S’il parvient à
		// transformer
		// ce paramètre en LocalDate, il affiche si oui ou non, la date est une année
		// bissextile.
		try {
			if (args.length < 1) {
				System.out.println("Aucune date passée en paramètre");
				return;
			}

			LocalDate dateArgument = LocalDate.parse(args[0]);
			System.out.println("La date passée en argument est une annés bissextile ? : " + dateArgument.isLeapYear());
			// Faire en sorte qu’il affiche le mois de l’année et le jour de la semaine.
			System.out.println("Le mois de la date passée en argument est : " + dateArgument.getMonth());
			System.out.println(
					"Le jour de la semaine de la date passée en argument est : " + dateArgument.getDayOfWeek());
			// Bonus : afficher de manière lisible pour un humain la date avec le jour de la
			// semaine.
			System.out.println("La date passée en argument est : "
					+ dateArgument.format(DateTimeFormatter.ofPattern("EEEE d MMMM yyyy")));
			
			String dernierJourDeLAnneeFormattee = dateArgument.with(TemporalAdjusters.lastDayOfYear()).format(DateTimeFormatter.ofPattern("EEEE d MMMM yyyy"));
			System.out.println("Le dernier jour de l'année de la date passée en argument est  : " + dernierJourDeLAnneeFormattee);
			
			
			System.out.println("Le mardi précédent aujourd'hui est : " + LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));
			
		} catch (DateTimeException dte) {
			// Si il ne parvient pas à transformer la LocalDate, il affiche une erreur.
			dte.printStackTrace();
		}

	}

}
