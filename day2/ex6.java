class ex6
{
	public static void main(String[] args){
		int x=10;
		int y=5;

		System.out.println(x>=0 && y>=0); // boolean值
		System.out.println(x>=0 & y>=0); // 值-->轉2進位-->計算

		//System.out.println(5&&2); 有問題因為兩邊應該要是布林值
		System.out.println(5&2); //兩邊都要相同才是true
		System.out.println(5|2); //其中一邊相同
		System.out.println(5^7); //一定要兩邊不同才是true
		System.out.println(~2);
		System.out.println(~(-4));
		System.out.println(5>>2); 
		//用2進位制向右移動兩格並用０補成八個
		// 5 -> 0000,0101 --> 0000,0001 -> 1
		System.out.println(5<<2);
		//用2進位制向左移動兩格並用０補成八個
		// 5 -> 0000,0101 --> 0001,0100 -> 20

		int op1=5;
		int op2=2;

		op1>>=op2; // aka op1=op1>>op2;
		System.out.println(op1); // aka System.out.println(5>>2);

		String d="asdfghjkl";
		System.out.println(d);

		String g="誒加進來了誒\"123";
		System.out.println(g);

		String l="誒加進來了\\誒\"123";
		System.out.println(l);

		String p="誒加進來了\\誒\"123\t 啊啊啊\n啊啊";
		System.out.println(p);


	}
}