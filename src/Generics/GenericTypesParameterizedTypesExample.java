package Generics;

/*Generic Types Example : Parameterized Type */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Shape {
	Integer area;
	String shapeType;

	public Shape() {
	}

	Shape(String shapeType, Integer area) {
		this.area = area;
		this.shapeType = shapeType;
	}

}

public class GenericTypesParameterizedTypesExample {

	public static void main(String[] args) {

		Shape address = new Shape("Rectangle", 100);

		List<Shape> addressList = new ArrayList<Shape>();
		addressList.add(address);

		/* Here List<Shape> is Parameterized Type */
		Map<String, List<Shape>> map = new HashMap<>();
		map.put("A", addressList);
	}

}
