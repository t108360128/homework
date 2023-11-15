package com.pcsetting.example;

public class Sample3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car41 car1=new Car41();
		car1.show();
	}

}
class Car41{
	private int num;
	private double gas;
public  Car41(){
	num=0;
	gas=0.0;
	System.out.println("生產了車子");
	
}	
public void show() {
	System.out.println("車號是:"+this.num);
	System.out.println("汽油量是:"+this.gas);
}
}