class ex1
{
	public static void main(String[] args) {
		int[] x=new int[5];
		//x[5]=100;//在編譯的過程中[]放int就會過了，但在run的時候會出問題
		System.out.println(x);
		x=new int[10];//這邊新增new x會重新產生記憶體區塊 上面的x資料就會被回收消失
		x[3]=100;
		System.out.println(x);
		System.out.println(x[3]);

		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}
	}
}