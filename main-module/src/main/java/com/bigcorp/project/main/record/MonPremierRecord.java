package com.bigcorp.project.main.record;

import java.time.LocalDate;

/**
 * JavaDoc du record
 */
public record MonPremierRecord(Integer id, String nom, LocalDate date) {
	
	public String getNomAndDate() {
		return this.nom + this.date;
	}

}
