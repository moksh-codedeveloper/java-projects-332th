public class projects02 {
	static class Register {
		int height;
		int width;
		int length;
		String name;

		Register(int h, int w, int l, String n) {
			this.height = h;
			this.width = w;
			this.length = l;
			this.name = n;
		}

		void display() {
			System.out.println(height + "\t" + width + "\t" + length + "\t" + name);
		}
	}

	public static void main(String[] args) {
		Register r1 = new Register(10, 20, 30, "Moksh");
		Register r2 = new Register(10, 20, 80, "Yashmi");
		Register r3 = new Register(10, 20, 60, "Neha");
		Register r4 = new Register(10, 20, 35, "Riya");
		Register r5 = new Register(10, 20, 33, "Chapri");
		Register r6 = new Register(10, 20, 40, "Mansi");
		r1.display();
		r2.display();
		r3.display();
		r4.display();
		r5.display();
		r6.display();
	}

}
