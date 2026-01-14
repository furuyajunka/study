package curriculum.b;

public class Animal {
    // フィールド（カプセル化のためprivateで宣言）
    private String name;
    private double length;
    private int speed;

    // 名前のsetter
    public void setName(String name) { // 引数とフィールド名が同じ場合、thisを使ってフィールドを指定します
        this.name = name;
    }
    // 名前のgetter
    public String getName() {
        return this.name;
    }

    // 体長のsetter
    public void setLength(double length) {
        this.length = length;
    }
    // 体長のgetter
    public double getLength() {
        return this.length;
    }

    // 速度のsetter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // 速度のgetter
    public int getSpeed() {
        return this.speed;
    }

}
