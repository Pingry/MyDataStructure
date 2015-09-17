public class MyDataStructure
{
	private int age;
	private String name, gender;
	private boolean Hunger, Thirst, Tired, Pain, Dead;
	
	public myDataStructure(String name, String gender, boolean Hunger, boolean Thirst, boolean Tired, boolean Pain, boolean Dead, int age)
	{
		this.name = name;
		this.gender = gender;
		this.Hunger = Hunger;
		this.Thirst = Thirst;
		this.Tired = Tired;
		this.Pain = Pain;
		this.Dead = Dead;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public boolean getHunger()
	{
		return Hunger;
	}


}
