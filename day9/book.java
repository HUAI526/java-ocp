interface book//abstract class book的意思
{
	public static final double pi=3.14;
	double pi2=314;//在介面裡面一定要給初始值,前面三個值系統會自動給你

	//book(){} //介面不允許建構式也不行new

	public abstract String bookName(String name);
	double bookPrice(double price);//public abstract系統自動加
}