package com.pcsetting.example;

public class Sample5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Car77 car1 = new Car77("1號車");
			 car1.start();
			  for(int i=0; i<5; i++)
			  {
			   System.out.println("正在進行main()的處理");
			  }
			 }

	}
	class Car77 extends Thread
	{
	 private String name;

	 public Car77(String nm)
	 {
	  name = nm;
	 }

	public void run()
	 {
	  for( int i=0; i<5;i++)
	  {
		try {  sleep(1000);
	   System.out.println("正在進行"+name+"的處理工作");
		}
		catch(InterruptedException e) {}
	  }
	 }
	}
