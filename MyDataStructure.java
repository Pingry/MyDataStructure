public class MyDataStructure
{
	private String name, qualites, hairColor, eyeColor;
	private int height, weight;
	
	public myDataStructure (String a, String b, String c, String d, int e, int f)
	{
		name = a;
		qualities = b;
		hairColor = c;
		eyeColor = d;
		height = e;
		weight = f;
	}
	
	public static void changeName(String n)
	{
		name = n;
	}
	
	public static int getHeight(int h)
	{
		height = h;
	}

}
