class A extends company
{	
	int Lcd;
	A(String name, int Lcd)
	{	

		super(name);
		this.Lcd=Lcd;
		System.out.println("new A");
	}
	A(String name)
	{
		super(name,"fdsa");
		System.out.println("new A ");
	}
}