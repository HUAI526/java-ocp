class add3
{
	public static void main(String[] args) {
		
		//int[] x=new int[3];
		//double[] x=new double[3];
		boolean[] x=new boolean[3];
		//char[] x=new char[3];
		//String[] x=new String[3]; //cladd-->java.lang.string
		//Integer[] x=new Integer[3]; //class-->java.lang.Integer
		//Double[] x=new Double[3];

		System.out.println(x);
		//System.out.println(x[0]);
		//System.out.println(x[1]);
		//System.out.println(x[2]);

		for(int i=0;i<3;i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}


		System.out.println("=====================================");

		//for-each ; enhance --->copy

		//for(int o:x)// int o=x[0] 去複製Ｘ的輸出
		//for(double o:x)
		for(boolean o:x)
		{
			System.out.println(o);
		}

	}
}