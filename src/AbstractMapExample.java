import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/*incomplete code*/
public class AbstractMapExample extends AbstractMap implements Serializable,Cloneable{

	public static void main(String[] args) {
		Map _absrtMap = new AbstractMapExample();
		_absrtMap.put(1,"A");
		_absrtMap.put(2,"B");
	    _absrtMap.put(3,"C");
	    _absrtMap.put(4,"D");
	    _absrtMap.put(5,"E");

	    
	     

	    System.out.println("Set of  Mappings are :");

	    _absrtMap.entrySet();

	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
