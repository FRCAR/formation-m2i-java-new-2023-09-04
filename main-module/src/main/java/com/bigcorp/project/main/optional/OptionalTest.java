package com.bigcorp.project.main.optional;

import java.util.Optional;

public class OptionalTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Création des objets et optional
		Object obj = null;
		Object defaultObject = new Object();
		Optional<Object> objOptional = Optional.ofNullable(null);

		if (obj != null) {
			System.out.println(obj.toString());
		}
		// Le code ci-dessus équivaut au code ci-dessous
		if (objOptional.isPresent()) {
			System.out.println(objOptional.get().toString());
		}

		if (obj != null) {
			System.out.println(obj.toString());
		} else {
			System.out.println(defaultObject.toString());
		}
		// Le code ci-dessus équivaut au code ci-dessous
		System.out.println(objOptional.orElse(defaultObject).toString());

		if (obj != null) {
			System.out.println(obj);
		}
		// Le code ci-dessus équivaut au code ci-dessous
		objOptional.ifPresent(System.out::println);

		// utilisation d'une méthode qui renvoie des Optional
		OptionalTest optionalTest = new OptionalTest();
		Optional<String> totemRogerDupont = optionalTest.trouveAnimalTotem("roger", "dupont");
		if (totemRogerDupont.isPresent()) {
			System.out.println("L'animal totem de roger dupont est : " + totemRogerDupont.get());
		}
		
		System.out.println("L'animal totem de roger poupou est : " + optionalTest.trouveAnimalTotem("roger", "poupou").orElse("inconnu"));
		
		optionalTest.trouveAnimalTotem("regis", "poupou").ifPresent(s -> System.out.println("L'animal totem de roger dupont est : " + s));

		String prenom = "regis";
		System.out.println("L'animal totem de regis poulet est : " + optionalTest.trouveAnimalTotem(prenom, "poulet").orElseGet(() -> "L'animal de " + prenom));
		
		
	}

	/**
	 * Trouve l'animal totem à partir du nom et du prénom.
	 * 
	 * @param prenom
	 * @param nom
	 * @return
	 */
	public Optional<String> trouveAnimalTotem(String prenom, String nom) {
		if (prenom.equals("roger") && nom.equals("dupont")) {
			return Optional.of("loutre");
		}
		if (prenom.equals("regis") && nom.equals("poupou")) {
			return Optional.of("teckel");
		}
		return Optional.empty();
	}

}
