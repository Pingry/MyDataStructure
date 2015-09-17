import java.util.ArrayList;

public class MyDataStructure
{
	private String name;
	
	private int age;
	
	private ArrayList<String> hobbies;
	
	private boolean isSerialKiller;
	
	public MyDataStructure()
	{
		name = "Sam";
		age = 17;
		hobbies = new ArrayList<String>;
		hobbies.add("squash");
		hobbies.add("reading");
		isSerialKiller = false;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
}