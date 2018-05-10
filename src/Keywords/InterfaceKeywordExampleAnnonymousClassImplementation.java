package Keywords;

/*Interface Keyword Example: Providing implementaion for Vehicle_4 interface using annonymous inner class*/
interface Vehicle_4{
	public String breaks();
}
 
public class InterfaceKeywordExampleAnnonymousClassImplementation {

	public static void main(String[] args) {
		
		Vehicle_4 obj = new Vehicle_4() {
			@Override
			public String breaks() {
				return "WaggonCar";
			}
		};
		obj.breaks();
		
		//(or)
		 new Vehicle_4(){
				@Override
				public String breaks() {
					return "WaggonCar";
				}
			 }.breaks() ;

	}

}
