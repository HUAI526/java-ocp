interface school4
{

}
interface school3
{

}
interface school2 extends school3,school4//介面對介面要用extends
{
	void show3();
}

interface school1
{
	void show2();
}
class school
{
	void show1()
	{

	}
}

class SA extends school implements school1,school2
{
	public void show2()//有繼承過的相同名稱跟型態的話寫一個就好
	{

	}
	public void show3()
	{

	}
	public void show4()
	{

	}
}