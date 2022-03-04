class add3
{
	public static void main(String[] args) {
		//student sa=new S1();
		//student sb=new S2();

		//S1 sc=new S2();//左邊要是父類別 右邊是子類別
		//s1 sc=new student();//左邊要是父類別 右邊是子類別

		S1 sa=new S1();//is-a S1 , is-a student--->declare宣告來決定
		//這邊可以使用兩份文件 S1, student 因為S1可以繼承student的東西所以可以使用
		student sb=new S1();//is-a student--->reference文件
		//這邊只能使用student,無法往下S1拿東西使用

		sa.show();//has-a show1()
		sa.skill();//has-a skill1()
		System.out.println("==========================");
		
		sb.show();
	}
}