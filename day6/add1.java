class add1
{
	public static void main(String[] args) {
		//當FV class有寫上static之後 資料會在最後一次更改後全部相同
		//FV.pv=50000;//這時候是50000
		System.out.println(FV.companyName());
		FV.Title();
		FV.setpv(50000);


		/*
		FV f1=new FV(10000,0.001,5);//這時候是10000,上面也被更改
		FV f2=new FV(20000,0.002,4);//這時候是20000,上面也被更改
		FV f3=new FV(30000,0.003,3);//這時候是30000,上面也被更改
		FV f4=new FV(40000,0.004,2);//這時候是40000,上面也被更改
		*/

		//  =============上面算式優化=================
		//這時候因為pv都是使用相同數就所以就先提出來,寫在class FV裡面要用再帶入	
		FV f1=new FV(0.001,5);
		FV f2=new FV(0.002,4);
		FV f3=new FV(0.003,3);
		FV f4=new FV(0.004,2);

		f1.show();
		f2.show();
		f3.show();
		f4.show();

		System.out.println("=============================================");
		
		FV.Title();
		FV.setpv(10000);

		//FV.pv=50000;//stats->全部物件用同一個->不是由new產生->class產生->類別類
		//f4.r=0.016;
		f4.setr(0.016);
		f1.show();
		f2.show();
		f3.show();
		f4.show();
		
	}
}
