class student
{
	void show()
	{

	System.out.println("hello java");
	
	}
}

class add1
{	
	public static void main(String[] args) {

		/*student s=new student();  
		s.show(); //這邊呼叫的都是同一個記憶體位置相同
		s.abc();  //這邊呼叫的都是同一個記憶體位置相同
		*/

		//System.out.println(new student());
		//System.out.println(new student());//.show(); 
		//System.out.println(new student());//.abc();
		//這邊邊呼叫的是不通的雖然名稱相同但記憶體位置不同

		new student().show();

	}
}