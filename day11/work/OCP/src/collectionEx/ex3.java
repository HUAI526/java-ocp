package collectionEx;

import java.util.ArrayList;

class student
{
	private String name;

	public student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class A extends student
{
	public A(String name)
	{
		super(name);
	}
}
public class ex3 {

	public static void main(String[] args) {
		student[]  s=new student[3];
		s[0]=new Aa("aaa");
		
		ArrayList<student>  s2=new ArrayList();
		s2.add(new A("aaa"));
		s2.add(new A("a"));

	}

}
