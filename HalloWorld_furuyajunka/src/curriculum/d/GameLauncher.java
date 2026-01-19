package curriculum.d;

import java.util.Random;

public class GameLauncher {

    public void start() {

        Player player = createPlayer();
        Daemon daemon = new DaemonLoader().load("daemon_status.txt");
        BattleLogger logger = new BattleLogger("battle_log.txt");

        BattleManager battle = new BattleManager(player, daemon, logger);
        battle.startBattle();
        logger.close();
    }

    private Player createPlayer() {
        Random rand = new Random();

        int hp = rand.nextInt(51) + 50;
        int at = rand.nextInt(11) + 10;
        int sp = rand.nextInt(11) + 5;

        return new Player("Player", hp, at, sp);
    }
}


