package Othersampleprograms;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Syntax_2{

	public static void main(String[] args) {
		try{
			 FileInputStream fstream = new FileInputStream("C:/Users/IBM_ADMIN/Desktop/my/Sample.java");
			 BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			 String strLine ="";
			 String _outPut="";
			 while ((strLine = br.readLine()) != null)   {
				 System.out.println("--");
				 String s = strLine.trim();
				 String[] _keyWordsContainsArray = {"for","if","else","while","true","false","catch","finally","int","throws","try","throw","throws","switch"}; 
			     Pattern p = Pattern.compile("[^A-Za-z0-9|$A-Za-z0-9]");
			     Matcher m = p.matcher( "\\b("+s+")\\b");
		 	     boolean b = m.find();
			     if (b == true)
			     { 
			    	
			    	 String temp = s;
					for(int k=0;k<_keyWordsContainsArray.length;k++){
						 boolean _status = false;
						 if(temp.contains(_keyWordsContainsArray[k])){
							 Pattern pp = Pattern.compile("[^A-Za-z0-9|$A-Za-z0-9]");
							 Matcher mm = pp.matcher( _keyWordsContainsArray[k]);
					 	     boolean bb = mm.find();
					 	    
					 	     if(bb==true)
 							 {temp = temp.replace(_keyWordsContainsArray[k], "<font color='#7f0055'><b>"+_keyWordsContainsArray[k] +"</b></font>");}
					 	     else{
	 							// temp = temp.replace(_keyWordsContainsArray[k], _keyWordsContainsArray[k] );
					 	     }
						 }
						  
					 }
					 _outPut = _outPut+ temp+"<br>";
			     }else{
					 _outPut = _outPut +" " +s+"<br>";
			     }
			 }
			 br.close();
			 System.out.println(_outPut);
 				}catch(Exception e){
					e.printStackTrace();
				} 
		 	      
	 }

	 //ggggggggggggg
	/*fbbbnb*/

}
