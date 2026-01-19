package curriculum.c;

public class Player {
    private int hand;

	public void setHand(int value) {
        this.hand = hand;
    }
    public int getHand() {
        return hand;
    }
    
    public String getHandName() {
    	return HandUtil.getHandName(hand);
    }
}
