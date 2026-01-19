package curriculum.c;

public class Player {
    private int hand;

    public Player(String string, int hp, int at, int sp) {
    	
	}

	public void setHand(int hand) {
        this.hand = hand;
    }

    public int getHand() {
        return hand;
    }

    public String getHandName() {
        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "不正な手";
        }
    }
}
