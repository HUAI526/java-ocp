class company
{	
	String name;
	String address;
	company(String name)
	{
		this.name=name;
		System.out.println("new company name"+name);

	}

	company(String name, String address)
	{
		this.name=name;
		this.address=address;
		System.out.println("new company name"+name+"\taddress="+address);
	}
}