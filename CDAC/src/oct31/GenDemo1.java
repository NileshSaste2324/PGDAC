package oct31;
class Gen<T>{
	T t;
	void set(T t) {
		this.t=t;
	}
	T get() {
		return t;
	}
}
public class GenDemo1 {

	public static void main(String[] args) {
		Gen<Integer> r = new Gen<>();
		r.set(200);
 		System.out.println(r.get());
		Gen<Double> n = new Gen<>();
		n.set(3434.43);
 		System.out.println(n.get());
	}

}
