package nl.openweb.pizza.jdk;

public class TextBlocks {

    private static final String JSON_TEXT = """
            {
                "name": "Dave"
                "job": "developer"
            }
            """;

    public static void main(String[] args) {
        System.out.println(JSON_TEXT);
    }
}
