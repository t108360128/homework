package com.pcsetting.example;

public class Sample4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car64 car1=new Car64();
Car64 car2=new Car64();
Car64 car3=car1;
System.out.println("car1與car2相同"+car1.equals(car2));
System.out.println("car1與car3相同"+car1.equals(car3));

	}

}
class Car64{
	protected int num;
	protected double gas;
	public Car64() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
		
	}
	
	
}