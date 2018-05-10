package Programs;

class TwoMaxNumbersInArray 
{
	public void printTwoMaxNumbers(int[] nums)
	{ 
		int maxOne = 0;
        int maxTwo = 0;
        for(int num:nums){
            if(maxOne < num){
                maxTwo = maxOne;
                maxOne = num;
            } else if(maxTwo < num){
                maxTwo = num;
            }
        }
        System.out.println("FIRST MAX NUMBER: "+ maxOne);
        System.out.println("SECOND MAX NUMBER: "+ maxTwo);
	}
public static void main(String args[])
{ 
	 int numArray[] = {10,20,40,30,55};
	 TwoMaxNumbersInArray tmn = new TwoMaxNumbersInArray();
     tmn.printTwoMaxNumbers(numArray);
	}
}
