package com.pcsetting.example;

public class Sample3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car37 car1 =new Car37();
 car1.setNumGas(1234,20.5);
 int number =car1.getNum();
 double gasoline=car1.getGas();
 System.out.println("調查樣品車時得知");
 System.out.println("車號是"+number+",汽油量是"+gasoline);
	}
}
class Car37{
	int num;
	double gas;
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
		
	}
	void setNumGas(int n , double g) {
		num = n;
		gas = g ;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
		
	}
}
