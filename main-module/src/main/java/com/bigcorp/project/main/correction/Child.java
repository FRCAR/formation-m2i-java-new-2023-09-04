package com.bigcorp.project.main.correction;

public class Child {
	
	private String nom;
	
	private Integer age;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Child(String nom, Integer age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	

}
