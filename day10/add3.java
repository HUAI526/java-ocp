interface student
{
	void show1(String msg);
	double show2(double d);
}


class A implements student
{
	public void show1(String msg)
	{
		System.out.println(msg);
	}
	public double show2(double d)
	{
		return d;
	}
}
	
class add3
{
	public static void main(String[] args) {
		/*student s=new A();
		A a=new A();
		a.show1("hello");*/

		student s=new student()
		{
			public void show1(String msg)
			{
			System.out.println("java,"+msg);
			}
			public double show2(double d)
			{
			return d;
			}
		};

		s.show1("hello");

		System.out.println("==========================");

		System.out.println("ans="+new student()
			{
				public double show2(double d)
				{
					return d+100;
				}
				public void show1(String msg){}
			}.show2(1000));
	}
}