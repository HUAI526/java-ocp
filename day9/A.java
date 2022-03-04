class A extends Order
{
	private int Lcd;

	A(String name, int Lcd)
	{
		super(name);
		this.Lcd=Lcd;
	}

	void skillA()
	{	
		System.out.println("A skill");

	}

	String show()
	{
		return super.show()+"\tLcd:"+Lcd;
	}

	void abc2()
	{
		System.out.println("A abc2");
	}
}