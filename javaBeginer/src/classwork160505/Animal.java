package classwork160505;

public class Animal {
	//class members
	//state состояние
	private String name; //поле, field
	private String kind;
	private boolean isHungry = true;
	
	public Animal(String kind, String name) {
		// TODO Auto-generated constructor stub
		this.kind = kind;
		this.name = name;
	}
	public Animal(boolean h, String n, String k) {
		// TODO Auto-generated constructor stub
		kind = k;
		name = n;
		isHungry = h;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
		kind = "микроб";
		name = "";
		isHungry = true;
	}
	// behavior - поведение
	public void feed(String food) {//метод экземпляра instance methos
		if (isHungry) {
			System.out.println(kind + " '" + name + "' ест " + food);			
			isHungry = false;
		}else {
			System.out.println(kind + " '" + name + "' играет с " + food);						
		}
	}
	public void play() {//по статик ==> instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку");
		}else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодался");
			isHungry = true;
		}
		
		
	}
}
