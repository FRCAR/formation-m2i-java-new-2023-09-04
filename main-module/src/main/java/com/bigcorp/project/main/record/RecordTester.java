package com.bigcorp.project.main.record;

import java.time.LocalDate;

public class RecordTester {

	public static void main(String[] args) {
		MonPremierRecord monPremierRecord = new MonPremierRecord(3, "lkjklj", LocalDate.now());
		MonPremierRecord monDeuxiemeRecord = new MonPremierRecord(3, "lkjklj", LocalDate.now());
		System.out.println(monPremierRecord.id());
	
		System.out.println(monPremierRecord);
		
		
		System.out.println("Les deux records sont égaux avec == ? " + (monPremierRecord == monDeuxiemeRecord));
		System.out.println("Les deux records sont égaux avec equals ? " + (monPremierRecord.equals(monDeuxiemeRecord)));
		
		System.out.println("Hashcode 1 : " +  monPremierRecord.hashCode());
		System.out.println("Hashcode 2 : " +  monDeuxiemeRecord.hashCode());
		
	}

}
