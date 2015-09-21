public class MyDataStructure
{
	private String name, title;
	private int age, height, weight;
	private boolean isHungry, isTired;
	private String gender;
	
	
	public static MyDataStructure (String name, String title, int age, int height, int weight, boolean isHungry, boolean isTired, String gender) {
		this.name = name;
		this.title = title;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.isHungry = isHungry;
		this.isTired = isTired;
		this.gender = gender;
		
	}
	
	public String getName () {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge (int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public boolean isHungry(){
		return isHungry;
	}
	public void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	public boolean isTired() {
		return isTired;
	}
	public void setIsTired(boolean isTired) {
		return isTired;
	}
	
	public String gender () {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
