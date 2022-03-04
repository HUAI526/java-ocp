class C extends school
{
	private int chi;

	C(String name, int chi)
	{
		super(name);
		this.chi=chi;
	}

	String show()
	{
		return super.show()+"\t國文："+chi;
	}

	void change(int chi)
	{
		this.chi=chi;
	}
}