package Programs;


class Emp{
	Integer sno;
	String name;
	Emp(Integer sno,String name){
		this.sno = sno;
		this.name = name;
	}
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Sample {

	public static void main(String[] args) {
		/*Emp e1 = new Emp(1,"A");
		Emp e2 = new Emp(1,"A");
		System.out.println(new Emp(1,"A"));
		System.out.println("e1" + e1);
		System.out.println("e2" + e2);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));*/
		
		String object = "Hello";
		int hash = System.identityHashCode(object);
		System.out.println(object);
	   /* while (!map.containsKey(hash)) {
	        map.put(hash, object);
	        object = generator.nextLong();
	        hash = System.identityHashCode(object);
	    }*/
		
		

	}

}
