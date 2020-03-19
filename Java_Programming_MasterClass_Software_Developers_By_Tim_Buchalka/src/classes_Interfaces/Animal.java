package classes_Interfaces;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal() {
		this("Tom", 30, 7, 180, 90);
	}
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Animal.eat() called!:)");	
	}
	
	public void chew() {
		System.out.println("Animal.chew() called!");
	}
	
	public String getname() {
		return name;
	}
	
	public int getbrain() {
		return brain;
	}
	
	public int getbody() {
		return body;
	}
	
	public int getsize() {
		return size;
	}
	
	public int getWeight() {
		return weight;
	}
}
