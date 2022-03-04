class addMember
{
	public static void main(String[] args) {
		member m=new member("abc","uuu");
		System.out.println(m.name+"\t"+m.username);
		m.name="asdfg";
		m.username="qwe";
	}
}