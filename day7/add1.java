class add1
{
	public static void main(String[] args) {
		student[] s=new student[3];//s[0],s[1],s[2] --> 宣告名稱沒有值
		
		for(int i=0;i<s.length;i++)//還沒新增值的時候都是null
		{
			System.out.println("s["+i+"]="+s[i]);
		}
		System.out.println("==================");


		s[0]=new student("a",77,88);//新增值
		s[1]=new student("b",66,98);		
		s[2]=new student("c",87,48);

		for(int i=0;i<s.length;i++) //有值了
		{
			System.out.println("s["+i+"]="+s[i]+"\t"+s[i].show());
		}

		System.out.println("==================");

		for(student o:s)//要跟Ｓ同樣類型的物件型態student
		{
			System.out.println(o+"\t"+o.show());
		}


		/*
		System.out.println(s+"\t"+s[0]);
		s[0]=new student("a",55,66);

		System.out.println(s+"\t"+s[0].show());
		*/

		/*
		student s=new student("a",33,44);
		student d=new student("b",46,67);
		student f=new student("c",28,98);

		System.out.println(s+"\t"+s.show());
		System.out.println(d+"\t"+d.show());
		System.out.println(f+"\t"+f.show());

		*/


	}
}