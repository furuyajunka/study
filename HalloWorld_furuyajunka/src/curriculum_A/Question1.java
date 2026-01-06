package curriculum_A;

public class Question1 {
	public static void main(String[] args) {
 		//Q1,2
		byte byteNum = 10;
		short shortNum = 100;
		int intNum = 1000;
		long longNum = 10000;
		float floutNum = 9.5f;
		double doubleNum = 10.5;
		char letter = 'a';
		String letters = "ハロー";
		boolean isBoolean = true;
		
		//Q3
		System.out.println(byteNum+shortNum+intNum+longNum);
		System.out.println(byteNum*2);
		System.out.println(letter+" "+letters+" "+isBoolean );
		System.out.println(byteNum*3+shortNum+intNum+longNum);
		System.out.println((double)byteNum*shortNum*intNum*longNum);//←1E+10ではなく1.0E10という表記になる
		System.out.println(doubleNum/shortNum);
		System.out.println(byteNum-shortNum);
		
		//Q4
	}
}
	
