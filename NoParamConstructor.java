package basics;

public class NoParamConstructor {
	String name;
	int id;
	
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		
		NoParamConstructor noparamconstructor= new NoParamConstructor();
		NoParamConstructor noparamacontructor1=new NoParamConstructor();
		
		noparamconstructor.display();
		noparamacontructor1.display();
		

	}

}
