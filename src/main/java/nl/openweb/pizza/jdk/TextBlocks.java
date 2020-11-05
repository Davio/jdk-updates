package nl.openweb.pizza.jdk;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextBlocks {

    private static final String JSON_TEXT = """
            {
                "name": "Dave"
                "job": "developer"
            }
            """;

    public static void main(String[] args) {
        log.info("\n{}", JSON_TEXT);
    }
}
