public class MyDataStructure
{
	private int jerseynumber;
	private String position;
	public MyDataStructure(int x, String y)
	{
		jerseynumber = x;
		position = y;
	}
	public int getJersey()
	{
		return jerseynumber;
	}
	public String getPosition()
	{
		return position;
	}
	public changeJersey(int z)
	{
		jerseynumber = z;
	}
	public changePosition(String b)
	{
		position =b;
	}
}
