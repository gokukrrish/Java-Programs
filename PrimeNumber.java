package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number,divisor,count; 
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter A Number : "); 
        number =s.nextInt(); 
        divisor=1; 
        count=0; 
        s.close();
         while(divisor<= number) 
            { 
                if((number%divisor)==0) 
                   count=count+1; 
                   divisor++; 
            } 
             if(count==2) 
             System.out.println(number +" is a prime number"); 
             else 
             System.out.println(number +" is not a prime number"); 
   } 

	}


