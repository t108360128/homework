package com.pcsetting.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if( args.length != 1)
		  {
		   System.out.println("請指定正確檔案的名稱");
		   System.exit(0);
		  }
		  
		  try{
		   BufferedReader br = new BufferedReader( new FileReader(args[0]));
		   
		   String str;
		   while( (str = br.readLine()) != null)
		   {
		    System.out.println(str);
		   }
		   br.close();
		  }
		  catch(IOException e)
		  {
		   System.out.println("輸出入錯誤");
		  }

	}

}
