package curriculum.b;

public class Question5 {
	public static void main(String[] args) {
		
		//Q1
		helloWorld();
		
		//Q2
		int num = 10;
		int result = doubleValue(num);
		System.out.println(num + "を2倍すると" + result + "です" );
		
		//Q3
		int num1 = 7;
		int num2 = 10;
		System.out.println(num1 + "は" +(isEven(num1)? "偶数" : "奇数")+"です");	
		System.out.println(num2 + "は" +(isEven(num2)? "偶数" : "奇数")+"です");
	}
	
	
	
		//Q1
		public static void helloWorld() {
			System.out.println("Hello,World!");
		}
		
		//Q2
		public static int doubleValue(int num) {
			return num*2;
		}
		
		//Q3
		public static boolean isEven(int num) {
			return num%2 == 0;
		}
	}

