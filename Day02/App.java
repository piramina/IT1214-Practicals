import p1.Myclass;
import p2.Class2;
import p3.Class3;
import p4.*;   //import all the classes under the p4

class App{
	public static void main(String[]args){
		Myclass mc=new Myclass();
		mc.display();
		
		Class2 c2=new Class2();
		c2.display();
		
		Class3 c3=new Class3();
		c3.display();
		
		Class4 c4=new Class4();
		c4.display();
	}
}
