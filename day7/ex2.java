class ex2
{
	public static void main(String[] args) {
		/*
		int[] x=new int[3];//x[0],x[1],x[2]
		int[] y=new int[3];//y[0],y[1],y[2]
		*/

		//int[][] x=new int[2][3];
		//int[][]是告訴他接下來我要做2階段分組 x=new建立新的記憶體
		//int[2][3]是分兩組每組三個

		int[][] x=new int[][]
		{
			{10,20,30},
			{40,50,60}
		};

		System.out.println(x);
		System.out.println(x[0]);//這會顯示分類的記憶體位置
		System.out.println(x[0][0]);//這是值,代表0那區的第0位置的值
		System.out.println(x[1]);//這會顯示分類的記憶體位置

		System.out.println(x.length);//這層的下面分成2個,所以是2
		System.out.println(x[0].length);//這層下面分成3個,所以是3

		//System.out.println(x[0][0].length);這是值沒辦法找,下面也沒東西

		System.out.println("===============================");

		for(int i=0;i<x.length;i++)
		{	
			System.out.println(x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("x["+i+"]["+j+"]="+x[i][j]);
			}
		}

		System.out.println("===============================");

		for(int[] o:x)
		{
			System.out.println(o);
			for(int u:o)
			{
				System.out.println(u);
			}
		}


	}
}