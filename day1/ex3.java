class ex3
{
	public static void main(String[] args){
		byte x=10; //定義x=10是數字還是文字
		/*
		byte y=128; 
		128超過byte可以存的範圍 所以類型應該是short以上
		而不是byte 所以類型不合
		
		byte y=(byte) 128; 這樣做會導致資料錯誤
		雖然可以run但實質上他是在跑到底再跑回來
		變成跟原本不同甚至是負數	
		*/
		short y=128;//這樣就會過了

		System.out.println("=======================");

		byte a1=10;
		byte a2=20;
		byte a3=10+20;
		//byte a4=a1+a2; //不過的原因是因為a1,a2是變數,有可能會超過byte
		//a1+a2(byte)-->promotion-->(int)
		// byte a4=a1+a2;//此時a1+a2(int) 所以左右不同
		int a4=a1+a2; //也可以 byte a4=(byte)a1+a2; 但不建議

		float f1=(float)10.12; //從double轉成float
		float f2=10.12f; //float 
		float f3=10.12F; //Float
		//F,f這兩個都是直接抓，不同意思差別極大

		double d1=10.12;

		char c='w';// “ ”這是字串 ‘ ’這是字元只能一個字
		char c2='嗨'	;

		System.out.println(c);
		System.out.println(c2);

		char c3=23; //因為有內建數字轉成字元（ASCII表格） 所以會成功
	}
}