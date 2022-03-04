import java.util.InputMismatchException;
class ex1
{
	public static void main(String[] args) {
		int[] x=new int[3];

		java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("請輸入索引：");
		

		try
		{	
			int n=sc.nextInt();
			x[n]=100;//new java.lang.ArrayIndexOutOfBoundsException();

			System.out.println("請輸入分母");

			int m=sc.nextInt();
			System.out.println();

			System.out.println("x["+n+"]/"+m+"="+(x[n]/m));

			for(int i=1;i<=10;i++)
				{
					System.out.println("i="+i+"\thello");
				}
		}

		catch(ArrayIndexOutOfBoundsException | InputMismatchException | ArithmeticException e)
		//老大不能放進去因為他們三個跟RuntimeException有關係
		{
			System.out.println("需要0~2 or 需要int or 分母不可為0");
			e.printStackTrace();
		}
		/*
		catch(ArrayIndexOutOfBoundsException e)//ArrayIndexOutOfBoundsException e=?
		{
			System.out.println("需要0~2");
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			System.out.println("需要int");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("分母不可為0");
			e.printStackTrace();
		}
		catch(RuntimeException e)//這個是上面三個的老大,所以最好寫在下面,除了上面三個以外的錯誤就會出現在這裡
		//如果寫在那三個上面的話,因為他是老大所以會把所有錯誤都拿走,造成另外三個沒東西可以用
		{
			System.out.println("重填");
			e.printStackTrace();
		}
		*/

		finally//不管怎樣都要執行
		{
			for(int i=1;i<=10;i++)
				{
					System.out.println("i="+i+"\thello");
				}
		}
	}
}