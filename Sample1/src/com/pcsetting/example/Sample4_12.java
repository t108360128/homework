package com.pcsetting.example;

public class Sample4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  iVehicle[] ivc=new iVehicle[2];
  ivc[0]=new Car68(1234,20.5);
  ivc[1]=new Plane3(232);
  for(int i=0;i<ivc.length;i++) {
	  ivc[i].show();
	  
  }
	}

}
interface iVehicle{
	int weight =1000;
	void show();	
}
class Car68 implements iVehicle{
	private int num;
	private double gas;
	public Car68(int n , double g ) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	   public void show() {
	        System.out.println("賽車車號是" + num);
	        System.out.println("汽油量是" + gas);
	   }
	
}
class Plane3 implements iVehicle{
	private int flight;
	public Plane3(int f)
	{
		flight = f ;
		System.out.println("生產了"+flight+"班次的飛機");	
	}	
	public void show() {
		System.out.println("飛機的班次是"+flight);
	}
	
}