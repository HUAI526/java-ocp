/* 
Compiler
1->jdk--->如果沒有出處地點優先看java.lang.裡面有沒有
2->再看檔案所在的資料夾中有沒有
*/
class add3{
	public static void main(String[] args) {
		java.lang.Throwable t=new java.lang.Throwable(); //絕對路徑	
		// aka Throwable t=new Throwable(); 只限java.lang底下才有,相對路徑
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//Scanner sc  = new Scanner(System.in); 找不到因為不在java.lang底下
		//除非有先import他所屬的工具包 -->import java.util.Scanner	

	}
}