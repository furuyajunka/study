package curriculum.c;

public class HandUtil {
	public static String getHandName(int hand) {
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
    public static boolean isValidHand(int hand) {
        return hand >= 0 && hand <= 2;
    }

}
