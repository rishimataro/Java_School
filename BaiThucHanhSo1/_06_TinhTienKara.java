package BaiThucHanhSo1;

public class _06_TinhTienKara {
	static long tinhTien(int a, int b) {
		if(a < 0 || a > 23 || b < 0 || b > 23 || a >= b) {
			System.out.println("Lỗi giờ!");
			return -1;
		}
		else {
			long giatien = 0;
			for(int i = a; i < b; i++) {
				if(i<18) giatien+=45000;
				else  giatien+=60000;
			}
			return giatien;
		}
	}
	public static void main(String[] args) {
		System.out.println(tinhTien(5, 15));
		System.out.println(tinhTien(10, 21));
		System.out.println(tinhTien(24, 6));
	}
}