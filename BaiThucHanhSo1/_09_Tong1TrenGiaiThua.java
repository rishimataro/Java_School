package BaiThucHanhSo1;

public class _09_Tong1TrenGiaiThua {
	static double tong1trenGiaiThua(int n) {
		double sum = -1, gt = 1;
		
		for(int i = 2; i <= n; i++) {
			gt *= i;
			if(i%2 == 0) sum+=1.0/gt;
			else sum-=1.0/gt;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(tong1trenGiaiThua(5));
	}
}
