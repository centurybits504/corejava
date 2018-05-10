package Keywords;

/*Enum Keyword Example : Iterating constants*/
enum Days_1
{
	MONDAY,TUSEDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;//constants
}
public class EnumsKeywordExample {

	public static void main(String[] args) {
		for(Days_1 day:Days_1.values())
		{
			System.out.println(day +" ---- "+day.ordinal());
		}

	}

}
/*-----------------------------------------------*/
