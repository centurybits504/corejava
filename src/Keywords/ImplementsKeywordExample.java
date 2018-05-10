package Keywords;

interface Car_2{
	public int speed =10;
	public int speed();
}
class MyCar_1 implements Car_2{

	@Override
	public int speed() {
		return speed;
	}
	public String breaks() {
		return "WaggonCar";
	}
	
}
public class ImplementsKeywordExample {
	
	public static void main(String[] args) {
		MyCar_1 car = new MyCar_1();
		 System.out.println(car.breaks());
		 System.out.println(car.speed());
		 
	}
	
}
