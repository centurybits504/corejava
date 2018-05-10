package Keywords;

/*InstanceOf operator Example: Inheritance*/
class Cycle{
	}
class Bike extends Cycle{
}
public class InstanceOfKeywordExampleInheritance {
	public static void main(String[] args) {
		 Bike _bobj = new Bike();
		 if(_bobj instanceof Object){
			 System.out.println("_bobj instanceof Object");
		 }
		 if(_bobj instanceof Cycle){
			 System.out.println("_bobj instanceof Cycle");
		 }
		 
		 Cycle _aobj = new Cycle();
		 if(_aobj instanceof Cycle){
			 System.out.println("_aobj instanceof Cycle");
		 }
		 
		 if(_aobj instanceof Bike){
			 System.out.println("_aobj instanceof Bike");
		 }else{
			 System.out.println("_aobj not instanceof Bike");
		 }
		 
		 Cycle _aobjj = (Cycle)_bobj;//upcasting
		 if(_aobjj instanceof Bike){
			 System.out.println("_aobjj instanceof Bike");
		 }
		 /* Here we get: ClassCastException
		  * Because "_aobj's" runtime type is "Cycle", and so when you tell the runtime to perform the cast it sees that "_aobj" isn't really a "Bike" and so throws a ClassCastException
		  *  */
		 Bike _bobjj = (Bike)_aobj;
		 if(_bobjj instanceof Bike){
			 System.out.println("_bobjj instanceof Bike");
		 }
	}
}
