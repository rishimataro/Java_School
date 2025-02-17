package BaiThucHanhSo1;

public class _12_TongVaTichChuSo {
	static void TongVaTich(int n) {
		int sum = 0, mul = 1;
		int d, t = n;
		while (n != 0) {
			d = n%10;
			sum += d;
			mul *= d;
			n /= 10;
		}
		System.out.println("Sum " + t + " : " + sum);
		System.out.println("Mul " + t + " : " + mul);
	}
	
	public static void main(String[] args) {
		TongVaTich(234);
		TongVaTich(1928);
	}
}
