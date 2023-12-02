package com.pcsetting.example;

public class Sample5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Car78 car1 = new Car78("1號車");
			 car1.start();
			  for(int i=0; i<5; i++)
			  {
				  try { 
				  Thread.sleep(1000);
			   System.out.println("正在進行main()的處理");
			   }
			   catch(InterruptedException e) {}
			  }
			 }

	}
	class Car78 extends Thread
	{
	 private String name;

	 public Car78(String nm)
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
