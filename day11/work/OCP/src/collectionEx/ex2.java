package collectionEx;

import java.util.ArrayList;

public class ex2 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(34);
		
		System.out.println(x);
		x.add(100);
		System.out.println(x);
		
		for(Integer o:x)
		{
			System.out.println(o+"x");
		}

	}

}
