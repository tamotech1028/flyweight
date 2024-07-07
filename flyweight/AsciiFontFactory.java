package flyweight;

import java.util.HashMap;
import java.util.Map;

public class AsciiFontFactory {

    public static AsciiFontFactory asciiFontFactory = new AsciiFontFactory();
    private Map<String, AsciiFont> asciiFontMap = new HashMap<>();

    private AsciiFontFactory() {}

    public static AsciiFontFactory getInstance() {
        return asciiFontFactory;
    }

    public synchronized AsciiFont getFont(String id) {
        if (asciiFontMap.containsKey(id)) {
            System.out.println("メモリからロードします");
            return asciiFontMap.get(id);
        }
        System.out.println("新しくインスタンスを作成します");
        AsciiFont target = new AsciiFont(id);
        asciiFontMap.put(id, target);
        return target;
    }
}