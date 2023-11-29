package com.pcsetting.example;

public class Sample4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car63 car1=new Car63();
car1.setCar(1234,20.5);
System.out.println(car1);
	}

}
class Car63{
protected int num;
protected double gas;
public Car63() {
	num=0;
	gas=0;
	System.out.println("生產了車子");
}
public void setCar(int n ,double g ) {
		 num=n;
		 gas=g;
		 System.out.println("將車號設為"+num+",汽油量設為"+gas);
	 }
public String toString() {
	String str="車號:"+num+";汽油量:"+gas;
	return str;
	
}
}