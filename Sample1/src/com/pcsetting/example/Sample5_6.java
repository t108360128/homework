package com.pcsetting.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("請輸入字串");
		  
		  try{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   String str = br.readLine();
		   System.out.println("已經輸入"+str);
		  }
		  catch(IOException e){
		   System.out.println("輸出入有誤");
		  }

		 }

		}
	


