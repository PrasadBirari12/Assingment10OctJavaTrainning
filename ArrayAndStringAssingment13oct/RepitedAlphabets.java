package ArrayAndStringAssingment13oct;

//4   WAP to print the number of alphabets repeated in the given string.

public class RepitedAlphabets {

	public static void main(String[] args) {

		String s="abcdapraradd";
		String s1="";
//		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			 int count=0;
			for (int j = i+1; j < s.length(); j++)
			{
				
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			
			}
			if(count==0)
			{
				 s1 = s1+s.charAt(i);
			}
		}
		
      System.out.println("String is "+s1);
	  System.out.println("count of repeated char "+(s.length()-s1.length()));
		
	}

}
