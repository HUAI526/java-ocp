class ex4 
{
	public static void main(String[] args){
		int x=10;

		x++;// aka x=x+1; or ++x;
		System.out.println(x);
		x--;// aka x=x-1; or --x;
		System.out.println(x);

		System.out.println("========================");

		int a=10;
		int b;

		b=a++; //aka a=b; a=b+1
		System.out.println("a="+a);
		System.out.println("b="+b);

		b=++a; //aka a=b+1; a=b
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}