package BaiThucHanhSo1;

public class _01_Max3 {
	static int max3_1(int a, int b, int c) {
		if(a>=b && a>=c) return a;
		else if(b>=c) return b;
		else return c;
	}
	
	static int max3_2(int a, int b, int c) {
		return (a>=b && a>=c) ? a : ((b>=c) ? b : c);
	}

	public static void main(String[] args) {
		System.out.println("  9, 8, 10: " + max3_1(9,8,10));
		System.out.println("  -10, 8, -1: " + max3_2(-10,9,-1));
	}
}
