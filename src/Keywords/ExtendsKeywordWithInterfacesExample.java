package Keywords;

/*Extends Keyword Example:  Interface Car_1 extends Vehicle_1*/

interface Vehile_1{
	int speed = 100;
	public int speed();
}
interface Car_1 extends Vehile_1{
	public int speed();
	public String breaks();
}
class MyCar implements Car_1{

	@Override
	public int speed() {
		return speed;
	}

	@Override
	public String breaks() {
		return "WaggonCar";
	}
	
}
public class ExtendsKeywordWithInterfacesExample {

	public static void main(String[] args) {
		 MyCar car = new MyCar();
		 System.out.println(car.breaks());
		 System.out.println(car.speed());

	}

}
/*-----------------------------------------------*/
