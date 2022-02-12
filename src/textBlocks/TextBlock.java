package textBlocks;

public class TextBlock {
    public static void main(String[] args) {
        String name = "Ani";
        String text = String.format("""
                Hello
                World!
                -----
                My name is %s.
                """, name);
        System.out.println(text);
    }
}
