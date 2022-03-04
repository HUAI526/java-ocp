class porder
{
	String name;
	int Lcd;
	int Ram;
	int Mouse;
	int sum;


	porder(String name, int Lcd, int Ram, int Mouse)
	{
		if(Lcd>=0 && Ram >= 0 && Mouse >= 0)
		{
			this.Lcd=Lcd;
			this.Ram=Ram;
			this.Mouse=Mouse;
			sum=Lcd*4999+Ram*1280+Mouse*799;
		}

	}

	void show()
	{
		System.out.println("客戶名稱："+name+"\tLcd:"+Lcd+"\tRam:"+Ram+"\tMouse:"+Mouse+"\t總數"+sum);
	}

}