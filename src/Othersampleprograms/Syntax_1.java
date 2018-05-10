package Othersampleprograms;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;


public class Syntax_1 {

	public static void main(String[] args) {
		String keyString = "abstract assert boolean break byte case catch "
				+ "char class const continue default do double else enum"
				+ " extends false final finally float for goto if implements "
				+ "import instanceof int interface long native new null " 
				+ "package private protected public return short static "
				+ "strictfp super switch synchronized this throw throws true " 
				+ "transient try void volatile while";
		String[] keys = keyString.split(" ");
		String keyStr = StringUtils.join(keys, "|");
 
		String regex = "\\b("+keyStr+")\\b";
		 try{
			 // Open the file
			 FileInputStream fstream = new FileInputStream("C:/Users/IBM_ADMIN/Desktop/my/Sample.java");
			 BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			 String strLine;
			 String outPut="";
			 //Read File Line By Line
			 while ((strLine = br.readLine()) != null)   {
					String target = strLine;
					Pattern p = Pattern.compile(regex);
					Matcher m = p.matcher(target);
			 
					while(m.find()){
						System.out.println("|"+m.group()+"|");
						System.out.println(m.start());
						System.out.println(m.end());
						
					}
				
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	
	}

	 

}
