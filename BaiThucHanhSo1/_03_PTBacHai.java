package BaiThucHanhSo1;

public class _03_PTBacHai {
	static void PTBacHai(double a, double b, double c) {
		double denta = b*b - 4*a*c;
		if(denta < 0) System.out.println("Phương trình vô nghiệm");
		else if(denta == 0) System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + (-b/(2*a)));
		else {
			double x1 = (-b + Math.sqrt(denta))/(2*a);
			double x2 = (-b - Math.sqrt(denta))/(2*a);
			System.out.print("Phương trình có 2 nghiệm phân biệt: ");
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		}
	}

	public static void main(String[] args) {
		System.out.print("x^2 - 3x + 2 = 0: "); PTBacHai(1, -3, 2);
		System.out.print("x^2 + 2x + 1 = 0: "); PTBacHai(1, 2, 1);
		System.out.print("x^2 + x + 1 = 0: "); PTBacHai(1, 1, 1);
	}

}
