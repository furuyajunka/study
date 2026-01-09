package curriculum.b;

import java.util.Random;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		
		//Q1
		for (int i=1 ; i<=10 ; i++ ) {//(初期化式 ; 条件式 ; 変化式)
			System.out.println(i);
		}
		
		//Q2
		for (int i=1 ; i<=20 ; i++) {
			if( i%2 != 0 ) {
				continue; //偶数ではない時、処理をスキップする
			}
			System.out.println(i);
		}
		
		//Q3
		for (int i=10 ; i>=1 ; i-- ) {
			System.out.println(i);
		}
		
		//Q4
		int sum =0;
		for (int i=1 ; i<=100 ; i++ ) {
			sum += i; //1から100まで足す
		}
		System.out.println(sum);
		
		//Q5
		for (int i=1 ; i<=5 ; i++) { //高さ
			for (int j=1 ; j<=i; j++) { //1行で何個出すか
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Q6
		int i=1;
		while ( i <=10 ) {
			System.out.println(i);
			i++;
		}
		
		//Q7
		int j=2 ;
		while ( j<=20 ) {
			System.out.println(j);
			j +=2;
		}
		
		//Q8
		int k=10 ;
		while ( k>=1 ) {
			System.out.println(k);
			k--;
		}
		
		//Q9
		int l=1;// カウント数
		int sum1 = 0;// 合計を保存する
		while (l<=100) {
			sum1 +=l;
			l++;
		}
		System.out.println(sum1);
		
		//Q10
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください。");
		int num =scanner.nextInt();
		while ( num != 0 ) {
			System.out.println("再度数値を入力してください。");
			num =scanner.nextInt(); //再度数字をスキャンする
		}
		System.out.println("終了しました。");		
		
		//Q11
		for (int a =1 ; a<10 ; a++ ) {
			for (int b =1 ; b<10 ; b++ ) {
				String A = String.format("%02d", a);	
				String B = String.format("%02d", b);
				String AB = String.format("%02d", a*b);
				System.out.print(A + " * " + B + " = " + AB + " || ");
			}
			System.out.println();
		}
		
		//Q12
		Random random = new Random();  //ランダムな数を割り振れるようにする
		
		System.out.println("商品名を「、」区切りで入力してください");
		String input = scanner.nextLine();  //コンソールから入力された文字を読み取る
		String[] products = input.split("、");  //読み取った文字を「、」で区切る
		
		int stock = random.nextInt(12);//0～12でランダムな数を残台数にする
		int TVstock = random.nextInt(12);
		int displaystock = 11-TVstock;
		for (String product : products ) {
			switch (product) {
			case"パソコン": case"冷蔵庫": case"扇風機": case"加湿器":case"洗濯機":
				System.out.println(product+"の残り台数は"+stock+"台です");
				break;
				
			case"テレビ": case"ディスプレイ": 
				int stock1 = product.equals("テレビ")? TVstock : displaystock;
				System.out.println(product+"の残り台数は"+stock1+"台です");	
				break;
				
			default:
				System.out.println(product+"は指定の商品ではありません");				
			}
		}
		scanner.close();
	}
}
	

