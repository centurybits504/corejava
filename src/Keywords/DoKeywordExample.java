package Keywords;

public class DoKeywordExample {

	public static void main(String[] args) {
		int _num = 5;
		int _statusNum = 1;
		
		do{
			System.out.println(_statusNum);
			++_statusNum;
		}while(_statusNum<_num);
		System.out.println(_num + " EQUAL TO " +_statusNum);
	}

}
/*-----------------------------------------------*/
