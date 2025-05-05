class Student{
	int marks;
	String name;
}

class Printer{        
	void print(String s1){    //method
	System.out.println(s1);
	}
}

class App{
	public static void main(String[] args){
		Printer p=new Printer();
		p.print("Welcome to Demo Class App");
		Student s=new Student();
		s.marks=90;
		s.name="Pirami";
		p.print("Your name is "+s.name+","+" Your marks is "+s.marks);
		
	}
}
