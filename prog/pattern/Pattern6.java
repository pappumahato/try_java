import java.util.Scanner;
class Pattern6
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i+" ");

			}
			System.out.println();
		}
	}
}