//Question 4 Nfactorial;

public class NFactorial {

    public NFactorial() {
    }

    public static void main(String[] args) {

        long N = 10;

        long factorial = 1;

        if (N == 0) {
            factorial = 1;
        }
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println(N + "! = " + factorial);
    }
}