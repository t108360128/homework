package com.pcsetting.example;

public class Sample3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car43 car1=new Car43();
		car1.show();
		Car43 car2=new Car43(1234,25.0);
		car2.show();
	}

}
class Car43{
	private int num;
	private double gas;
public  Car43(){
	
	num=0;
	gas=0.0;
	System.out.println("生產了車子");
	
}	
public Car43(int n,double g ){
	this();
	num = n;
	gas = g;
	System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
public void show() {
	System.out.println("車號是:"+this.num);
	System.out.println("汽油量是:"+this.gas);
}
}