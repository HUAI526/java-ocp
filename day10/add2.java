interface book
{
	double pi=3.14;
	void bookName(String name);
	//兩種抽象化有body的寫法 default,staic
	default double bookPrice1(double price)//物件類-->直接繼承給子類別
	{
		if(price>=0)
		{
			price=price*0.95;
			return price;
		}

		else
		{
			return 0;
		}
	}

	static double bookPrice2(double price)//類別類-->沒有繼承給子類別
	{
		if(price>=0)
		{
			price=price*0.75;
			return price;
		}

		else
		{
			return 0;
		}
	}
}



class bookStore implements book
{
	public void bookName(String name)
	{
		System.out.println(name);
	}
}

class add2
{
	public static void main(String[] args) {
		//book b=new book();
		bookStore b1=new bookStore();
		book b2=new bookStore();
		b1.bookName("java");
		b2.bookName("web");

		System.out.println(b1.bookPrice1(1000));
		System.out.println(new bookStore().bookPrice1(800));
		System.out.println(book.bookPrice2(1000));

	}
}