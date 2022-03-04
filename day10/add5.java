interface student3
{
	String show(String name, double price);
}

class add5
{
	public static void main(String[] args) {
		student3 s=(String name, double price)->"書名"+name+"\t價格"+price;

		System.out.println(s.show("java",1000));

		student3 s2=(n,p)->"java書名"+n+"\t價格"+p;
		System.out.println(s2.show("java",1000));

		student3 s3=cal::p1;

		System.out.println(s3.show("javaWEB",1000));	
	}
}

class cal
{
	static String p1(String name, double price)
	{
		if(price>=0)
		{
			return "java書名"+name+"\t價格"+price;
		}
		else
		{
			return "重填";
		}
	}
	static String p2(String name, double price)
	{
		if(price>=2000)
		{
			return "java書名"+name+"\t價格"+price*0.8;
		}
		else if(price>=1000)
		{
			return "java書名"+name+"\t價格"+price*0.9;
		}
		else if(price>=0)
		{
			return "java書名"+name+"\t價格"+price;
		}
		else
		{
			return "重填";
		}
	}
}