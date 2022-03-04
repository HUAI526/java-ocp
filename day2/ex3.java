class ex3
{
	public static void main(String[] args){
		int x=10;
		x+=20;//aka x=x+20;
		System.out.println(x);
		x-=20; //aka x=x-20;
		System.out.println(x);
		// a只會存上一個

		x/=2;// aka x=x/2;
		System.out.println(x);
		x*=20;// aka x=x*20;
		System.out.println(x);
		x%=33;// aka x=x%33;
		System.out.println(x);
	}
}