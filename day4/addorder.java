/*
Compiler--->變數
1-call by reference
	primitive type--->一般變數
	class文件--->物件類型變數
2-call by value->initialize內容
	primitive type-->值
	class文件--->new決定;產生
*/
class addorder
{
	public static void main(String[] args) {
		Order o1=new Order();
		Order o2=new Order();

		System.out.println(o1);
		System.out.println(o1.name);
		System.out.println(o1.ruler);
		System.out.println(o1.pen);
		System.out.println(o1.x);
		System.out.println(o1.y);

		System.out.println(o2);
		System.out.println(o2.name);
		System.out.println(o2.ruler);
		System.out.println(o2.pen);
		System.out.println(o2.x);
		System.out.println(o2.y);

	}
}
