package BaiThucHanhSo1;

public class _20_Fibonacci_ver2 {
    static int fibo(int n) {
        if (n == 0 || n == 1) return n;

        long f0 = 0, f1 = 1, fn;
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            if (fn == n) return i;
            f0 = f1;
            f1 = fn;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = fibo(144);
        if (index != -1)
            System.out.println("144 thuộc dãy Fibonacci, ở vị trí số " + index);
        else
            System.out.println("144 không thuộc dãy Fibonacci");

        index = fibo(100);
        if (index != -1)
            System.out.println("100 thuộc dãy Fibonacci, ở vị trí số " + index);
        else
            System.out.println("100 không thuộc dãy Fibonacci");
    }
}
