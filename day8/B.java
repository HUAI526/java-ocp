class B extends company
{
	int RAM;
	
	B(String name, int RAM)
	{
		super(name);
		this.RAM=RAM;
		System.out.println("new B ram="+RAM);
	}

	B(String name, String address, int RAM)
	{
		super(name,address);
		this.RAM=RAM;
		System.out.println("new B ram="+RAM);
	}

}