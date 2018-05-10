package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Reading data from keyboard:

There are many ways to read data from the keyboard. For example:

InputStreamReader
Console
Scanner
DataInputStream etc.*/

public class InputStreamReader_1 {

	public static void main(String[] args) {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
//Keyboard >> device buffer >> system.in >> ir >> br >> java program

/* 
 
 
InputStreamReader class:
InputStreamReader class can be used to read data from keyboard.
InputStreamReader is a character oriented stream.

It performs two tasks:
connects to input stream of keyboard.
converts the byte-oriented stream into character-oriented stream.

BufferedReader class:
BufferedReader class can be used to read data line by line by readLine() method.


  
  */
