class student
{
	//private功能只限於同檔案內修改,其他地方只能透過新增student()或是修改void change()
	private String name;
	private int chi;
	private int eng;
	private int sum;

	student(String name,int chi,int eng)
	{
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100)
		{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			sum=chi+eng;
		}
	}
	student(String name)
	{

	}

	// getter
	String getName()
	{
		return name;
	}

	// setter
	void setName(String name)
	{
		this.name=name;
	}

	int getChi()
	{
		return chi;
	}

	void setChi(int chi)
	{
		this.chi=chi;

	}

	void change(String name, int chi, int eng)//兩項名字相同但括弧內容物不同也可以
	{

	}


	void change(int chi,int eng) // 修改
	{
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100)
		{
			this.chi=chi;
			this.eng=eng;
			//sum=chi+eng;
		}

		
	}

	int change2(String name, int chi,int eng)//兩項名字相同但括弧內容物不同也可以
	{
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100)
		{
			this.chi=chi;
			this.eng=eng;
			sum=chi+eng;
		}

		return sum;

		
	}
	int change2(int chi,int eng) // 讀取
	{
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100)
		{
			this.chi=chi;
			this.eng=eng;
			sum=chi+eng;
		}

		return sum;
		
	}

	void show()
	{
		sum=chi+eng; //在這邊再寫一次所有的計算步驟 確保沒有漏掉
		System.out.println("名:"+name+
			"\t國文:"+chi+
			"\t英文:"+eng+
			"\t總分:"+sum);
	}
}
