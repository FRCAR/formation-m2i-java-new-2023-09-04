package com.bigcorp.project.main.asynchronous;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BoucleInfiniePourCreerUneOutOfMemoryError {

	public static void main(String[] args) throws Exception {
		
		List<Integer> liste = new ArrayList<>();
		
		int i = 0;
		
		TimeUnit.SECONDS.sleep(5);
		while (true) {
			liste.add(i++);
		}
	}
}
