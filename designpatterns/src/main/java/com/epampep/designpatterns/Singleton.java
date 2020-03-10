package com.epampep.designpatterns;

public class Singleton {
	private int id;
	private String data;
	private static final Singleton ob = new Singleton(1,"Link");
	private Singleton(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static Singleton getInstance() {
		return ob;
	}
}
