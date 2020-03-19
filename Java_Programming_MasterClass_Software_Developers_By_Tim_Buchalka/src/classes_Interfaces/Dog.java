package classes_Interfaces;

public class Dog extends Animal{
	
	private int eyes;
	private int teeth;
	private int leg;
	private int tail;
	private String cost;
	
	public Dog(String name, int body, int brain, int size, int weight, int eyes, int teeth, int leg, int tail, String cost) {
		super(name, body, brain, size, weight);
		this.eyes = eyes;
		this.teeth = teeth;
		this.leg = leg;
		this.tail = tail;
		this.cost = cost;
	}
	
	@Override
	public void eat(){
		System.out.println("Dog loves to eat bone");
		super.eat();
	}
	
	public void move() {
		System.out.println("Dog moves on its four legs");
  }
}
