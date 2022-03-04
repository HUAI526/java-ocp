class add1
{
	public static void main(String[] args) {
	
		A a1=new A("bb",4);//is-a A, is-a Order
		System.out.println(a1);
		System.out.println(a1.show());	
		a1.skillA();
		System.out.println("========================");

		Order o1=new A("a",10);//is-a Order--->檢查方法名字
		//編譯能不能過是由左邊來看,但執行是看右邊
		System.out.println(o1);
		System.out.println(o1.show());//has-a--->override
		//o1.skillA();
		o1.abc1();//繼承
		//o1.abc2();

	}
}