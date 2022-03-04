class school
{
	private String name;

	school(String name)
	{
		this.name=name;
	}

	void skill()
	{
		System.out.println("school skill");
	}

	protected void abc(int x)
	{

	}

	String show()
	{
		return "名："+name;
	}

	void change(String name)
	{
		this.name=name;
	}

	void change(int x)
	{

	}
}