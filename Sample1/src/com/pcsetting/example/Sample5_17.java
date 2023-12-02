package com.pcsetting.example;

public class Sample5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company12 cmp=new Company12();
		Driver12 drv1=new Driver12(cmp);
		drv1.start();
		Driver12 drv2 = new Driver12(cmp);
		drv2.start();	
	}

}
class Company12{
	private int sum=0;
	public synchronized void add(int a ) {
		int tmp = sum;
		System.out.println("目前的合計金額是"+tmp+"元");
		System.out.println("賺到"+a+"元");
		tmp=tmp+a;
		System.out.println("合計金額是"+tmp+"元");
		sum=tmp;
	}
}
class Driver12 extends Thread{
	private Company12 comp;
	public Driver12(Company12 c ) {
		comp=c;
	}
	public void run() {
	for(int i=0;i<3;i++) {
		comp.add(50);
		
	
	}
	
	}
	
}