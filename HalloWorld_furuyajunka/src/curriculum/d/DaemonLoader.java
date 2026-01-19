package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DaemonLoader {

    public Daemon load(String filename) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String name = br.readLine();
            int hp = Integer.parseInt(br.readLine());
            int at = Integer.parseInt(br.readLine());
            int sp = Integer.parseInt(br.readLine());

            return new Daemon(name, hp, at, sp);

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("daemon_status.txtの読み込みに失敗しました", e);
        }
    }
}
