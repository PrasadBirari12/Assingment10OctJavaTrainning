package ArrayAndStringAssingment13oct;

public class LcmAndHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {12,16,20,50};
	
		System.out.println("hcf");
		for (int i = 0; i < a.length-1; i++) 
		{
		  int c=a[i];
		  int d=a[i+1];
		  for (int j = 1; j < c || j<d; j++) 
		  {
			if(c%j==0 && d%j==0)
			{
				System.out.print(j+" ");
				
			}
		   }
		  System.out.println();
		}

	}

}

