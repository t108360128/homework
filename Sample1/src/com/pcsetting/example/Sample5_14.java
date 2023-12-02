package com.pcsetting.example;

public class Sample5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Car79 car1 = new Car79("1號車");
			 car1.start();
			 try {
				 
				 car1.join();
			 }
				catch(InterruptedException e) {
					
				}
	  
	System.out.println("結束main()的處理工作");
	}
}

class Car79 extends Thread{

	
	private String name;

	public Car79(String nm)
	{
	name = nm;
	}

	public void run()
	{
	for( int i=0; i<5;i++)
	{
	 System.out.println("正在進行"+name+"的處理工作");
	}
	}

}