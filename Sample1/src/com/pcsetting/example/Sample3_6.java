package com.pcsetting.example;

public class Sample3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car36 car1=new Car36();
int number=1234;
double gasoline=20.5;
car1.setNumGas(number,gasoline);

	}

}

class Car36{
	int num;
	double gas;
	
	void setNumGas(int n, double g ){
		num=n;
		gas=g;
		System.out.println("將車號設為:"+num+",汽油量設為:"+gas);
	}
void show() {
		System.out.println("將車號設為"+num);
		System.out.println("將汽油量設為:"+gas);
	}
}
