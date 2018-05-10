package Exceptionhandling;

public class Checked_InstantiationException_Example {

	public static void main(String[] args) {
		Checked_InstantiationException_Example std1 = new Checked_InstantiationException_Example();
		Class cls1 = std1.getClass();
		Object obj1;
		try {
			obj1 = cls1.newInstance();
			Checked_InstantiationException_Example std2 = (Checked_InstantiationException_Example) obj1;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
