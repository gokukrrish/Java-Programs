package basics;

public class ConstructorOverloading {
	int id;
	String name;
	int age;
	
	ConstructorOverloading(int i,String n){
		id = i;
		name = n;
	}	
	ConstructorOverloading(int i,String n,int a){
		id = i;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		
		ConstructorOverloading constoverloading= new ConstructorOverloading(1,"Santhosh");
		ConstructorOverloading constoverloading1= new ConstructorOverloading(2,"Lokesh", 26);
		
		//Displaying outputs
		
		constoverloading.display();
		constoverloading1.display();
		

	}

}
