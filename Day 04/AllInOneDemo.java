class AllInOneDemo{

	static void print(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Student s1=new Student("Charle");
		Student s2=new Student();
		Student s3=new Student("Don",55);
		
		print("Name of the student s1 is "+s1.name+" , Marks = "+s1.marks);		
		print("Name of the student s2 is "+s2.name+" , Marks = "+s1.marks);		
		print("Name of the student s2 is "+s3.name+" , Marks = "+s1.marks);
		
		Car c1=new Car();
		Car c2=new Car();
		c1.setModel("Mazda S3");
		c2.setModel("Nissan Navara");
		
		print("Model of the car C1 is "+c1.getModel());
		print("Model of the car C2 is "+c2.getModel());
		
	}
	
}	