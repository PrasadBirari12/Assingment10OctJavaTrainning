package ArrayAndStringAssingment13oct;

import java.util.Scanner;

public class StringConcate {

	public static String concate(String str1, String str2 ,int index)
	{
        String myString =""; 
        
        for (int i = 0; i <str1.length(); i++) { //pravinodsad vinod
        	  
        	myString = myString+str1.charAt(i); 
  
            if (i == index) { 
            	myString += str2; 
            } 
        } 
  
        return myString; 

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String ");
		String str = sc.next();
		System.out.println("Enter second String");
		String str1 = sc.next();
		
		System.out.println("Enter String Index ");
		int index=sc.nextInt();
			
		System.out.println(StringConcate.concate(str, str1, index));
		
		
	}

}
