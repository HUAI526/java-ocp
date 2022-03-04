class add3
{
	public static void main(String[] args) {
		student[][][] s=new student[2][][];
		s[0]=new student[2][];
		s[0][0]=new student[2];
		s[0][1]=new student[3];

		s[1]=new student[3][];
		s[1][0]=new student[2];
		s[1][1]=new student[3];
		s[1][2]=new student[4];

		s[0][0][0]=new student("a",11,11);
		s[0][0][1]=new student("b",22,22);

		s[0][1][0]=new student("c",33,33);
		s[0][1][1]=new student("d",44,44);
		s[0][1][2]=new student("e",55,55);

		s[1][0][0]=new student("f",66,66);
		s[1][0][1]=new student("g",77,77);

		s[1][1][0]=new student("h",88,88);
		s[1][1][1]=new student("i",99,99);
		s[1][1][2]=new student("j",00,00);

		s[1][2][0]=new student("k",12,12);
		s[1][2][1]=new student("l",21,21);
		s[1][2][2]=new student("m",13,13);
		s[1][2][3]=new student("n",31,31);

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			for(int j=0;j<s[i].length;j++)
			{
				System.out.println("\t"+s[i][j]);
				for(int k=0;k<s[i][j].length;k++)
				{
					System.out.println("\t\t"+s[i][j][k].show());
				}
			}
		}

		System.out.println("=========================================");

		for(student[][] o:s)
		{	
			System.out.println(o);
			for(student[] u:o)
			{
				System.out.println("\t"+u);
				for(student v:u)
				{
					System.out.println("\t\t"+v.show());
				}
			}
		}

	}
}