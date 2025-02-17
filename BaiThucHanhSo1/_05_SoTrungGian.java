package BaiThucHanhSo1;

public class _05_SoTrungGian {
	static int min3(int a, int b, int c) {
		return (a<b && a<c) ? a : (b<c ? b : c);
	}
	static int soTrungGian(int a, int b, int c) {
		int max = _01_Max3.max3_2(a, b, c);
		int min = min3(a, b, c);
		if(min < a && a < max) return a;
		if(min < b && b < max) return b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println(soTrungGian(1, 2, 3));
		System.out.println(soTrungGian(-10, 8, -9));
		System.out.println(soTrungGian(0, -1, 100));
	}
}
