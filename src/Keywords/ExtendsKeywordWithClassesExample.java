package Keywords;

/*Extends Keyword Example:  Class Cycle_1 extends Bike_1*/
class Cycle_1{//super class
	String brand = "Herolier";
	public int speed(){
		return 20;
	}
	public String breaks(){
		return "stop";
	}
}
class Bike_1 extends Cycle_1{//sub class
	@Override
	public int speed(){
		return 40;
	}
}
public class ExtendsKeywordWithClassesExample {
	public static void main(String[] args) {
		Bike_1 bike = new Bike_1();
		System.out.println("Brand Name Is: "+bike.brand);/* inherited from Cycle_1 class*/
		System.out.println("Bike Speed : "+bike.speed());/* overriding super-class method(speed()) in sub-class(Cycle_1 class)*/
		System.out.println("Appling Breaks : "+ bike.breaks());/* inherited from Cycle_1 class*/
	}
}
/*-----------------------------------------------*/
