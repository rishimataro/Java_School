package BaiThucHanhSo1;

public class _08_Tong1TrenN {
	static double tong1trenN(int n) {
		double sum = 1;
		for(int i = 2; i <= n; i++) {
			sum+=1.0/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(tong1trenN(5));
	}
}
