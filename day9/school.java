abstract class school
{
	private String name;

	school(String name)
	{
		this.name=name;
	}

	String show()
	{
		return "name\t"+name;
	}

	abstract void change(int chi);//抽象方法,這邊變抽象之後class 也要抽象
	


}