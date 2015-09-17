public class MyDataStructure
{
	private String team;
	private int score1;
	private int score2;
	
	public MyDataStructure( )
	{
		
	}
	
	public MyDataStructure( String tm, int s1, int s2 )
	{
		team = tm;
		score1 = s1;
		score2 = s2;
	}
	
	public String getTeam()
	{
		return team;
	}
	
	public int getScore1()
	{
		return score1;
	}
	
	public int getScore2()
	{
		return score2;
	}
	
	public void setTeam( String tm )
	{
		team = tm;
	}
	
	public void setScore1( String s1 )
	{
		score1 = s1;
	}
	
	public void setScore2( String s2 )
	{
		score2 = s2;
	}


}
