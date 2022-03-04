class ex7
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入你的國文分數");
		int chi=sc.nextInt();
		System.out.println("請輸入你的英文分數");
		int eng=sc.nextInt();
		/*
		System.out.println("國文="+chi+"分");
		System.out.println("英文="+eng+"分");
		System.out.println("總分="+(chi+eng)+"分");
		*/
		System.out.println("國文="+chi+"分"
				+"\n英文="+eng+"分"
				+"\n總分="+(chi+eng)+"分");




	}
}