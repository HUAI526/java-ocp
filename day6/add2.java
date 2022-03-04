class add2
{
	public static void main(String[] args) {
		cal c1=new cal();
		cal c2=new cal();

		c1.show();
		c2.show();


		System.out.println("======================");

		java.util.Scanner sc=new java.util.Scanner(System.in);
		double x=sc.nextDouble();
		System.out.println(x);

		System.out.println(Math.abs(-5));//絕對值Math.abs
		System.out.println(Math.pow(3,2));//Math.pow 3的2次方


	}
}