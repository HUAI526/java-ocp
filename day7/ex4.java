class ex4
{
	public static void main(String[] args) {
		/*
		int[][] x=new int[2][];//這是因為值兩遍的數量不同所以分開定義
		x[0]=new int[4];//在x[0]這邊有4個值
		x[1]=new int[3];//在x[1]這邊有3個值
		*/
		int[][] x=new int[][]
		{
			{10,20,30,40},
			{50,60,70}
		};

		//檢查
		System.out.println(x);//看看第一層分成幾個
		System.out.println(x[0].length);//看看x[0]下面有幾個值
		System.out.println(x[1].length);//看看x[1]下面有幾個值

		System.out.println("====================");

		for(int i=0;i<x.length;i++) //這邊跑x[0]
		{	
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)//跑值
			{
				System.out.println("\tx["+i+"]["+j+"]="+x[i][j]);
			}
		}

		System.out.println("===============================");

		for(int[] o:x)
		{
			System.out.println(o);
			for(int u:o)
			{
				System.out.println("\t"+u);
			}
		}
	}
}