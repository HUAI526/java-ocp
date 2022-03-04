class ex3
{
	public static void main(String[] agrs){
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("輸入列數");
		int n=sc.nextInt();
		System.out.println("輸入行數");
		int s=sc.nextInt();
		
		a :
		for(int x=1; x<=n; x++){ 
			//if (x==9) break; //跟下面的break控制不同層
			for(int y=1; y<=s; y++){
				if(y==8) break; //他只能控制目前所在層數,無法往上一層控制
				if(x==9) break a; //可以往上去控制名字為a的那層迴圈
				System.out.print(x+"*"+y+"="+(x*y)+"\t");
			}
				System.out.println();
		}

		/*
		int x1=1;
		for(int y=1; y<=9; y++){
				System.out.print(x1+"*"+y+"="+(x1*y)+"\t");
				}
			System.out.println();
		int x2=2;

		for(int y=1; y<=9; y++){
				System.out.print(x2+"*"+y+"="+(x2*y)+"\t");
				}
			System.out.println();
		*/
	}
}