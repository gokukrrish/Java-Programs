package basics;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAscending {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
	      set.add(65);
	      set.add(45);
	      set.add(19);
	      set.add(27);
	      set.add(89);
	      set.add(57);
	      System.out.println("TreeSet elements (Sorted)...");
	      Iterator<Integer> i = set.iterator();
	      while(i.hasNext()) {
	         System.out.println(i.next());
	      }
	      System.out.println("\nTreeSet elements (Sorted) in Descending order...");
	      Iterator<Integer> j = set.descendingIterator();
	      while(j.hasNext()) {
	         System.out.println(j.next());

	}

}
}
