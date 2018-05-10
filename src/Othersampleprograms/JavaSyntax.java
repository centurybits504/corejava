package Othersampleprograms;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class JavaSyntax {

	public static void main(String[] args) {
		 String[] _javaKeyWords  = {"abstract",
				 "assert","boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","final","finally",
				 "float","for","goto","if","implements","import","instanceof","int","interface","long","native","new","package","private","protected","public","return","short","static",
				 "strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while"};
		 String _singleLineComment = "//";
		 String _multipleLineCommentStart = "/*";
		 String _multipleLineCommentEnd = "*/";
		 String[] _keyWordsContainsArray = {"for","if","else","while","true","false","catch","finally","switch","(int","throws"}; 
		 String _outPut = "";

		 try{
			 FileInputStream fstream = new FileInputStream("C:/Users/IBM_ADMIN/Desktop/my/Sample.java");
			 BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			 String strLine;
			 while ((strLine = br.readLine()) != null)   {
				 String strLineTemp = strLine;
				 if(strLine.trim().isEmpty()){/*if line is empty don't append*/}else{
	 			 boolean matches = strLine.trim().startsWith( _singleLineComment) || strLine.trim().startsWith(_multipleLineCommentStart);
	 			 if(matches){
					  _outPut = _outPut + "<font color='#3f7f59'>" +strLineTemp +"</font>";
					 
				 }else{
					 
					 }
				 }
			 
			 }//while
			 System.out.println(_outPut);
			 
		 }catch(Exception e){
			 System.out.println(e.getMessage());
		 }
	}

}
