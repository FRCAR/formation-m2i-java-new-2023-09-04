package com.bigcorp.project.main.lambda;

import java.util.function.Consumer;

public class Window {
	
	
	public static void main(String[] args) {
		Window window = new Window();
		

		Button lambdaButton2 = (Integer tempsDuClick) -> {return "lambda button appuyé pendant " + tempsDuClick ;};
		//équivaut à : 
		Button lambdaButton = tempsDuClick -> "lambda button appuyé pendant " + tempsDuClick ;
		
		Consumer<Object> basicConsumer = (Object a) -> {System.out.println(a);};
		//équivaut à : 
		Consumer<Object> basicConsumer2 = a -> System.out.println(a);
		
		int b = 4;
		
		Consumer<Object> basicConsumer3 = a -> {
			int c = b + 4;	
			System.out.println(c);};
		

		
		window.addButton(lambdaButton);
		
		//plein de lignes de codes plus tard
		
		window.execute();
		
		
	}
	
	private Button button;
	
	public void addButton(Button button) {
		this.button = button;
	}
	
	public void execute() {
		System.out.println("La fenête est activée");
		System.out.println(this.button.click(45));
		System.out.println("La fenête se désactive");
		
	}

}
