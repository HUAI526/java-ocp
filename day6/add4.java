class add4
{
	public static void main(String[] args) {
		//new給的初始值
		/*
		int[] x=new int[3]; //這邊有產生x[0]=0,x[1]=0,x[2]=0然後才跑下面
		x[0]=10;
		x[1]=20;
		x[2]=30;
		*/

		int[] x=new int[]{10,20,30,40,50,60}; //假如中括號沒有給值,就要用大括號加進去
		//int[] x={10,20,30};
		System.out.println(x);

		System.out.println(x.length);//數有幾個
		//System.out.println(x[0]);
		//System.out.println(x[1]);
		//System.out.println(x[2]);


		
		for(int i=0;i<3;i++)//這邊是選擇一部份而已
		//如果想全抓可以把i<3改成i<x.length
		{
			System.out.println(x[i]);
		}	

		System.out.println("=================");

		for(int o:x)//這邊是我全都要
		{
			System.out.println(o);
		}
		
	}
}