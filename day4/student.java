class student
{
	String name;
	int chi;
	int eng;
	int math;
	int sum;

	student(String name, int chi, int eng,int math) //前面加上void是另一個意思 就不是建構式(constructors)
	{
		this.chi=chi;
		this.math=math;
		this.eng=eng;
		this.sum=this.chi+this.math+this.eng;
		//int chi = 60;//只會存在於這個函數內(區域性)，離開函數之後只會遵照全域性的宣告
		//chi = 60; //會因為這個函數中沒有定義而往外去找，進而改變chi的值
		//System.out.println("hello new student");
	}
	student(int chi,int eng){}
	student(String name,int chi){}
	student(int chi,String name){}
	//student(int x,int y){}
	//只要輸入時可以找到各自對應的輸入點就不會出錯
	//第一行跟第四行一樣兩個都是int會導致系統不知道要選擇哪個

	void show()
	{
		System.out.println("名字:"+name+
			"\t國文:"+chi+"\t英文:"+eng+"\t數學:"+math+
			"\t總分:"+sum);
	}
}