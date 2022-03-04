class ex1
{
	public static void main(String[] args){
		boolean x=true;//false

		double a=10+1.2;//兩邊類型要一致10是int 1.2是double
						//系統優先選擇大的 所以是dobule
		float a2=10.12f;
		//long a3=a2;

		long a3=10;
		float a4=a3;

		System.out.println(a4);
		// float a5=10+1.2f+2.3; int10 float1.2 dobule2.3 
		// 系統會選擇dobule 所以兩邊不合
		System.out.println(10/3.f);

		int Abc=10;
		int abc=12;
		//int static=41; not
		int x1=10;
		//int 1x=12; not

		int $x=10;
		int _x=10;
		//int *x=10; not
		int lesson$One=10;
		int lesson_One=10;
		int 國文=10;//unicode
		System.out.println(國文*20);
		
		int A=0; //一定要設定初始值才可以執行

		System.out.println(A);
	}
}