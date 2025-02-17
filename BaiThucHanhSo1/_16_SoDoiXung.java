package BaiThucHanhSo1;

public class _16_SoDoiXung {
	static boolean isDX(int n) {
		int temp = n;
		int rev= 0;
		while(n > 0) {
			rev = rev*10 + n%10;
			n/=10;
		}
		return temp == rev;
		
	}
	public static void main(String[] args) {
		System.out.println(isDX(2332));
        System.out.println(isDX(12321));
        System.out.println(isDX(1234));
        System.out.println(isDX(1));
	}
}
