class add2
{
	public static void main(String[] args) {
		//student[][] s=new student[2][2];
		/*
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[0][0]);
		System.out.println(s[1]);
		*/

		student[][] s=new student[][]
		{
			{
				new student("a",45,74),
				new student("a2",77,66),
			}
			,
			{
				new student("b",45,74),
				new student("b2",77,35),
			}
		};

		System.out.println("=====================================");

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);

			for(int j=0;j<s[i].length;j++)
			{
				System.out.println("\t"+s[i][j]+"\t"+s[i][j].show());
			}
		}

				System.out.println("=====================================");

		for(student[] o:s)
		{
			System.out.println(o);
			for(student u:o)
			{
				System.out.println("\t"+u+u.show());
			}
		}

	}
}