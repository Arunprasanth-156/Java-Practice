package oops;
class Animal{
	void eat() {
		System.out.println("Animal Eating");
		
	}
	void sleep() {
		System.out.println("Animal sleeping");
	}
}
class Bird extends Animal{
	void fly(){
		System.out.println("Bird Flying");
		
	}
	void eat() {
		System.out.println("bird is  eating");
	}
	void sleep() {
		System.out.println("bird is sleeping");
	}
}

public class Inheritance01 {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		a1.sleep();
		Bird b1=new Bird();
		b1.fly();
		b1.eat();
		b1.sleep();
		
		
		
		

	}

}
