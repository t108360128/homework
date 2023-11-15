package com.pcsetting.example;

public class Sample3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Car44.showSum();
  Car44 car1= new Car44();
  car1.setCar(1234,20.5);
  Car44.showSum();
  Car44 car2= new Car44();
  car2.setCar(4567,30.5);
  
	}

}
class Car44{
	private int num;
	private double gas;
public static int sum = 0;
public void setCar(int n , double g ) {
	num = n;
	gas=g;
	sum ++;	
	System.out.println("生產了車子");
	System.out.println("將車號設為"+num+",將汽油量設為"+gas);

}
public static void showSum(){
	System.out.println("車子總共有"+sum+"台");
	
}

public void show() {
	System.out.println("車號是:"+num);
	System.out.println("汽油量是:"+gas);
}
}