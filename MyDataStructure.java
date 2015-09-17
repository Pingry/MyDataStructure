public class MyDataStructure
{
	private int age;
	private String name;
	private String gender;
	public MyDataStructure()
	{
		age = 16;
		name = "Will";
		gender = "male";
	}
	
	public MyDataStructure(int a, String n, String g)
	{
		age = a;
		name = n;
		gender = g;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int setAge(int a)
	{
		age = a;
	}	


}
