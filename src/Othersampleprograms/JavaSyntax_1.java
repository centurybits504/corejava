package Othersampleprograms;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaSyntax_1 {

	public static void main(String[] args) {
		 String _singleLineComment = "//";
		 String _multipleLineCommentStart = "/*";
		 try{
			 
 			 FileInputStream fstream = new FileInputStream("C:/Users/IBM_ADMIN/Desktop/my/Sample.java");
			 BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			 String strLine;
			 String _outPut = "";
 			 while ((strLine = br.readLine()) != null)   {
 				 String _tempstrLine = strLine;
 				 boolean matches = _tempstrLine.trim().startsWith( _singleLineComment) || _tempstrLine.trim().startsWith(_multipleLineCommentStart);
 	 			 if(matches){
 					  _outPut = _outPut + "<font color='#3f7f59'>"+strLine +"</font>"+"<br>";
 				 }else{
 					_outPut = _outPut +strLine +"<br>";
 				 }
 				
	}
 			 System.out.println(_outPut);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 }

}
