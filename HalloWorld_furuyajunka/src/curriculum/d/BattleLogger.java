package curriculum.d;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BattleLogger {

    private BufferedWriter bw;

    public BattleLogger(String fileName) {
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String message) {
        try {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

