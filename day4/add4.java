class add4 // 需要注意大小寫是兩種不同的東西，盡量使用equals去寫比較不容易出錯
{
	public static void main(String[] args) {
		double a1=10.12;
		double a2=10.12;
		System.out.println(a1);
		System.out.println(a1);
		System.out.println(a1==a2); // 變數-->值
		System.out.println("============================");

		Double b1=10.12;//java.lang.Dobule<--->dobule--->autoboxing
		Double b2=10.12;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2);//物件變數,不要用
		System.out.println(b1.equals(b2));
		System.out.println("============================");

		Integer i1=10;
		Integer i2=10;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1==i2); //物件變數
		System.out.println(i1.equals(i2));
		System.out.println("============================");

		long l1=10;
		Long l1=10L;//java.lang.Long<--->int--->long 需要轉他的型態
		Long l2=10L;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1==l2);//物件變數
		System.out.println(l1.equals(l2));

		System.out.println("============================");

		double b1=10;
		Double b2=10.;//加一個小數點 java.lang.Double<--->dobule
		
		System.out.println("============================");
		// 字串轉dobule
		String s1="10.12";
		Double def=new.Double(abc);
		System.out.println(def+10.1);

	}
}