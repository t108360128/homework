package com.pcsetting.example;

public class Sample3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car42 car1=new Car42();
		car1.show();
		Car42 car2=new Car42(1234,25.0);
		car2.show();
	}

}
class Car42{
	private int num;
	private double gas;
public  Car42(){
	
	num=0;
	gas=0.0;
	System.out.println("生產了車子");
	
}	
public Car42(int n,double g ){
	
	num = n;
	gas = g;
	System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
public void show() {
	System.out.println("車號是:"+this.num);
	System.out.println("汽油量是:"+this.gas);
}
}