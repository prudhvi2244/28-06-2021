package p1.p2;

public class Calculator {
	
	public double div(int a,int b)
	{
		double divResult=0;
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			divResult=a/b;
		}
		
		
		return divResult;
	}

}
