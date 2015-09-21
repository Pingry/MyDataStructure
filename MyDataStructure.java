public class MyDataStructure
{
	private int age;
	private String name;
	private int form;
	
	public MyDataStructure(int a, String b, int c)
	{
		age=a;
		name=b;
		form = c;
	}
	
	public MyDataStructure(int a, int c)
	{
		age = a;
		name = "Billy";
		form = c;
	}
	
	public void changeAge(int a)
	{
		age = a;
	}
	
	public String getName ()
	{
		return name;
	}
	
}
