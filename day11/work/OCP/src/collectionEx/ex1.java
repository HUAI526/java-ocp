package collectionEx;

class book<E,T>//限定具有object類型
{
	E x;
	T y;
}

public class ex1 {

	public static void main(String[] args) {
		System.out.println("hello");
		/*book<Integer,Double> b=new book<Integer, Double>();
		book<Double,Double> b2=new book<Double, Double>();*/
		
		book<Integer,Double> b=new book<>();
		book<Double,Double> b2=new book<>();
		b.x=10;
		b.y=10.2;
		
		b2.x=10.5;
		b2.y=10.2;
		

	}

}
