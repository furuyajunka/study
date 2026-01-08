package curriculum.b;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
		//Q1
		int score = 75;
		if (score >= 60){System.out.println("合格です！");}
		
		//Q2
		int age = 25;
		if (20 <= age && age <= 30){
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}
		
		//Q3
		int age1 = 18;
		if (age1 >= 20) {
			System.out.println("成人です");
		} else if (age1 >= 13 && age1 <= 19 ){
			System.out.println("ティーンエイジャーです");
		} else if (age1 <= 12) {
			System.out.println("子供です");
		}
		
		//Q4
		int x = 30 , y =15 , z = 50 ;
		if (x > y && x > z) {
			System.out.println(x);
		}else if (y > x && y > z){
			System.out.println(y);
		}else {
			System.out.println(z);
		}
		
		//Q5
		int num = -1;
		if ( num > 0 ) { //0より大きい
			System.out.println("正の数です");
		} else if ( num < 0 ) { // 0より小さい
			System.out.println("負の数です");
		} else if ( num == 0 ){ //　＝0
			System.out.println("0です");
		}
		
		//Q6
		int value = 23;		
		String result = (value % 2 == 0)? "偶数です" : "奇数です";
		System.out.println( result );
		
		//Q7
		int score1 = 69;
		if ( score1 >= 90 ) { 
			System.out.println("優");
		} else if ( score1 > 70 ){
			System.out.println("良");
		} else if ( score1 > 50){
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		//Q8
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの名前を入力してください");
		String name =scanner.nextLine();
		System.out.println("こんにちは、"+name+"さん！");
		if (name == null || name.trim().isEmpty()) {
			System.out.println("入力が無効です");
		}
		
		//Q9
		int day = 7 ;
		switch ( day ) {
		case 1 :
			System.out.println("月曜日");
			break;
		case 2 :
			System.out.println("火曜日");
			break;
		case 3 :
			System.out.println("水曜日");
			break;
		case 4 :
			System.out.println("木曜日");
			break;
		case 5 :
			System.out.println("金曜日");
			break;
		case 6 :
			System.out.println("土曜日");
			break;
		case 7 :
			System.out.println("日曜日");
			break;
		default :
			System.out.println("無効な値です");
		}
		
		//Q9
		int month = 1;
		switch ( month ) {
		case 1 : case 2 : case 12 :
			System.out.println("冬");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("春");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("夏");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("秋");
			break;
		default : 
			System.out.println("無効な月です");
		}
		scanner.close();
		
	}
}

