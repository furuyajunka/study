package curriculum.c;

import java.util.Random;

public class Cpu {
	private int hand;
	private Random random = new Random();

	public void generateHand() {
		hand = random.nextInt(3);
	}
	
    public int getHand() {
        return hand;
    }

    public String getHandName() {
        return HandUtil.getHandName(hand);
    }	
}
