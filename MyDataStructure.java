public class MyDataStructure
{
	private int anything;
	private String something;
	private double thing;
	
	public MyDataStructure(int a, String b, double c)
	{
		anything=a;
		something=b;
		thing = c;
	}
	
	public MyDataStructure(int a, double c)
	{
		anything = a;
		something = "Billy";
		thing = c;
	}
	
	public void changeAnything(int a)
	{
		anything = a;
	}
	
	public String getSomething ()
	{
		return something;
	}
	
}
