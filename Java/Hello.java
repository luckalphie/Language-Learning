import java.lang.String;

public class Hello {
    public static final String EMPTY = "";

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(String.format("Java: Hello World! No.%d", i));
        }

        compareString();
    }

    private static void compareString() {
        String str1 = null;
        String str2 = "";
        String str3 = " ";
        String str4 = "123";

        System.out.println(EMPTY.equals(str1));
        System.out.println(EMPTY.equals(str2));
        System.out.println(EMPTY.equals(str3));
        System.out.println(EMPTY.equals(str4));
    }
}

// javac Hello.java && java -classpath ./ Hello