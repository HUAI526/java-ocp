class add1
{
	public static void main(String[] args) {
		/*student s1=new student("a",52,65);
		student s2=new student("a",52,65);
		System.out.println(s1);
		System.out.println(s2);
		
		s1.show();
		s1.show();*/



		/*student s1=new student("a",52,65);
		//sum=chi+eng;
		s1.show();//使用show() method
		System.out.println(s1.chi);//讀取 read chi field
		s1.chi=-100;//寫入 write chi field
		System.out.println(s1.chi);
		s1.show();*/

		student s1=new student("abc",45,56);
		student s2=new student("abc",75,56);
		s1.show();
		s2.show();
		System.out.println("================");
		//s1.change(70,80);
		//s2.change(60,70);
		//System.out.println("總分合計:"+(s1.change(70,80)+s2.change(60,70))); 也可以分開寫
		s1.change(70,80);
		s2.change2(60,70);
		s1.show();
		s2.show();

		System.out.println("================");

		//s1.chi= -50;
		s1.show();

		System.out.println(s1.getName()+"\t"+s1.getChi());
		s1.setName("qwertyui");
		s1.setChi(100);
		System.out.println(s1.getName()+"\t"+s1.getChi());

	}
}

