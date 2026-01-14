package curriculum.b;

import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		
		//Q1　
		int[] numbers = {1,2,3,4,5};
		for (int number:numbers) {
			System.out.println(number);
		}
		
		//Q2　
		int[] reverseNumbers = {10,20,30,40,50};
		for(int i= reverseNumbers.length -1 ; i>=0 ; i--) {
			System.out.println(reverseNumbers[i]);
		}
		
		//Q3　
		int[] oddnumbers = {3,5,7,9,11};
		int sum = 0;
		for (int num : oddnumbers) {
			sum += num;
		}
		System.out.println(sum);
		
		//Q4　
		int[] valuesForMinMax = {12,7,9,21,5,18};
		int max = valuesForMinMax[0];
		int min = valuesForMinMax[0];
		for (int i= 1; i<valuesForMinMax.length;i++) {
			max = (valuesForMinMax[i] > max )? valuesForMinMax[i] : max ;
			min = (valuesForMinMax[i] < min )? valuesForMinMax[i] : min ;
		}
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
	
		//Q5　
		int[] orderedNumber = {1,2,3,4,5};
		for (int num : orderedNumber ) {
			System.out.println( num*2 );
		}
		
		//Q6　
		int[] randomNumbers = {4,7,10,15,20};
		Scanner scanner = new Scanner (System.in);
		System.out.println("数値を入力してください");
		int num = scanner.nextInt();
		boolean found = false;  
		for (int i = 0; i < randomNumbers.length; i++) { 
			if (randomNumbers[i] == num ) {
				found = true ; //number5の中を全部調べて数値が一致したら真にする
				break;
			}
		}
		System.out.println(found?  num + "は配列に含まれています" : num + "は配列に含まれていません");
		
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
		int[][] matrix = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		int Max =matrix[0][0];
		int Min =matrix[0][0];
		for (int i=0 ; i<matrix.length;i++) {
			for(int j=0 ; j<matrix[i].length; j++) {
			Max = (matrix[i][j] > Max )? matrix[i][j] : Max ;
			Min = (matrix[i][j] < Min )? matrix[i][j] : Min ;
			}
		}
		System.out.println("最大値は" + Max);
		System.out.println("最小値は" + Min);
		
		//Q10
		int[][][] array3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		for (int i=0 ; i<array3D.length ; i++ ) {
			for (int j=0 ; j<array3D[i].length ; j++) {
				for (int k=0 ; k<array3D[i][j].length ; k++) {
					System.out.print(array3D[i][j][k]);
				}
			}
		}
		scanner.close();
	}
}
