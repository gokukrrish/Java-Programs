package basics;

 class ExampleDynamicBinding {
	
	void eat() {
		System.out.println("Animal is eating");
	}}

	 class Dog extends ExampleDynamicBinding {
		 void eat() {
		System.out.println("Dog is eating..");	
	}
	public static void main(String[] args) {
		ExampleDynamicBinding d1= new Dog();
		d1.eat();
		

	}

}
