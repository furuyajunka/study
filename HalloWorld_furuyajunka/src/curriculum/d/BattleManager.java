package curriculum.d;

import java.util.Random;

public class BattleManager {

    private Player player;
    private Daemon daemon;
    private BattleLogger logger;
    private Random rand = new Random();

    public BattleManager(Player player, Daemon daemon, BattleLogger logger) {
    	this.player = player;
        this.daemon = daemon;
        this.logger = logger;
    }

    public void startBattle() {

        logger.write("=== Battle Start ===");

        Character first = decideFirst();
        Character second = (first == player) ? daemon : player;

        logger.write("先攻：" + first.getName());

        while (player.isAlive() && daemon.isAlive()) {

            first.attack(second);
            logger.write(first.getName() + " の攻撃 → "
                    + second.getName() + " HP:" + second.getHp());

            if (!second.isAlive()) break;

            second.attack(first);
            logger.write(second.getName() + " の攻撃 → "
                    + first.getName() + " HP:" + first.getHp());
        }

        logger.write("勝者：" +
                (player.isAlive() ? player.getName() : daemon.getName()));

        logger.write("=== Battle End ===");
    }

    private Character decideFirst() {
        if (player.getSp() > daemon.getSp()) return player;
        if (player.getSp() < daemon.getSp()) return daemon;
        return rand.nextBoolean() ? player : daemon;
    }
}
