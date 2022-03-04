class exx2 
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("輸入次數");
		int n=sc.nextInt();

		for (int i=1; i<=n; i++)

		{
			//if(i==101) break; //當遇到101就結束
			//if(i==101) continue; //遇到101就跳過，繼續做

			if(i>=20 && i<=40) continue;
			if(i>=50 && i<=60) continue;
			if(i==101) break;
				System.out.println("i="+i+"\t 666");
		}
		/*
		for(int x=0,y=1;x<25000 || y<30000;)
		{
			System.out.println("x="+x+"\ty="+y);
			x=x*100+1;
			y=2*x+50;
		}
		
		int i=1;
		while(i<100)
		{
			System.out.println("i="+i+"\t再來一次");
			i*=2;
		}
		/*

		int i=12;
		do
		{
			if (i>=10) 
			{
				System.out.println("太大");//捕捉error
			}
			else
			{
				System.out.println("i="+i+"\t再來一次");
				i+=2;
			}

		}while(i<100);
		*/

	}
}