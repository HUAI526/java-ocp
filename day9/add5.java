class add5
{
	public static void main(String[] args) {
		//book b=new book();

		System.out.println(book.pi2);
		//book.pi2=2.3;


		bookStore b=new bookStore();
		book b2=new bookStore();

		System.out.println(b.bookName("java")+"\t"+b.bookPrice(1000));
		System.out.println(b2.bookName("java")+"\t"+b2.bookPrice(2000));
	}
}