public class MyDataStructure
{
	private int age;
	private String name;
	

	public MyDataStructure(int a, String n)
	{
		age = a;
		name = n;
	}
	
	public void changeAge(int a)
	{
		age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void changeName(String n)
	{
		name = n;	
	}
	}
}
