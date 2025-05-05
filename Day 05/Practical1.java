class Paper{
	int length;
	int width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	public static void main(String[] args){
		Document d=new Document(); //create object
		System.out.println("Created a document object d");
		d.name="My First Document";
		d.p=new Paper();
		//set the length and width of the paper object p of the document object d
		d.p.length=10;
		d.p.width=3;
		d.p.text="This is the text in the paper of document of my first document";
		System.out.println("Name of the Document d is "+d.name);
		System.out.println("Size (l*w) of the paper of the Document d is "+d.p.length+"*"+d.p.width);
		System.out.println("Text value of paper p of document d id "+d.p.text);
		
		
		Document d2=new Document();
		System.out.println("Created a document object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is "+d2.name);
		
		
	
	}
}

