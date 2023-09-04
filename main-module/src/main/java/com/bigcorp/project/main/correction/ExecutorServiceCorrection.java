package com.bigcorp.project.main.correction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Correction de l'exercice ExecutorService
 */
public class ExecutorServiceCorrection {

	public static void main(String[] args) throws Exception {

		System.out.println("Démarrage Thread principal");

		// La préparation de mon pool de threads
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		//Mieux ???
		//ExecutorService executorService = Executors.newCachedThreadPool();

		// La préparation des mes callables
		List<RandomTaskCallable> callables = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			callables.add(new RandomTaskCallable());
		}

		// Mon pool de threads agit et traite mes Runnables
		Integer result = executorService.invokeAny(callables);

		System.out.println(result);

		executorService.shutdown();

		System.out.println("Fin Thread principal");
	}

	private static final class RandomTaskCallable implements Callable<Integer> {
		@Override
		public Integer call() {
			System.out.println("Démarrage RandomTaskCallable");
			Random random = new Random();
			try {
				Thread.sleep(random.nextLong(5_000, 10_000));
			} catch (InterruptedException e) {
				return null;
			}
			System.out.println("Fin RandomTaskCallable");
			return random.nextInt();
		}
	}

}
