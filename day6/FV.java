class FV
{
	private static int pv; // static 當你資料都需要用到同一筆資料時,固定資料
				   // 一直都是同一筆,一旦更改全部都要更改時就可以用static
	private int n;
	private double r;
	private int fv;

	FV(double r,int n)
	{
		this.n=n;
		this.r=r;

		fv=(int)(pv*(1+r*n));
	}

	void setr(double r) //如果算式中有使用到上面的變數而且上面沒有使用static
						//這裡就不能加static
	{
		if(r>=0)
		{
			this.r=r;
		}
	}

	static void setpv(int pv)
	{
		if(pv>=0)
		{
			//this.pv=pv; this-->non-static-->object
			FV.pv=pv;//FV-->class如果已經有static共用,不要用this直接給class名稱
		}
	}

	static String companyName()
	{
		return "存錢比較表";
	}

	static void Title()
	{
		System.out.println("本金\t利率\t期數\t單利本利和");
	}

	void show()
	{	

		fv=(int)(pv*(1+r*n));

		/*
		System.out.println("本金:"+pv+
			"\t利率:"+r+
			"\t期數:"+n+
			"\t單利本利和:"+fv);
			*/

			//=========優化程式碼==========

			System.out.println(pv+"\t"+r+"\t"+n+"\t"+fv);

	}
}