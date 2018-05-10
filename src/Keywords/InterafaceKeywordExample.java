package Keywords;

/*Interface Keyword Example: Providing implementaion for Vehicle_4 interface using MyCar_2  class*/
interface Vehicle_3{
	public String breaks();
}
class MyCar_2 implements Vehicle_3{
	@Override
	public String breaks() {
		return "WaggonCar";
	}
}
public class InterafaceKeywordExample {

	public static void main(String[] args) {
		 MyCar_2 obj = new MyCar_2();
		 System.out.println(obj.breaks());
		 
		 
	}

}
