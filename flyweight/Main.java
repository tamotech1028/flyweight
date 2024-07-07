package flyweight;

public class Main {
    public static void main(String[] args) {
        
        AsciiFontFactory factory = AsciiFontFactory.getInstance();
        AsciiFont A = factory.getFont("large_A");
        System.out.println(A.getFont());

        AsciiFont B = factory.getFont("large_B");
        System.out.println(B.getFont());

        AsciiFont a = factory.getFont("small_a");
        System.out.println(a.getFont());

        AsciiFont b = factory.getFont("small_b");
        System.out.println(b.getFont());

        AsciiFont A2 = factory.getFont("large_A");
        System.out.println(A2.getFont());

        AsciiFont B2 = factory.getFont("large_B");
        System.out.println(B2.getFont());

        AsciiFont a2 = factory.getFont("small_a");
        System.out.println(a2.getFont());

        AsciiFont b2 = factory.getFont("small_b");
        System.out.println(b2.getFont());


        // AとA2はFactoryを介しているため同じインスタンスでtrue
        System.out.println(A == A2);

        // Factoryを介さずAsciiFontのインスタンスを生成
        AsciiFont A3 = new AsciiFont("large_A");
        // 同じ内容のオブジェクトを重複して生成しているためfalse
        System.out.println(A == A3);
    }
}