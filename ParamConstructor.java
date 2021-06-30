package basics;

public class ParamConstructor {
	String name;
	int id;
	
	public ParamConstructor(int i,String n) {
		id= i;
		name= n;
	}
	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		ParamConstructor paramconstructor= new ParamConstructor(0,"Santhosh");
		ParamConstructor paramconstructor1= new ParamConstructor(1, "Lokesh");
		
		paramconstructor.display();
		paramconstructor1.display();

	}

}
