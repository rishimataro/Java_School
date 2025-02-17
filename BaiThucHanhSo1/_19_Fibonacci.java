package BaiThucHanhSo1;

public class _19_Fibonacci {
	static void fibo(int n) {
		if(n == 0) System.out.print("0");
		else {
			System.out.print("0 1 ");
			long f0 = 0, f1 = 1, fn;
			for(int i = 2; i < n; i++) {
				fn = f0 + f1;
				System.out.print(fn + " ");
				f0 = f1;
				f1 = fn;
			}
		}
	}

	public static void main(String[] args) {
		fibo(20);
	}
}
