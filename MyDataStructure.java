public class MyDataStructure
{

	private int age;
	private String title;
	private boolean isAlive;
	
	public MyDataStructure()
	{
		age=15;
		title= "Master Professor";
		isAlive= true;
		
	}
	
	public void setAge(int a)
	{
		age=a;
	}
	
	public void setTitle(String a)
	{
		title=a;
	}
	
	public void setLife(boolean a)
	{
		isAlive=a;
	}
	
	public int getAge()
	{
		return age;
	}
	public String getTitle()
	{
		return title;
	}
	public boolean getLife()
	{
		return isAlive;
	}
	


}