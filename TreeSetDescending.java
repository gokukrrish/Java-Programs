package basics;

import java.util.TreeSet;

public class TreeSetDescending {

	public static void main(String[] args) {
		
		//Treeset declaration
		TreeSet<Object> tSet=new TreeSet<Object>();
		
		tSet.add(2);
		tSet.add(20);
		tSet.add(10);
		tSet.add(5);
		tSet.add(7);
		tSet.add(3);
		
		
		TreeSet<Object> tSetReverse= (TreeSet<Object>)tSet.descendingSet();
		
		System.out.println("Without descendingSet():" +tSet);
		System.out.println("With descendingSet():" +tSetReverse);

	}

}
