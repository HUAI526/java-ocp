class ex1
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("會員等級:\n1)VIP\n2)金卡\n3)銀卡\n4)普通會員");
		System.out.println("input");
		
		//int n=sc.nextInt();
		//byte n=1;
		//String n="第一名"
		char n='A';
		
		switch(n)
		{
			//case 1:
			//case "第一名":
			case 'A':
				System.out.println("VIP");
				break;
			//case 2:
			//case "第二名":
			case 'B':
				System.out.println("金卡");
				break;
			//case 3:
			//case "第三名":
			case 'C':
				System.out.println("銀卡");
				break;
			//case 4:
			//case "第四名":
			case 'D':
				System.out.println("普通會員");
				break;

			default:
				System.out.println("全部皆不合");	
		}
	}
}