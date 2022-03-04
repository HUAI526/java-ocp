class ex3
{
	public static void main(String[] args) {
		int[][][] x=new int[2][2][3];//新增一個記憶體分組成2-->2-->3
		System.out.println(x);// 第一層
		System.out.println(x[0]);// 第二層
		System.out.println(x[0][0]);// 第三層
		System.out.println(x[0][0][0]);// 值
		System.out.println("========================");
		System.out.println(x[1]);// 第二層
		System.out.println(x[1][1]);// 第三層

		System.out.println("========================");


		//分層找值
		for(int i=0;i<x.length;i++)//第二層
		{	
			System.out.println(x[i]);

			for(int j=0;j<x[i].length;j++)//第三層
			{	
				System.out.println("\t"+x[i][j]);


				for(int k=0;k<x[i][j].length;k++)//值
				{
					System.out.println("\t\t"+x[i][j][k]);
				}
			}
		}

		System.out.println("========================");
		
		//他複製值去做輸出

		for(int[][] o:x) //第二層
		{	
			System.out.println(o);
			for(int[] u:o) //第三層
			{	
				System.out.println("\t"+u);
				for(int v:u) //值
				{
					System.out.println("\t\t"+v);
				}
			}
		}

	}
}