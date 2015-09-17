public class MyDataStructure
{
	private String[] emotions;
	
	public MyDataStructure(String[] e)
	{
		emotions = e;
	}
	
	public MyDataStructure()
	{
		emotions = new String[2];
		emotions[0] = "happy";
		emotions[1] = "sad";
	}
	
	public String emote()
	{
		return(emotions[(int)(Math.random() * 2)])
	}
	public void speek()
	{
		System.out.println(emote());
	}

}
