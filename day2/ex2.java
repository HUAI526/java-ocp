class ex2
{
	public static void main(String[] args){
		int a=10;
		int b=3;
		//2*a+b=a+2*b;  not
		a=2*b-b; //2*a-b ---> assign to ---> a
		System.out.println(a);

		a=a+20;// a這時候算完會是30


		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	
	}
	
}