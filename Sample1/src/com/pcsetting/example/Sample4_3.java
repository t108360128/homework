package com.pcsetting.example;

public class Sample4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RacingCar3 rccar1=new RacingCar3();
		 rccar1.newshow();
	}

}
class Car53{
protected int num;
protected double gas;
	 public Car53() {
		 num=0;
		 gas=0.0;
		 System.out.println("生產了車子");
	 }
	 public void setCar(int n ,double g ) {
		 num=n;
		 gas=g;
		 System.out.println("將車號設為"+num+",汽油量設為"+gas);
	 }
	 public void show() {
		 System.out.println("車號是"+num);
		 System.out.println("汽油量是"+gas);
		 
	 }
}
	 class RacingCar3 extends Car53{
		 private int course;
		 public RacingCar3() {
			 course = 0;
			 System.out.println("生產了賽車");
			 
		 }
		 public void setCourse(int c)
		 {
			 course = c ;
			 System.out.println("將賽車編號設為"+course);
		 }
	 
		 public void newshow() {
			 System.out.println("賽車車號是"+num);
			 System.out.println("汽油量是"+gas);
			 System.out.println("賽車編號是"+course);
			 
		 }
	 
}