package com.bigcorp.project.graphics.windows;

import java.lang.reflect.Method;

public class Autre {
	
	public void utilise(StartWindow sw) {
		sw.age = "lkjklj";
		for(Method method : sw.getClass().getDeclaredMethods()) {
			System.out.println("Méthode : " + method);
		}
	}
	
	public static void main(String[] args) {
		Autre autre = new Autre();
		autre.utilise(new StartWindow());
	}

}
