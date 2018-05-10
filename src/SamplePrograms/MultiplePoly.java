package SamplePrograms;

class Shape{
	void display(){
		System.out.println("in display");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("in draw");
	}
}
public class MultiplePoly {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.display();
		s.draw();

	}

}
