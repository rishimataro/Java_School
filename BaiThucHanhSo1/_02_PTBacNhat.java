package BaiThucHanhSo1;

public class _02_PTBacNhat {
	static void PTBacNhat(double a, double b) {
		if(a==0) {
			if(b==0) System.out.println("Phương trình vô số nghiệm");
			else System.out.println("Phương trình vô nghiệm");
		}
		else System.out.println("Phương trình có 1 nghiệm duy nhất là: " + -b/a);
	}
	public static void main(String[] args) {
		System.out.print("3x + 4 = 0: "); PTBacNhat(3, 4);
		System.out.print("-9x - 18 = 0: "); PTBacNhat(-9, -18);
		System.out.print("0x + 10 = 0: "); PTBacNhat(0, 10);
		System.out.print("0x + 0 = 0: "); PTBacNhat(0, 0);
	}
}
