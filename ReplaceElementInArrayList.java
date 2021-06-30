package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceElementInArrayList {

	public static void main(String[] args) {
		{
	        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
	         
	        System.out.println(namesList);
	         
	        //Replace item while iterating
	        for(int i=0; i < namesList.size(); i++) 
	        {
	            if(namesList.get(i).equalsIgnoreCase("brian")) {
	                namesList.set(i, "Lokesh");
	            }
	        }
	         
	        System.out.println(namesList);
	    }
	}
	
}

	
