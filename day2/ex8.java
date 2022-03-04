class ex8
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("請輸入分數");
		int x=sc.nextInt();

		/*
		if (x>60) {
			System.out.println("及格");
			System.out.println("兩行賊爽");
		}
		else {
			System.out.println("不及格");
			System.out.println("兩行賊爽");
		}
		*/

		if (x==100)
		{
			System.out.println("你很能考嘛");
		}

		else if (x>=85 && x<100) {
			if (x>=85 && x<95)
			System.out.println("差一點,給你Ａ-");

		else System.out.println("考100很難？,先給你Ａ+");
		}

		else if (x<85 && x>60) {

			if (x<85 && x>70)
			System.out.println("好菜,給你B+");

		else System.out.println("準備下去,B-");
		}
		else if (x<60 && x>=0) {
			if (x<60 && x>40)
			System.out.println("你媽會哭吧Ｃ＋");

		else System.out.println("旁邊窗戶直接下去Ｃ-");	
		}
		else System.out.println("100內啦");

	}
		
}