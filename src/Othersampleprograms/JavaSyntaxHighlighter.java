package Othersampleprograms;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaSyntaxHighlighter {

	public static void main(String[] args) {
		 String[] _javaKeyWords  = {"abstract",
				 "assert","boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","final","finally",
				 "float","for","goto","if","implements","import","instanceof","int","interface","long","native","new","package","private","protected","public","return","short","static",
				 "strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while"};
		 String _singleLineComment = "//";
		 String _multipleLineCommentStart = "/*";
		 String _multipleLineCommentEnd = "*/";
		 String[] _keyWordsContainsArray = {"for","if","else","while","true","false","catch","finally","(int","throws","try","throw","throws"}; 
		 String _outPut = "";

		 
		 try{
		 // Open the file
		 FileInputStream fstream = new FileInputStream("C:/Users/IBM_ADMIN/Desktop/my/Sample.java");
		 BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		 String strLine;
		 //Read File Line By Line
		 while ((strLine = br.readLine()) != null)   {
			 
			 if(strLine.trim().isEmpty()){/*if line is empty don't append*/}else{
 			 boolean matches = strLine.trim().startsWith( _singleLineComment) || strLine.trim().startsWith(_multipleLineCommentStart);
 			 if(matches){
				  _outPut = _outPut + "<font color='#3f7f59'>"+strLine +"</font>";
				 
			 }else{
				 String[] _strLineArry = strLine.split(" ");
				 for(int i=0;i<_strLineArry.length;i++){
					 boolean _keyWordMatchStatus = false;
					 for(int j=0;j<_javaKeyWords.length;j++){
						 if(_strLineArry[i].equals(_javaKeyWords[j])){
							 _keyWordMatchStatus = true;
							  _outPut = _outPut + " <font color='#7f0055'><b>"+_strLineArry[i] +"</b></font> ";
							  break;
						 }
					 }if(_keyWordMatchStatus)
					 {	//_outPut = _outPut + " "+_strLineArry[i] ;
						 
					 }
					 else {
						 boolean _status = false;
						 for(int k=0;k<_keyWordsContainsArray.length;k++){
							 if(_strLineArry[i].contains(_keyWordsContainsArray[k])){
								 _status = true;
								 _outPut = _outPut +" " +_strLineArry[i].replace(_keyWordsContainsArray[k], " <font color='#7f0055'><b>"+_keyWordsContainsArray[k] +"</b></font>");
								 break;
							 }
						 }
						 if(_status){
							 
						 }else{
							
							 _outPut = _outPut +" " +_strLineArry[i];
						 }
						 
						 }
					 
				 }
				
			 }
			 			 
			 _outPut = _outPut + "<br>";
		 	}//if
		 }
		 //_outPut = _outPut;
		 
		 String line =  _outPut;
			 Pattern p = Pattern.compile("\"([^\"]*)\""); 
		//	 line=  m.group(1).substring(1, m.group(1).length()-1);
		 Matcher m = p.matcher(line);
		 String f ="<font color='blue'>";
		 String l = "</font>";
		 
		 while (m.find()) {
			
			// System.out.println(m.group(1).substring(1, m.group(1).length()-1));
			  
			 line =  line.replace(m.group(1), f+m.group(1)+l);
		 }
		 
		 System.out.println(line);
		 //Close the input stream
		 br.close();
		 
		  
		//System.out.println(line);	
		}catch(Exception e){
			e.printStackTrace();
		}

		
		}

}
/*#003333 ,*/