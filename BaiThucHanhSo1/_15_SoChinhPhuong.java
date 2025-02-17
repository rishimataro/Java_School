package BaiThucHanhSo1;

public class _15_SoChinhPhuong {
	static boolean isCP(int n) {
		int sqrtN = (int) Math.sqrt(n);
	    return sqrtN * sqrtN == n;
	}
	public static void main(String[] args) {
        System.out.println(isCP(9));
        System.out.println(isCP(10));
        System.out.println(isCP(16));
        System.out.println(isCP(25));
        System.out.println(isCP(-4));
	}
}
