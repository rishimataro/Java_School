package BaiThucHanhSo1;

public class _11_TinhNGiaiThuaDoi {
	static double NGiaiThuaDoi(int n) {
		double gt = 1;
		for(int i = n; i > 1; i -= 2) {
			gt *= i;
		}
		return gt;
	}
	public static void main(String[] arsg) {
		System.out.println(NGiaiThuaDoi(10));
		System.out.println(NGiaiThuaDoi(11));
	}
}
