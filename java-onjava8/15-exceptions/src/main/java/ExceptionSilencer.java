public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
// Using 'return' inside the finally block
// will silence any thrown exception.
            System.out.println("11111");
            return;
        }
    }
}
