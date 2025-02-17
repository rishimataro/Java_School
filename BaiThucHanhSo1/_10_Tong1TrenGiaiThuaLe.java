package BaiThucHanhSo1;

public class _10_Tong1TrenGiaiThuaLe {
	static double tong1trenGiaiThuaLe(int n) {
		double sum = 1, gt = 1;
		
		for(int i = 2; i <= (2*n-1); i++) {
			gt *= i;
			if(i%2 != 0) sum+=1.0/gt;
			else continue;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(tong1trenGiaiThuaLe(5));
	}
}
