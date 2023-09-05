package com.bigcorp.project.main.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);

		ints.stream().filter(i -> i < 3).map(i -> i * 2).map(i -> "s" + i).map(s -> s.concat("coucou"))
				.forEach(System.out::println);
		// Le code ci-dessous équivaut au code ci-dessus
		for (Integer i : ints) {
			if (i < 3) {
				Integer doubleValue = i * 2;
				String s = "s" + doubleValue;
				String s2 = s + "coucou";
				System.out.println(s2);
			}
		}

		// Utiliser takeWhile et iterate de Stream pour afficher tous les multiples de 3
		// de 1 à 40;
		// Avec takeWhile et un stream 'infini'
		System.out.println("Les multiples de 3 de 1 à 40 avec takewhile");
		Stream.iterate(3, i -> i + 3).takeWhile(i -> i <= 40).forEach(System.out::println);

		System.out.println("Les multiples de 3 de 1 à 40 sans takewhile");
		System.out.println("Les multiples de 3 de 1 à 40 sans takewhile");
		// Avec un stream fini
		Stream.iterate(3, i -> i <= 40, i -> i + 3).forEach(System.out::println);

		Stream.iterate(3, i -> i + 3).dropWhile(i -> i <= 40).takeWhile(i -> i <= 80).forEach(System.out::println);

		
		//Calcul d'une factorielle avec Reduce (pas sûr des performances)
		Stream.iterate(1, i -> i < 2, i -> i + 1)
				.mapToInt(i -> i)
				.reduce((a, b) -> a * b)
				.ifPresent(System.out::println);

	}

}
