class ex9
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("請輸入數字");
		int x=sc.nextInt();

		if(x%2==0)
		{
			if(x>=0) System.out.println("正的偶數許純美");
			else System.out.println("負的偶數許純美");

		}
		else if (x%2!=0)
			{
				if(x>=0) System.out.println("正的奇數");
				else System.out.println("負的奇數");
			}
	}
}