class add4
{
	public static void main(String[] args) {
		school s1=new C("a",10);//is-a school
		System.out.println(s1.show());
		//((C)s1).change(50);
		s1.change(50);//has-a change
		System.out.println(s1.show());
	}
}