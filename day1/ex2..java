class ex2
{
	public static void main(String args[])
	{
		//雙引號內容物是文字，沒有的是數字會運算
		System.out.println(10+20); //數字
		System.out.println("10+20"); //文字
		System.out.println("10"+"20");// 文字
		System.out.println("10"+20);//文字
		System.out.println(10+"20");//文字 
		System.out.println(10+20+30); // 數字
		System.out.println("10+20+30");//文字
		System.out.println("10"+20+30); //文字
		System.out.println("10"+(20+30)); //文字但括弧內的會先用數字做運算
		System.out.println("20+30="+(20+30));//前面文字，後面數字算玩，整個又變文字
	}
}