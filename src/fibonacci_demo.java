public class fibonacci_demo {
    public static void main(String[] args) {
        int a = 20, first = 0, second = 1;
        for (int i = 1; i <= a; ++i) {
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
