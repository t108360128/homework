package com.pcsetting.example;

public class Sample5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Car76 car1 = new Car76("1號車");
		  car1.start();
		 Car76 car2=new Car76("2號車");
		 car2.start();
		  for(int i=0; i<5; i++)
		  {
		   System.out.println("正在進行main()的處理");
		  }
		 }

}
class Car76 extends Thread
{
private String name;

public Car76(String nm)
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