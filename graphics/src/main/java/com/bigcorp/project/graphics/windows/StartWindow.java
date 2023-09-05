package com.bigcorp.project.graphics.windows;

import java.util.ServiceLoader;

import com.bigcorp.project.data.contract.AddressService;
import com.bigcorp.project.data.model.User;
import com.bigcorp.project.data.repository.UserRepositoryImpl;

/**
 * Simule une fenêtre de démarrage. Nécessite
 * UserRepository.
 */
public class StartWindow {
	
	public String age;

	private UserRepositoryImpl userRepository = new UserRepositoryImpl();

	public User displayHelloMessage() {
		User currentlyLoggedUser = userRepository.getCurrentlyLoggedUser();
		System.out.println("Hello, " + currentlyLoggedUser.getFirstName());
		return currentlyLoggedUser;
	}

	public static void main(String[] args) {
		StartWindow startWindow = new StartWindow();
		startWindow.displayHelloMessage();
		
		AddressService addressService = ServiceLoader
				.load(AddressService.class)
				.findFirst()
				.orElseThrow();
		
		System.out.println(addressService.getPostCode("ljklj"));
	}

}
