import java.io.IOException;

public class ThrowsExample {

    static void test() throws IOException {
        throw new IOException("IO Exception");
    }

    public static void main(String[] args) {

        try {
            test();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}