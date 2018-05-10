package Keywords;

public class BooleanKeywordExample {
	public static void main(String[] args) {
		int num1 = 2, num2 = 1;
		boolean _status = (num1 > num2)?true : false;
		if(_status)
			System.out.println(num1 +" > "+ num2 +" : "+ _status);
		else
			System.out.println(num1 +" > "+ num2 +" : "+ _status);
	}
}

/*
 * OUTPUT:
 * 2 > 1 : true 
 * */

/*-----------------------------------------------*/