package ArrayAndStringAssingment13oct;

//1 WAP to find third maximum number from list of numbers.

public class ThridMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,50,30,40,50,60,70,80,90};
		int b=a.length;
		
		for(int i=0;i<b;i++)
		{
			for(int j=i+1;j<b;j++)
			{
				if(a[i]>a[j])
				{
				    int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.println("max="+a[b-3]);
	 }
	 


}
