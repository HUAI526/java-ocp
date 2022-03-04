final class Order
{
	private int x;
	private String name;
	final double pi=3.14;//常數,加final一定要給初始值

	Order(String name)
	{	
		//pi=5.12;
		this.name=name;
	}

	Order(String name)
	{
		this.name=name;
	}

	Order(String name, int x)
	{
		this(name);
		this.x=x;
	}
	Order(String name, int x, int y)
	{
		this(name,x);
	}


	public String toString()
	{
		return "位址＝"+super.toString();
	}

	/*final */String show()
	{
		return "name\t"+name;
	}

	void abc1()
	{
		System.out.println("order abc1");
	}
}