package BaiThucHanhSo1;

public class _18_SoHoanHaoNhoHon1000 {
	static int tongUocSo(int n) {
		int sum = 1;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				sum+=i;
				if(i!=n/i) sum+=n/i;
			}
		}
		return sum;
	}
	static void timSoHoanHao(int n) {
		for(int i = 2; i <= n; i++) {
			if(tongUocSo(i) == i) System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		timSoHoanHao(1000);
		timSoHoanHao(10000);
	}
}
