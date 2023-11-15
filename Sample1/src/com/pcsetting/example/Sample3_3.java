package com.pcsetting.example;

public class Sample3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Car33 car1=new Car33();
		car1.num=1234;
		car1.gas=20.5;
		car1.show();
	}

}
class Car33{
	int num ;
	double gas;
	void show() {
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
	
}