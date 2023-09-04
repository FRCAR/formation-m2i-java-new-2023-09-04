package com.bigcorp.project.main.concurrent;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Utilise un ExecutorService pour lancer en parallèle 5 tâches sur
 * 3 threads.
 */
public class CreateNewExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Démarrage Thread principal");
		
		
		//La préparation de mon pool de threads
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		//La préparation des mes callables
		List<StringTaskCallable> callables = new ArrayList<>();
		for(int i=0; i<15; i++) {
			callables.add(new StringTaskCallable());
		}
		
		//Mon pool de threads agit et traite mes Runnables
		List<Future<String>> futures = executorService.invokeAll(callables);
		
		//Synchronisation des différents Threads : main récupère les résultats
		for (Future<String> future : futures) {
			System.out.println(future.get());
		}
		
		executorService.shutdown();

		System.out.println("Fin Thread principal");
	}

	private static final class LongTaskRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Démarrage LongTaskRunnable");
			try {
				Thread.sleep(2000);
				// TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				return;
			}

			System.out.println("Fin LongTaskRunnable");
		}
	}
	
	private static final class StringTaskCallable implements Callable<String> {
		@Override
		public String call() {
			System.out.println("Démarrage SringTaskCallable");
			try {
				Thread.sleep(2000);
				// TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				return null;
			}
			
			System.out.println("Fin StringTaskCallable");
			return LocalDateTime.now().toString();
		}
	}

}
