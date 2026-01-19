package curriculum.d;

public abstract class Character {

    protected String name;
    protected int hp;
    protected int at;
    protected int sp;

    protected Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public void attack(Character target) {
        target.hp -= this.at;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }

    public int getSp() {
        return sp;
    }

    public int getHp() {
        return hp;
    }
}
