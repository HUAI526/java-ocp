class ex3
{
	public static void main(String[] args) throws cheack {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Order[] o=new Order[3];
			o[0]=new Order("a1",10,20);
			o[1]=new Order("a2",10,20);
			o[2]=new Order("a3",10,20);


			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}

			System.out.println("=========================");
			o[0].setLcd(20);
			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}
			System.out.println("=========================");
			System.out.println("請輸入Ram");

			int x=sc.nextInt();

			assert x>=0:"ram需要>=0";

			o[0].setRam(x);
			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}
		/*	
		try
		{
			o[0]=new Order("a1",10,20);
			o[1]=new Order("a2",10,20);
			o[2]=new Order("a3",10,20);


			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}

			System.out.println("=========================");
			o[0].setLcd(-20);
			for(int i=0;i<o.length;i++)
			{
				o[i].show();
			}
		}

		catch(Exception e)
		{
			System.out.println("新增訂單 Lcd>=0 && Ram>=0");
			e.printStackTrace();
		}*/
	}

}