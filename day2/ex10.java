class ex10
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int chi,eng,mat,sum;

		System.out.println("請輸入國文分數");
		chi=sc.nextInt();

		System.out.println("請輸入英文分數");
		eng=sc.nextInt();

		System.out.println("請輸入數學分數");
		mat=sc.nextInt();
        
        sum=chi+eng+mat;
        

		if (sum >= 200)
		{
			if(eng>=75) {
				System.out.println("通過恭喜錄取");}
			else{
				System.out.println("未通過，因為你英文未超過75");}
		}	
		
		else {
			System.out.println("未通過，因為你總分未超過200");}
		
	}
}