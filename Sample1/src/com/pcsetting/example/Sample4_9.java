package com.pcsetting.example;

public class Sample4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car65[] cars=new Car65[2];
    cars[0]=new Car65();
    cars[1]=new RacingCar20();
    for(int i=0;i<cars.length;i++) {
    	Class cl =cars[i].getClass();
    	System.out.println("第"+(i+1)+"個物件的類別是"+cl);
    	
    	
    }
	}

}
class Car65{	
	protected int num;
	protected double gas;
	
	public Car65() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
		
	}
	
}
class RacingCar20 extends Car65{
	   
	    public RacingCar20() {
	  
	        System.out.println("生產了賽車");
	    }
}
