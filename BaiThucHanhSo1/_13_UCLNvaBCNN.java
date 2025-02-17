package BaiThucHanhSo1;

public class _13_UCLNvaBCNN {
	static int UCLN(int a, int b) {
		if(b == 0) return a;
		return UCLN(b, a%b);
	}
	static int BCNN(int a, int b) {
		return Math.abs(a*b)/UCLN(a, b);
	}
	public static void main(String[] args) {
		System.out.println(UCLN(12, 18));
		System.out.println(BCNN(12, 18));
	}
}
