package pack1;
class Dada
{
	
	Dada(int a,int b)
	{
		System.out.println(a+b);
		
	}
	Dada(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	
}

public class ConstructOverload {

	public static void main(String args[])
	{
		Dada obj = new Dada(1,2);
		Dada obj1 = new Dada(1,2,3);
		
				}
}
