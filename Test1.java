public class Test1 {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        square(5);  // calling it, but not using the result
        System.out.println("Program finished without using the result.");
    }
}
