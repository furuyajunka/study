package curriculum.b;

import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		
		//Q1　完
		int[] numbers = {1,2,3,4,5};
		for (int number:numbers) {
			System.out.println(number);
		}
		
		//Q2　完
		int[] numbers1 = {10,20,30,40,50};
		for(int i= numbers1.length -1 ; i>=0 ; i--) {
			System.out.println(numbers1[i]);
		}
		
		//Q3　完
		int[] numbers2 = {3,5,7,9,11};
		int sum = 0;
		for (int num : numbers2) {
			sum += num;
		}
		System.out.println(sum);
		
		//Q4　完
		int[] numbers3 = {12,7,9,21,5,18};
		int max = numbers3[0];
		int min = numbers3[0];
		for (int i= 1; i<numbers3.length;i++) {
			max = (numbers3[i] > max )? numbers3[i] : max ;
			min = (numbers3[i] < min )? numbers3[i] : min ;
		}
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
		
		//Q5　完
		int[] numbers4 = {1,2,3,4,5};
		for (int num : numbers4 ) {
			System.out.println( num*2 );
		}
		
		//Q6　完
		int[] numbers5 = {4,7,10,15,20};
		Scanner scanner = new Scanner (System.in);
		System.out.println("数値を入力してください");
		int num = scanner.nextInt();
		boolean a = false; // 
		for (int i = 0; i < numbers5.length; i++) { 
			if (numbers5[i] == num ) {
				a = true ; //number5の中を全部調べて数値が一致したら真にする
				break;
			}
		}
		System.out.println(a? "\"入力した値\"" + "は配列に含まれています" : "含まれていません");
		
		//Q7
		int[][] array = {{1,2},{3,4},{5,6}};
		for (int i=0 ; i<array.length ; i++) {
			for (int j=0 ; j<array[i].length ; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		//Q8
		int[][] array1 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int sum1 = 0;
		for (int i=0 ; i < array1.length ; i++) {
			for (int j=0 ; j<array1[i].length ; j++) {
				sum1 += array1[i][j];
			}
		}
		System.out.println(sum1);
		
		//Q9
		int[][] array2 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		int max1 =array2[0][0];
		int min1 =array2[0][0];
		for (int i=0 ; i<array2.length;i++) {
			for(int j=0 ; j<array2[i].length; j++) {
			max1 = (array2[i][j] > max1 )? array2[i][j] : max1 ;
			min1 = (array2[i][j] < min1 )? array2[i][j] : min1 ;
			}
		}
		System.out.println("最大値は" + max1);
		System.out.println("最小値は" + min1);
		
		//Q10
		int[][][] array3 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		for (int i=0 ; i<array3.length ; i++ ) {
			for (int j=0 ; j<array3[i].length ; j++) {
				for (int k=0 ; k<array3[i][j].length ; k++) {
					System.out.print(array3[i][j][k]);
				}
			}
		}
		
	}
}
