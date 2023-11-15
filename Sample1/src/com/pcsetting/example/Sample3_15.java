package com.pcsetting.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_15 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
    System.out.println("請輸入一個整數");
    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    String str=br1.readLine();
    int num =Integer.parseInt(str);
	
   System.out.println("您輸入的數字:"+num);
}
	}
