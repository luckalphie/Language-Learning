import java.lang.String;

public class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(String.format("Java: Hello World! No.%d", i));
        }
    }
}

// javac Hello.java && java -classpath ./ Hello