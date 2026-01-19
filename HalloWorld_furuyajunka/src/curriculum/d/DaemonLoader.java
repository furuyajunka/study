package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;

public class DaemonLoader {

    public Daemon load(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String name = br.readLine();
            int hp = Integer.parseInt(br.readLine());
            int at = Integer.parseInt(br.readLine());
            int sp = Integer.parseInt(br.readLine());

            return new Daemon(name, hp, at, sp);

        } catch (Exception e) {
            throw new RuntimeException("Daemonの読み込みに失敗しました", e);
        }
    }
}
