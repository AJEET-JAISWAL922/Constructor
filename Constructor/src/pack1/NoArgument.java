package pack1;
class Mom
{
	Mom()
	{
		System.out.println("Constructor is called");
		
	}
	void message()
	{
		System.out.println("A");
		
	}
}
public class NoArgument {

	public static void main(String args[])
	{
		Mom obj = new Mom();
		obj.message();
	}
}
