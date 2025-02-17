package BaiThucHanhSo1;

public class _07_NgayThangNam {
	static boolean isNhuan(int y) {
		return ((y%4 == 0 && y%100 != 0) || y%400 == 0) ? true : false;
	}
	
	static int findDay(int m, int y) {
		if(y < 1900 || m < 1 || m > 12) return -1;
		int d;
		if (m == 2) {
			if (isNhuan(y)) d=29;
			else d=28;
		}
		else if (m == 4 || m == 6 || m == 9 || m == 11) d=30;
		else d=31;
		return d;
	}
	static void display(int m , int y) {
		int d = findDay(m, y);
		if(d == -1) System.out.println("Lỗi ngày/tháng!");
		else System.out.println("Ngày " + d + " tháng " + m + " năm " + y);
	}
	public static void main(String[] args) {
		display(2, 2000);
		display(2, 2025);
		display(19, 2024);
	}
}
