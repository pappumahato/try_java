import java.util.Scanner;
class PatternCA1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("  ");
			for(int j=0;j<=n-i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}