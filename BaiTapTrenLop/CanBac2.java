package BaiTapTrenLop;

public class CanBac2 {
	public double tinhCanBacHai(int m) {
		double n = 0.0;
		n = Math.sqrt(m);
		return n;
	}
	public static void main(String[] args) {
		CanBac2 t = new CanBac2();
		System.out.println("Can bac hai cua 9 la: " + t.tinhCanBacHai(9));
	}
}
