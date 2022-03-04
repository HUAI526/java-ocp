class ex5 
{
	public static void main(String[] argss){
		int s=26;

		System.out.println("s 26小於30="+(s<30));
		System.out.println("s 26小於等於30="+(s<=30));
		System.out.println("s 26大於30="+(s>30));
		System.out.println("s 26大於等於30="+(s>=30));
		System.out.println("s 26等於30="+(s==30));
		System.out.println("s 26不等於30="+(s!=30));

		int a=68;
		int b=70;
		System.out.println("a>65 && b>75 -->"+(a>65 && b>75));
		// &&(and) 兩邊都要符合才能輸出
		System.out.println("a>65 || b>75 -->"+(a>65 || b>75));
		// ||(or) 其中一邊符合即可
		System.out.println("a>65 ^ b>75 -->"+(a>65 ^ b>75));
		// ^(xor) 如果兩邊都符合或都不符合就不要,只要一邊符合就好
		// !(not) 轉換 輸出變成相反 !(a>65)從true --> false
		



	}
}