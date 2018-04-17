package pack1;

class Uncle
{
String FirstName;
String LastName;
Uncle(String FirstN,String LastN)
{
	FirstName = FirstN;
	LastName = LastN;
	
	
}
void printName()
{
	System.out.println(FirstName+" "+LastName);
}
}
public class ParametrizedCons {

	public static void main(String args[])
	{
		Uncle obj = new Uncle("herrry","Shezal");
		obj.printName();
	}
}
