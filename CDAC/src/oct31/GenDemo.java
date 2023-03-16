package oct31;
class NonGen{
	int num;
	void set(int num) {
		this.num=num;
	
	}
	int get() {
		return num;
		
	}
}
class NonGen1{
	double num;
	void set(double num) {
		this.num=num;
	}
	double get() {
		return num;
	}
}
public class GenDemo {

	public static void main(String[] args) {
		NonGen r = new NonGen();
		r.set(200);
		NonGen1 n = new NonGen1();
		n.set(3949);
		System.out.println(r.get());
		System.out.println(n.get());
	}

}
