package nl.openweb.pizza.jdk;

/**
 * @see <a href="https://openjdk.java.net/jeps/358">JEP 358</a>
 */
public class Nullpointers {

    public static void main(String[] args) {
        String s = null;
        int l = s.length();
    }
}
