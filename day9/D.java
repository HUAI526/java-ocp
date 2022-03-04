class D extends school
{
	private int eng;

	D(String name, int eng)
	{	
		super(name);
		this.eng=eng;
	}

	//抽象解決方法1.class變抽象加上abstract(不建議)
	//			 2.寫一個像void change有名字沒有內容
	void change(int chi)
	{

	}
}