class TwoDigit2 
{
	boolean isTwoDigit(int x)
	{
		int d,count=0;
		d=x%10;
		count++;
		x=x/10;
		if(count==2)
			return true;
		else
			return false;
	}
	void display(boolean n, int num)
	{
		if(n==true)
			System.out.println(num +" is two digit");	
		else
			System.out.println(num +" is not two digit");
	}
	public static void main(String[] args) 
	{
		TwoDigit t = new TwoDigit();
		int num1 = -10;
		boolean n = t.isTwoDigit(num1);
		t.display(n,num1);
		int num2 = 12;
		boolean y = t.isTwoDigit(num2);
		t.display(y,num2);
		int num3 = 1345;
		boolean z = t.isTwoDigit(num3);
		t.display(z,num3);
	}
}
