package Keywords;

/*While Loop Example*/
public class WhileExample {

	public static void main(String[] args) {
		int _num = 5;
		int _statusNum = 1;
		while(_statusNum<_num){
			System.out.println(_statusNum);
			++_statusNum;
		}
		System.out.println(_num + " EQUAL TO " +_statusNum);
	}

}
