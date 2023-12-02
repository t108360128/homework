package com.pcsetting.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Sample5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
			   PrintWriter pw = new PrintWriter( new BufferedWriter(new FileWriter("test1.txt")));
			   
			   pw.println("Hello!");
			   pw.println("GoodBye!");
			   System.out.println("寫入資料");
			   
			   pw.close();
			  }
			  catch(IOException e){
			   System.out.println("輸出入錯誤");
			  }

			 }
	

}
