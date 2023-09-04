package com.bigcorp.project.main.lambda;

import java.util.ArrayList;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);

		ints.stream().filter(i -> i < 3).map(i -> i * 2).map(i -> "s" + i).map(s -> s.concat("coucou"))
				.forEach(System.out::println);

		for (Integer i : ints) {
			if (i < 3) {
				Integer doubleValue = i * 2;
				String s = "s" + i;
				String s2 = s + "coucou";
				System.out.println(s2);
			}
		}

	}

}
