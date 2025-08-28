package oops;
class Fruit{
	String name;
	String taste;
	int size;
void eat(){	
	System.out.println("fruit");
 
}
}
class Apple extends Fruit{
	void eat() {
		System.out.println("apple tastes sweet ");
}
}
class Orange extends Fruit{
	
	void eat() {
		System.out.println("orange is pulipu");
		
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Fruit f1 = new Orange();
		f1.eat();
		Fruit f2 =new Apple();
		f2.eat();
		
		

		
	}
		

	}



