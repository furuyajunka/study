package curriculum_A;

public class Question1 {
	public static void main(String[] args) {
 		//Q1,2
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floutNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = "null";
		boolean isBoolean = false;
		
		//Q3
		System.out.println(byteNum+shortNum+intNum+longNum);
		System.out.println(byteNum*2);
		System.out.println(letter+" "+letters+" "+isBoolean );
		System.out.println(byteNum*3+shortNum+intNum+longNum);
		System.out.println((double)byteNum*shortNum*intNum*longNum);
		System.out.println(doubleNum/shortNum);
		System.out.println(byteNum-shortNum);
		
		//Q4
		String name = "山田太郎";
		System.out.println("こんにちは"+name+"さん！");
		
		// Q5
		int age = 25;
		System.out.println("年齢:"+age+"歳");
		
		// Q6
		int num1 = 10;
		int num2 = 5;
		int sum =(num1+num2);
		System.out.println(sum);
		
		// Q7
		int score = 80;
		score = score + 20;
		System.out.println("最終スコア:" + score);
		
		//Q8		
		double price = 99.99;
		int shortprice = (int) price;
		System.out.println("整数価格:"+shortprice);
		
		// Q9
		String numStr = "123";
		int number = Integer.parseInt(numStr);
		System.out.println(number + 10);
		
		// Q10
		int num = 50;
		String str = String.valueOf(num);
		System.out.println("得点：" + str + "点");
		
		// Q11 
		int a = 10;
		int b = 20;
		boolean result = ( a < b );
		System.out.println(result);
		
		// Q12  
		int x = 15;
		String result1 = ( x >= 10 )? "OK" : "NG";
		System.out.println(result1);


		// Q13
		String text = "私はJavaが好きです。Javaは楽しい！";
		String text1 = text.replace("Java", "Python");
		System.out.println(text1);
	}
}
	
