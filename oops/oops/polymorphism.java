package oops;
class Shape{
	void draw(){
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
	class Circle extends Shape{
		void draw() {
			System.out.println("Drawing circle");
		}
		void erase() {
			System.out.println("Erasing circle");
		}
	}
	
	class Triangle extends Shape{
		void draw() {
			System.out.println("Drawing triangle");
		}
		void erase() {
			System.out.println("Erasing triangle");
		}
		
		
	}
	class Square extends Shape{
		void draw() {
			System.out.println("Drawing square");
		}
		void erase() {
			System.out.println("Erasing square");
			
		}
		
	}

public class polymorphism {

	public static void main(String[] args) {
		Shape s1= new Circle();
		s1.draw();
		Shape s2 = new Triangle();
		s2.draw();
		s2.erase();
		Shape s3 =new Square();
		s3.draw();
		s3.erase();
		
		
		

	}

}
