package com.pcsetting.example;

public class Sample3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("宣告car1");
   Car21 car1 =new Car21();
   car1.setCar(1234,20.5);
   System.out.println("宣告car2");
   Car21 car2;
   System.out.println("將CAR1指定給CAR2");
   car2=car1;
   System.out.println("CAR1的");
   car1.show();
   System.out.println("CAR2的");
   car2.show();
   System.out.println("改變CAR1相關資料");
   car1.setCar(2345,30.5);
   System.out.println("CAR1的");
   car1.show();
   System.out.println("CAR2的");
   car2.show();
   
   
	}

}
class Car21{
	private int num;
	private double gas;
public  Car21(){
	
	num=0;
	gas=0.0;
	System.out.println("生產了車子");
	
}	
public void setCar(int n,double g ){
	
	num = n;
	gas = g;
	System.out.println("將車號設為"+num+",汽油量為"+gas);
	}
public void show() {
	System.out.println("車號是:"+num);
	System.out.println("汽油量是:"+gas);
}
}
