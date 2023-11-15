package com.pcsetting.example;

public class Sample3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car35 car1=new Car35();
car1.setNum(1234);
car1.setGas(20.5);

	}

}

class Car35{
	int num;
	double gas;
	
	void setNum(int n) {
		
		num = n;
		System.out.println("將車號設為"+num);
		
	}
	void  setGas(double g) {
		gas = g ;
		System.out.println("將汽油量設為:"+gas);
	}
}
