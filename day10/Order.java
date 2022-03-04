class cheack extends Exception
{
	cheack(String msg)
	{
		System.out.println(msg);
	}
}
class cheack2 extends RuntimeException
{
	cheack2(String msg)
	{
		System.out.println(msg);
	}
}

class Order
{
	private String name;
	private int Lcd;
	private int Ram;

	Order(String name, int Lcd, int Ram) throws cheack
	{
		if(Lcd>=0 && Ram>=0)
			{
				this.name=name;
				this.Lcd=Lcd;
				this.Ram=Ram;
			}
		else 
		{
			throw new cheack("新增訂單需Lcd>0 && Ram>=0");
		}
	}


	void show()
	{
		System.out.println("name"+name+"\tLcd"+Lcd+"\tRam"+Ram);
	}

	void setLcd(int Lcd) throws cheack
	{	
		if(Lcd>=0)
		{
			this.Lcd=Lcd;
		}
		else
		{
			throw new cheack("修改Lcd需>=0");
		}
	}

	void setRam(int Ram) throws cheack
	{
		if(Ram>=0)
		{
			this.Ram=Ram;
		}
		else
		{
			throw new cheack("修改ram");
		}
	}
}