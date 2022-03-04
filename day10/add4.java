interface student2
{
	void show1(String msg);
}
class add4
{
	public static void main(String[] args){
		student2 s=new student2()
		{
			public void show1(String msg)
			{
				System.out.println(msg);
			}
			/*public double show2(double d)
			{
				return d;
			}*/
		};
		s.show1("hello");

		System.out.println("======================");

		student2 s2=(String msg)->System.out.println(msg+"java2");
		student2 s3=(msg)->System.out.println(msg+"java3");
		student2 s4=msg->System.out.println(msg+"java4");
		

		s2.show1("hello");
		s3.show1("hello");
		s4.show1("hello");
	}
}