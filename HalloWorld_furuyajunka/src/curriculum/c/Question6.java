package curriculum.c;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Player player = new Player();
			Cpu cpu = new Cpu();
			
			boolean isWin = false;
			
			while (!isWin) {
				System.out.print("グー(0), チョキ(1), パー(2) を入力:");
				int input = scanner.nextInt();
				
				//入力チェック
				if (!HandUtil.isValidHand(input)) {
					System.out.println("0～2の数字を再入力してください");
					System.out.println();
					continue;
				}
				
				player.setHand(input);
				cpu.generateHand();
				
				System.out.println("あなたの手" + player.getHandName());
				System.out.println("CPUの手" + cpu.getHandName());
				
				int result =(player.getHand() - cpu.getHand() + 3 ) % 3 ;
				
				if (result == 0) {
					System.out.println("あいこです");
				} else if(result == 1){
					System.out.println("あなたの負けです");
				} else if(result == 2) {
					System.out.println("あなたの勝ちです");
					isWin = true;
				} 
				
			}
			
		scanner.close();	
	}
}
