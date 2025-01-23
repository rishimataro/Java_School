package BaiTapTrenLop;

class Student {
//	thuộc tích các đối tượng của lớp
	int id;
	String name;
	
//	phương thức chèn thông tin sinh viên
	public void input(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	phương thức thay đổi thông tin sinh viên
	public void changeInfor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	phương thức hiển thị thông tin sinh viên
	public void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		Student sv1 = new Student();
		Student sv2 = new Student();
		
		sv1.input(1, "Ngọc Thảo");
		sv2.input(2, "Lươn Phước");
		
		sv1.display();
		sv2.display();
		
		sv2.changeInfor(3, "Lương Phước");
		
		sv1.display();
		sv2.display();
	}
}
