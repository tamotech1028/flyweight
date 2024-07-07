package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AsciiFont {

    private final String id;
    private final String font;

    public AsciiFont(String id) {
        this.id = id;
        this.font = readFont(this.id);
    }

    public String getFont() {
        return font;
    }

    // 文字ファイルの内容をStringに変換
    public String readFont(String id) {
        String filePath = "./stamp/" + id + ".txt"; // ファイルのパスを指定する

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            return "";
        }
    }
}