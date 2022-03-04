class add2
{
	public static void main(String[] args) {
		Order[][] s=new Order[2][];
		s[0]=new Order[5];
		s[1]=new Order[4];

		System.out.println(s[0][0]);

		s[0][0]=new A("a",10);
		s[0][1]=new A("b",10);
		s[0][2]=new A("c",10);
		s[0][3]=new A("d",10);
		s[0][4]=new A("e",10);

		s[1][0]=new B("f",20);
		s[1][1]=new B("g",20);
		s[1][2]=new B("h",20);
		s[1][3]=new B("i",20);

		for(int i=0;i<s.length;i++)
		{	
			System.out.println(s[i]);
			for(int j=0;j<s[i].length;j++)
			{
				System.out.println("\t"+s[i][j]+"\t"+s[i][j].show());
			}
		}

		System.out.println("==============================");

		for(Order[] o:s)
		{
			System.out.println(o);
			for(Order u:o)
			{
				System.out.println("\t"+u+"\t"+u.show());
			}
		}

		s[0][1].abc1();//編譯看左邊, 執行看右邊A有show()執行
		s[1][0].abc1();//編譯看左邊 , 執行時右邊B沒有show()所以往上找Order繼承
		((A)s[1][0]).skillA();//左邊從Order轉型成Ａ編譯才會過,因為Order中沒有SkillA()
		//然後執行右邊的skillA()
		System.out.println("==============================");

		System.out.println(s[0][3] instanceof Order);
		System.out.println(s[0][3] instanceof A);
		System.out.println(s[0][3] instanceof B);

		System.out.println("==============================");


		System.out.println(s[0][1].show());
		System.out.println(s[1][1].show());
		System.out.println(s[0][1]);
		System.out.println(s[1][1]);
		System.out.println(s[0][1].equals(s[1][1]));
	}
}