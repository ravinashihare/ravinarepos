package inheall;

import inheall.Fruit1.Mango;

class fruitA {
	int fruitAge;
	fruitA() {
		System.out.println("fruitA class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class mango extends fruitA {
	int fruitAge;

	mango() {
		// super(); //java compiler will write default super()
		System.out.println("mango class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("Mango are Tart in taste");
	}
	public void shape() {
		System.out.println("mango is round");
	}
}
public class Inherit8 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		mango m1=new mango();
		m1.shape();//mango is round
		m1.taste();//Mango are Tart in taste
		System.out.println(m1.fruitAge);//5
		
		fruitA f1=new fruitA();
		f1.taste();//Fruits are sweet
		System.out.println(f1.fruitAge);//7
		System.out.println("*******************************************");
	}

}
	
	
	/* o/p
*******************************************
fruitA class cons..
mango class Cons..
mango is round
Mango are Tart in taste
5
fruitA class cons..
Fruits are sweet
7
*******************************************


	*/


